//time complexity:O(n^2)
//space complexity:O(1)
import java.util.*;
public class tsum {
        public List<List<Integer>> threeSum(int[] nums)
        {
            if(nums==null || nums.length==0)
            {
                return new ArrayList<>();
            }
            Arrays.sort(nums);
            List<List<Integer>> result= new ArrayList<>();
            int n=nums.length;

            for(int i=0;i<n;i++)
            {
                if(i>0 && nums[i]==nums[i-1])
                {
                    continue;
                }
                if(nums[i]>0)
                {
                    break;
                }
                int left=i+1;
                int right=n-1;

                while(left< right)
                {
                    int sum=nums[i]+nums[left]+nums[right];
                    if(sum==0)
                    {
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left< right && nums[left]==nums[left-1])
                        {
                            left++;
                        }
                        while(left< right && nums[right]==nums[right+1])
                        {
                            right--;
                        }
                    }
                    else if(sum<0)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
            return result;
        }
        public static void main(String[] args)
        {
            tsum t= new tsum();
            int[] nums={-1,0,1,2,-1,-4};
            List<List<Integer>> result= new ArrayList<>();
            result=t.threeSum(nums);
            System.out.println(result);
        }
    }

