// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.*;

public class sortColors {

     public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        int low=0;
        int high=nums.length-1;
        int mid=0;

        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else{mid++;}
        }
    }


private void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}

    public static void main(String[] args) {
        sortColors ts = new sortColors();
        int[] m1= {2,0,2,1,1,0};
        int[] m2=  {2,0,1};
        ts.sortColors(m1);
        ts.sortColors(m2);
        System.out.println(Arrays.toString(m1));// ans = [0,0,1,1,2,2]
        System.out.println(Arrays.toString(m2));// ans = [0,1,2]
    }
}
