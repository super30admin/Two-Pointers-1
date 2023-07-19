//3 sum
//Time Complexity:O(n^2)+O(nlogn)
//Space Complexity:O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return null;
        }
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++) //n-1 element will be 3rd to consider while taking sum
        {
            //remove outer duplicacy
            if(i!=0 && nums[i-1]==nums[i])
            {
                continue;
            }
            if(nums[i]>0)
            {
                break;
            }
            int low=i+1;//2nd elment to chk for sum
            //1st elmenet will be i
            int high=n-1;//3rd element for sum
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[low],nums[i],nums[high]));
                    low++;
                    high--;

                    //remove inner duplicacy
                    while(low<high && nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high && nums[low]==nums[low-1])
                    {
                        high--;
                    }
                }
                else if(sum<0)
                {
                    low++;
                }
                else
                {
                    high--;
                }

            }//end while
        }//end for
        return result;
    }
}