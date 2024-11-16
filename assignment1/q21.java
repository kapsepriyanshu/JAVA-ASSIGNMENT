class BinaryDecimalConversion {
    public static void main(String[] args) {
        int binary = 1010, decimal = 0, power = 0;
        int tempBinary = binary;
        while (tempBinary > 0) {
            int digit = tempBinary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            tempBinary /= 10;
        }
        System.out.println("Binary to Decimal: " + decimal);

        int decimalNumber = 10, binaryResult = 0, place = 1;
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryResult += remainder * place;
            place *= 10;
            decimalNumber /= 2;
        }
        System.out.println("Decimal to Binary: " + binaryResult);
    }
}
