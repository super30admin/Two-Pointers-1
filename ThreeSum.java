// Time Complexity : O(N^2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

/*

Similar to Two Sum problem, we sort array and take sum of current element,
next element(left) and last element(right). If the sum is 0 we create a new 
list of the three numbers and add it to hashset since we need to return unique list.
If not, then we iterate accordingly.

*/

import java.util.*;
public class ThreeSum {
    

    public static List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for(int i =0;i<n-2;i++)
        {
            int left = i+1;
            int right = n-1;

            while(left<right)
            {
                int currentSum = nums[i]+nums[left]+nums[right];

                if(currentSum==0)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    left++;
                    right--;
                }
                else if(currentSum<0)
                {
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String args[])
    {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        for(List<Integer> list:ans)
        {   

            System.out.println(list);

        }
    }
}
