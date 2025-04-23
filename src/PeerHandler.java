import java.io.*;
import java.net.*;

public class PeerHandler implements Runnable {
    private Socket socket;
    private int myPeerID;

    public PeerHandler(Socket socket, int myPeerID) {
        this.socket = socket;
        this.myPeerID = myPeerID;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // Send handshake
            os.write(Handshake.create(myPeerID));

            // Receive handshake
            byte[] handshake = new byte[32];
            is.read(handshake);
            int remotePeerID = Handshake.parse(handshake);
            System.out.println("Handshake completed with peer: " + remotePeerID);

            // Bitfield exchange, messages, etc. to be added here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}