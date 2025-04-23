import java.nio.ByteBuffer;
import java.util.Arrays;

public class Handshake {
    public static final String HEADER = "P2PFILESHARINGPROJ";
    public static final int LENGTH = 32;

    public static byte[] create(int peerID) {
        ByteBuffer buffer = ByteBuffer.allocate(LENGTH);
        buffer.put(HEADER.getBytes());
        buffer.put(new byte[10]);
        buffer.putInt(peerID);
        return buffer.array();
    }

    public static int parse(byte[] data) {
        String header = new String(Arrays.copyOfRange(data, 0, 18));
        if (!header.equals(HEADER))
            return -1;
        return ByteBuffer.wrap(data, 28, 4).getInt();
    }
}