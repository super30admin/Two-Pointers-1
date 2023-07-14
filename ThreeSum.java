// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {

    List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> threeSum(int[] nums) {


        Arrays.sort(nums);


        for(int i = 0; i < nums.length; i++)
        {
            int a = nums[i];


            // Checking Duplicate a

            if(i == 0 || nums[i] !=nums[i-1])
                two_sum_sorted(i + 1, nums.length - 1, nums, 0 - a);
        }

        return result;

    }



    void two_sum_sorted(int i, int j, int nums[], int target)
    {
        int a1 = i - 1;

        while(i < j)
        {
            if(nums[i] + nums[j] < target)
            {
                i++;              // We want a greater number
            }

            else if(nums[i] + nums[j] > target)
            {
                j--;
            }

            else
            {
                List <Integer> list1 = new ArrayList();

                // Storing the numbers in list1 that add upto zero
                list1.add(nums[a1]);
                list1.add(nums[i]);
                list1.add(nums[j]);

                result.add(list1);

                while(i < j && nums[i] == nums[i+1])
                    i++;
                while(i < j && nums[j] == nums[j-1])
                    j--;

                i++;
                j--;

            }
        }

    }




}