// Time Complexity : O(n^2)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
       
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<n-2;i++)
        {
            if(nums[i] > 0)
            {
                break;
            }
            // outside duplicacy
            if(i!= 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int first = nums[i];
            int l =i+1;
            int r = n-1;
            while(l<r)
            {
            int sum = first + nums[l] + nums[r];
            if(sum == 0)
            {
                //got the triplet
                result.add(Arrays.asList(first,nums[l],nums[r]));
                l++;
                r--;
                while(l<r && nums[l] == nums[l-1])
                {
                    l++;
                }
                while(l<r && nums[r] == nums[r+1])
                {
                    r--;
                }
            }
            else if(sum<0)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
    }
    return result;
}
public static void main(String[] args)
{
    int[] array = {-1,0,1,2,-1,-4}; 
    ThreeSum t = new ThreeSum();
    List<List<Integer>> result = t.threeSum(array);
    System.out.println(result.toString());
}
}
