package Java;

public class NibbleExtractor {

	public static void main(String[] args) {

		byte value = (byte)0xAB;

		int lowerNibble = value & 0x0F;

		int higherNibble = (value & 0xF0) / 16;

		System.out.println(" Byte Value: 0x" + Integer.toHexString(value & 0xFF).toUpperCase());
		System.out.println("Higher Nibble: 0x" + Integer.toHexString(higherNibble).toUpperCase());
		System.out.println("Lower Nibble : 0x" + Integer.toHexString(lowerNibble).toUpperCase());

	}

}
