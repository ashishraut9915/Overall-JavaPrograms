
public class BinaryAddition {
    public static void main(String[] args) {
        // Binary numbers as strings
        String binary3Byte = "110";
        String binary4Byte = "1010";

        // Convert binary strings to integers
        int decimal3Byte = Integer.parseInt(binary3Byte, 2);
        int decimal4Byte = Integer.parseInt(binary4Byte, 2);

        // Add the integers
        int sum = decimal3Byte + decimal4Byte;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Display the result
        System.out.println("Binary 3-Byte: " + binary3Byte);
        System.out.println("Binary 4-Byte: " + binary4Byte);
        System.out.println("Sum: " + binarySum);
    }
}
