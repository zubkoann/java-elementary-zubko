package com.zubko.homework.hm_03;

public class Binary {
    public static void main(String[] args) {
        int i = 33;

        /**
         * CHECK
         */
//число 232 в двоичной системе
        String binary = Integer.toBinaryString(i);
        System.out.println(binary);
//обратыный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt(binary, 2));


        /**
         * RUN METHODS
         */
        getBinaryFromDecimal(i);
        getDecimalFromBinary(binary);
    }

    public static void getBinaryFromDecimal(int num) {
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(num % 2);
            num = num / 2;
        } while (num != 0);
        System.out.println(sb.reverse());
    }

    public static void getDecimalFromBinary(String binary) {
        int res = 0;
        int a = 0;
        int mult = 0;
        char[] symbols = binary.toCharArray();
        for (int len = symbols.length - 1; len >= 0; len--) {
            int temp = 0;
            a = Character.getNumericValue(symbols[len]);
            temp = (int) (a * Math.pow(2, mult));
            mult++;
            res += temp;
        }
        System.out.println(res);

    }
}
