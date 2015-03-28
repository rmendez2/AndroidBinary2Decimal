package com.example.remix245.mytestapplication;

/**
 * Created by remix245 on 3/23/2015.
 */

public class binary2Decimal {

    static int power = 0;
    static int answer = 0;


    public static int Binary2Dec(String binaryNumber, int power) {

        //if the binary number length is less than 1 return answer
        if (binaryNumber.length() < 1) return answer;
        else {
            //creates a parseint that lets you go back on the substring.
            int num = Integer.parseInt(binaryNumber.substring(binaryNumber.length() - 1));
            //logic for converting from binary to decimal.
            answer += num * (Math.pow(2, power));
            return Binary2Dec(binaryNumber.substring(0, binaryNumber.length() - 1), power + 1);
        }
    }

    /*
    method to convert integer to String
     */
    public string integerToBinary(int number) {

        return Integer.toBinaryString(number);

    }

    public static int binaryToDecimal(int number) {

        int binaryNumber = number;
        int power = 0;
        int decimalNumber = 0;

        while (binaryNumber != 0) {
            int lastDigit = binaryNumber % 10;
            decimalNumber += lastDigit * Math.pow(2, power);
            power++;
            binaryNumber = binaryNumber / 10;
        }
        return decimalNumber;
    }


}

}
