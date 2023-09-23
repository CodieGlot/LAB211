package Manage;

import static java.lang.System.exit;
import view.Menu;

public class Convert_Management extends Menu<String> {
    private CheckInput checkInput;
    static String[] mc = { "Convert from Binary", "Convert from Decimal", "Convert from Hexadecimal", "Exit" };

    public Convert_Management() {
        super("Convert_Management", mc);
        checkInput = new CheckInput();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 -> convertFromBinary();
            case 2 -> convertFromDecimal();
            case 3 -> convertFromHexa();
            case 4 -> exit(0);
            default -> System.out.println("Try again");
        }
    }

    // Function to display conversion options
    public int displayConvert(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert from " + from + " to " + toCase1);
        System.out.println("2. Convert from " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
        return checkInput.checkInputIntLimit(1, 2);
    }

    // Function to allow user to convert from binary
    public void convertFromBinary() {
        String binary = checkInput.checkInputBinary();
        int choice = displayConvert("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1 -> System.out.println("Decimal: " + convertBinaryToDecimal(binary));
            case 2 -> System.out.println("Hexadecimal: " + convertBinaryToHexa(binary));
        }
    }

    // Function to allow user to convert from decimal
    public void convertFromDecimal() {
        int decimal = checkInput.checkInputDecimal();
        int choice = displayConvert("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1 -> System.out.println("Binary: " + convertDecimalToBinary(decimal));
            case 2 -> System.out.println("Hexadecimal: " + convertDecimalToHexa(decimal));
        }
    }

    // Function to allow user to convert from hexadecimal
    public void convertFromHexa() {
        String hexa = checkInput.checkInputHexaDecimal();
        int choice = displayConvert("hexadecimal", "binary", "decimal");
        switch (choice) {
            case 1 -> System.out.println("Binary: " + convertHexaToBinary(hexa));
            case 2 -> System.out.println("Decimal: " + convertHexaToDecimal(hexa));
        }
    }

    // Function to convert binary to decimal
    public int convertBinaryToDecimal(String binary) {
        try {
            return Integer.parseInt(binary, 2);
        } catch (NumberFormatException e) {
            System.err.println("Invalid binary input. Please enter a valid binary number.");
            return -1;
        }
    }

    // Function to convert binary to hexadecimal
    public String convertBinaryToHexa(String binary) {
        int decimalValue = convertBinaryToDecimal(binary);
        if (decimalValue == -1) {
            return "Invalid binary input";
        }
        return Integer.toHexString(decimalValue).toUpperCase();
    }

    // Function to convert hexadecimal to decimal
    public int convertHexaToDecimal(String hexa) {
        try {
            return Integer.parseInt(hexa, 16);
        } catch (NumberFormatException e) {
            System.err.println("Invalid hexadecimal input. Please enter a valid hexadecimal number.");
            return -1;
        }
    }

    // Function to convert hexadecimal to binary
    public String convertHexaToBinary(String hexa) {
        int decimalValue = convertHexaToDecimal(hexa);
        if (decimalValue == -1) {
            return "Invalid hexadecimal input";
        }
        return Integer.toBinaryString(decimalValue);
    }

    // Function to convert decimal to binary
    public String convertDecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Function to convert decimal to hexadecimal
    public String convertDecimalToHexa(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
}
