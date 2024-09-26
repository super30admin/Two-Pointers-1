//Time Complexity: O(n^2)
//Space Complexity: O(1)
//Run successfully on leetcode
//No problem

//Here we will be fixing one element at a time and using two pointers to find its complement sum in the remaining array elements

import java.util.*;

public class Two_Pointers_1_Problem_2_3sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        HashSet<List<Integer>> ar = new HashSet<>();
        for(int i = 0 ; i < nums.length - 2  ; i ++)
        {
            if(i > 0 && (nums[i]==nums[i-1]))
            {
                continue;
            }
            int low = i + 1;
            int high = nums.length -1;
            while(low<high)
            {
                if(nums[i] + nums[low] + nums[high] == 0)
                {
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    arr.add(nums[i]);
                    arr.add(nums[low]);
                    arr.add(nums[high]);
                    Collections.sort(arr);
                    ar.add(arr);
                    low++;
                    high--;
                }else if(nums[i] + nums[low] + nums[high] < 0)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        System.out.println(ar);
        return new ArrayList<List<Integer>>(ar);
    }

    public static void main(String[] args) {
        int[] a = {0,0,0};
        threeSum(a);

    }
}
