import java.io.*;

public class Message {
    public static byte[] createMessage(int type, byte[] payload) {
        int length = (payload == null) ? 1 : payload.length + 1;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (DataOutputStream out = new DataOutputStream(outputStream)) {
            out.writeInt(length);
            out.writeByte(type);
            if (payload != null) {
                out.write(payload);
            }
            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}