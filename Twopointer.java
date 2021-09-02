import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Twopointer {
    //time complexity : N
    // space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no 
    //https://leetcode.com/problems/sort-colors/submissions/
    public void sortColors(int[] nums) {
     int low = 0;
     int mid = 0 ;
     int high = nums.length-1;
        while(mid<= high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
            }else{
                mid++;
            }
        }
       
    }
    public void swap(int[] nums,int i , int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }

    //time complexity : N
    // space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no 
    //https://leetcode.com/problems/container-with-most-water/submissions/
    public int maxArea(int[] height) {
        int low = 0;
        int high =height.length-1;
        int max = Integer.MIN_VALUE;
        while(low<high){
            max = Math.max(max,(high-low)*Math.min(height[low],height[high]));
            if(height[low]<=height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }

    //time complexity : N^2
    // space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no 
    //https://leetcode.com/problems/3sum/submissions/
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i =0;i<nums.length-2;i++){
            if(i > 0 && nums[i]==nums[i-1]) continue;
      
            if(nums[i]>0) break;
            int low = i+1;
            int high = nums.length -1 ;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
            if(sum==0){
                List<Integer> l1 = Arrays.asList(nums[i],nums[low],nums[high]);
                result.add(l1);
                low++;
                high--;
                while(low<high && nums[low]==nums[low-1]) low++;
                while(low<high && nums[high]== nums[high+1])high--;
                
            }else if (sum <0){
                low ++;
            }else{
                high --;
               
            }
            }
            

        }
        return result;
    }
}
