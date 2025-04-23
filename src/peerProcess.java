import java.io.*;
import java.net.*;

public class peerProcess {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java peerProcess <peerID>");
            return;
        }

        int myPeerID = Integer.parseInt(args[0]);

        try (BufferedReader br = new BufferedReader(new FileReader("config/PeerInfo.cfg"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                int id = Integer.parseInt(parts[0]);
                String host = parts[1];
                int port = Integer.parseInt(parts[2]);

                if (id == myPeerID) {
                    // This is the current peer; start listener
                    new Thread(() -> listen(port, myPeerID)).start();
                } else if (id < myPeerID) {
                    // Connect to peers with lower IDs
                    new Thread(() -> connect(host, port, myPeerID)).start();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listen(int port, int myPeerID) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Peer " + myPeerID + " listening on port " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new PeerHandler(socket, myPeerID)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void connect(String host, int port, int myPeerID) {
        try {
            Socket socket = new Socket(host, port);
            new Thread(new PeerHandler(socket, myPeerID)).start();
        } catch (IOException e) {
            System.out.println("Connection failed to " + host + ":" + port);
        }
    }
}
