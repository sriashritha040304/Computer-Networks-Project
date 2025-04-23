public class Bitfield {
    private byte[] bits;

    public Bitfield(int totalPieces, boolean hasAll) {
        int length = (int) Math.ceil(totalPieces / 8.0);
        bits = new byte[length];
        if (hasAll) {
            for (int i = 0; i < bits.length; i++)
                bits[i] = (byte) 0xFF;
        }
    }

    public byte[] getBytes() {
        return bits;
    }

    public void setPiece(int index) {
        bits[index / 8] |= (1 << (7 - (index % 8)));
    }

    public boolean hasPiece(int index) {
        return (bits[index / 8] & (1 << (7 - (index % 8)))) != 0;
    }
}