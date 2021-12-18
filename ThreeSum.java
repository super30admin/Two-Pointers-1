// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0||nums==null){
            return new ArrayList<>();
        }
        List<List<Integer>>res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int low=i+1;
            int high=n-1;
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){continue;}
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer>li=new ArrayList<Integer>();
                    li.add(nums[i]); li.add(nums[low]); li.add(nums[high]);
                    res.add(li);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        ThreeSum obj=new ThreeSum();
        int nums[]={-1,0,1,2,-1,-4};
        obj.threeSum(nums);
    }
}
