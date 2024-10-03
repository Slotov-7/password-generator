import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;



public class GerarSenha {

    public static void main(String[] args) {

        int qtdCaracteres;

        String[] caracteres = new String[] { "0", "1", "2", "4", "5", "6",

                "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i",

                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",

                "v", "w", "x", "y", "z", "ç", "@", "$", "&", "*", "A", "B",

                "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",

                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",

                "&", "!", "/", "+", ".", "-", "_", "(", ")", "{", "}", "[",

                "]", ";", ":", "<", ">", ",", "£"};



        Scanner sr = new Scanner(System.in);

        Random rom = new Random();

        System.out.println("Digite o tamanho da senha: ");

        qtdCaracteres = sr.nextInt();

        String[] senha = new String[0];

        sr.close();

        for(int i = 1; i <= qtdCaracteres; i++) {

            int posicao = rom.nextInt(caracteres.length);

            senha = Arrays.copyOf(senha, senha.length + 1);

            senha[senha.length - 1] = caracteres[posicao];

        }



        System.out.println(String.join("", senha));





    }

}