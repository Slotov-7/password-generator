import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;



public class PasswordGenerator {

    public static void main(String[] args) {

        int qtyCharacters;

        String[] characters = new String[] { "0", "1", "2", "4", "5", "6",

                "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i",

                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",

                "v", "w", "x", "y", "z", "ç", "@", "$", "&", "*", "A", "B",

                "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",

                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",

                "&", "!", "/", "+", ".", "-", "_", "(", ")", "{", "}", "[",

                "]", ";", ":", "<", ">", ",", "£"};

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Enter password length: ");

        qtyCharacters = sr.nextInt();

        String[] password = new String[0];

        sr.close();

        for(int i = 1; i <= qtyCharacters; i++) {

            int position = rom.nextInt(characters.length);

           password = Arrays.copyOf(password, password.length + 1);

            password[password.length - 1] = characters[position];

        }
        System.out.println(String.join("", password));
    }
}
