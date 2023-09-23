package Manage;

import java.util.Scanner;

public class CheckInput {
    private final static Scanner in = new Scanner(System.in);

    // check user input number limit
    public int checkInputIntLimit(int min, int max) {
        // loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputBinary() {
        String binaryInput;
        boolean isValid;

        do {
            System.out.print("Enter a binary number: ");
            binaryInput = in.nextLine();

            // Kiểm tra xem chuỗi có chứa chỉ các ký tự 0 và 1 không
            isValid = binaryInput.matches("[01]+");

            if (!isValid) {
                System.out.println("Invalid binary input. Please enter a valid binary number.");
            }
        } while (!isValid);

        return binaryInput;
    }

    public int checkInputDecimal() {
        int decimalInput = 0;
        boolean isValid = false;

        do {
            System.out.print("Enter a decimal number: ");
            try {
                decimalInput = Integer.parseInt(in.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid decimal input. Please enter a valid decimal number.");
            }
        } while (!isValid);

        return decimalInput;
    }

    public String checkInputHexaDecimal() {
        String hexaInput;
        boolean isValid;

        do {
            System.out.print("Enter a hexadecimal number: ");
            hexaInput = in.nextLine();

            // Kiểm tra xem chuỗi có chứa chỉ các ký tự từ 0-9 và a-f (hoặc A-F) không
            isValid = hexaInput.matches("[0-9a-fA-F]+");

            if (!isValid) {
                System.out.println("Invalid hexadecimal input. Please enter a valid hexadecimal number.");
            }
        } while (!isValid);

        return hexaInput;
    }
}
