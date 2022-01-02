package DSA_20_Dec_21;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution3 s = new Solution3();
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();
        int first_occurance = s.search(arr, target);
        System.out.println(target + " first occured at index " + first_occurance);
        System.out.println("target element occured " + s.count(arr, first_occurance, target) + " times.");
        sc.close();
    }
}

class Solution3 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                break;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        try{
            while (nums[mid] == target)
            mid--;
        }
        catch(ArrayIndexOutOfBoundsException e){
            mid = -1;
        }
        
        return mid + 1;
    }

    public int count(int[] nums, int first_occurance, int target) {
        int count = 0;
        for (int i = first_occurance; i < nums.length; i++) {
            if (nums[i] == target)
                count++;
            else
                break;
        }
        return count;
    }
}
