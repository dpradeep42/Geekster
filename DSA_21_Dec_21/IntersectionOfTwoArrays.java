package DSA_21_Dec_21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution2 s = new Solution2();
        System.out.print("Enter the size of the first Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second Array : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter the Array elements : ");
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The intersection is " + Arrays.toString(s.intersection(arr, arr2)));
        sc.close();
    }
}

class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> first = new HashSet<Integer>();
        for(int i: nums1){
            first.add(i);
        }
        
        HashSet<Integer> common = new HashSet<Integer>();
        for(int i: nums2){
            if(first.contains(i)){
                common.add(i);
            }
        }
        
        int[] res = new int[common.size()];
        int index = 0;
        for(int i: common){
            res[index++] = i;
        }
        
        return res;
    }
}