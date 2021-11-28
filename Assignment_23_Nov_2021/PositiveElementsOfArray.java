package Assignment_23_Nov_2021;

import java.util.Scanner;

public class PositiveElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the Length of the array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++){
            System.out.print("Ener the " + i + " element" + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The positive elements of Array are : ");
        for(int i = 0; i < l; i++){
            if(arr[i] > 0){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
