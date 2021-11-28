package Assignment_23_Nov_2021;

import java.util.Scanner;

public class LastElementOfArray {
    static int findLastElemt(int arr[]){
        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the Length of the array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++){
            System.out.print("Ener the " + i + " element" + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Last element in the array is : " + findLastElemt(arr));
        sc.close();
    }
}
