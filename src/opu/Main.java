package opu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task8();
        //Task31();
        Task54();
    }

    /**
     * Дано целое число N (> 0) и символ C. Вывести строку длины N, которая состоит из символов C.
     */
    public static void Task8(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of cymbal ( >0 ): ");
        int count = in.nextInt();

        System.out.println("Enter cymbal: ");
        Scanner str = new Scanner(System.in);
        String cymbal = str.nextLine();

        for (int i = 0; i < count; i++){
            System.out.print(cymbal + ", ");
        }

    }

    /**
     * Даны строки S и S0. Проверить, содержится ли строка S0 в строке S.
     * Если содержится, то вывести True, если не содержится, то вывести False.
     */
    public static void Task31(){
        System.out.println("Enter text: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.println("Enter what you want to find: ");
        String find = in.nextLine();
        System.out.println(text.contains(find));
    }

    /**
     * Дана строка-предложение заданное кириллицей.
     * Подсчитать количество содержащихся в строке гласных букв.
     */
    public static void Task54(){
        System.out.println("Enter text: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.toLowerCase();
        char[] vocals = new char[]{'е','у','а','о','я','и','ы','э'};
        int count = 0;
        char[] char_text = text.toCharArray();


        for (int i = 0; i< char_text.length; i++){
            for (int k = 0; k < vocals.length; k++){
                if (char_text[i] == vocals[k]){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
