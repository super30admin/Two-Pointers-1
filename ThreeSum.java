/**
 * Time Complexity -
 * Sort Array O(nlogn) ,
 * for every element we are finding two sum so it would be O(n^2)
 * Overall Time Complexity - O(n^2) as O(n^2) > O(nlogn)
 * Space Complexity - O(1) as list variable is used a result so it is ignored from considering it for space
 */


//Space Complexity -
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || nums[i]!=nums[i-1])
            {
                twoSum(nums,i,list);
            }
        }
        return list;
    }

    public void twoSum(int[] nums,int i,List<List<Integer>> list)
    {
        int left=i+1;
        int right=nums.length-1;
        while(left<right)
        {

            int sum=nums[left]+nums[right]+nums[i];

            if(sum>0)
            {
                right--;
            }
            else if(sum <0)
            {
                left++;
            }
            else
            {
                list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1])
                {
                    left+=1;
                }

            }
        }

    }
}