package Assignment_24_Nov_2021;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the sentence :");
        str = sc.nextLine();
        String search = "";
        System.out.println("Enter the word to be searched : (Remember Java is Case Sensitive!!)");
        search = sc.nextLine();
        int idx = str.indexOf(search);
        if (idx == -1)
            System.out.println("Word not found!");
        else
            System.out.println("Word found at index : " + idx);
    }
}