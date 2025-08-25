//Time Complexity: O(n^2)(nlogn for sorting and n^2 for two pointer approach but higher order term is taken so O(n^2))
//Space Complexity: O(1)
//Did this code successfully run on Leetcode : Yes
//did you face any problem while coding this : No

/**
 * We traverse through the array using the outer for loop and at each iteration we fix the first element of the triplet. Later we traverse through the entire array using two pointers like in two sum.
 * The two pointers will help us find the other two elements of the triplet that sum up to zero when paired with nums[i].
 * We also skip the duplicate elements to avoid duplicate triplets in the result.
 * If one of the elements is greater than zero, we break the loop as the array is sorted and there won't be any triplet with sum zero beyond this point.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> threeSum=new ArrayList();
        Arrays.sort(nums);

        int n=nums.length;

        for (int i=0;i<n;i++)
        {

            if(i>0&&nums[i]==nums[i-1]){continue;}
            if(nums[i]>0){break;}
            int low=i+1;
            int high=n-1;

            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                
                if(sum==0)
                {
                    List<Integer> Triplet=Arrays.asList(nums[i],nums[low],nums[high]);
                    threeSum.add(Triplet);
                    low++;
                    high--;

                    while(low<high&&nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1] )
                    {
                        high--;
                    }
                    
                }
                if(sum<0)
                {  
                    low++; 
                }
                if(sum>0)
                {  
                    high--; 
                }
            }
        }
        return threeSum;
        
    }
}