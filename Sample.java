import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Sort colors
//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        //take 3 pointer 1 for left one for right one for mid 
        //run loop till mid crosses right 
        int left =0;
        int right = nums.length-1;
        int mid = 0;
        while(mid <= right){
            //if mid starts from left +1 so if it is pointing at value 2 it will swap the element pointed by right pointer
            if(nums[mid]==2){
                 swap(nums,right,mid);
                right--;
              
            }
            //if mid is pointing to 0 it will swap with left pointer
            else if(nums[mid]==0){
                 swap(nums,left,mid);
                left++;
                mid++;
            }
            //if mid is pointing to 1 it simply moves forward
            else{
              
               mid++;
            }
        }
    }
    //swaping two numbers
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//3Sum
//Time Complexity : O(N^2)+O(logn)
//Space Complexity : O(1)
class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
    //resultant array
      List<List<Integer>> result = new ArrayList<>();
      //if less than 3 number return empty array
       if(nums.length < 3) return result;
        //sort array
       Arrays.sort(nums);
       int n = nums.length;
       for(int i = 0; i < n-2; i++){
           if ((i > 0) && (nums[i - 1] == nums[i])) continue;
           int low = i + 1;
           int high = n - 1;
           while (low < high){
               //find sum
               int sum = nums[i] + nums[low] + nums[high];
               //sum is 0 create a list and add the 3 elements and add it to resultant list
               if(sum == 0){
                 List<Integer> current = Arrays.asList(nums[i],nums[low],nums[high]);
                   result.add(current);
                   low++; high--;
                   //if same elements move forward 
                   while(low < high && nums[low] == nums[low-1]) low++;
                   //if same elements move backward
                   while(low < high && nums[high] == nums[high + 1]) high--;
               } 
               //if sum is less than 0 move forward
               else if (sum < 0){ 
                   low++;
               }
                //if sum is greater than 0 move backward
               else { 
              
                   high--;
               }

           }

       }
       return result;
    }
}
//Container With Most Water
//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution2 {
    public int maxArea(int[] height) {
    if(height == null || height.length == 0) return 0;
    int n = height.length;
    //taking two pointer left starts from first index right from last index
    int left = 0,right = n-1;
    //to store maximum amount of water a container can store
    int max = 0;
    //traverse the array
    while(left < right){
        //find area
        int area =Math.min(height[left],height[right])*(right-left);
        //if area is greater than previous max update it
        if(area > max){
        max=area;
        }
        //after updating
        //if left element is smaller than right move forward
        if(height[left] < height[right]){
            left++;
        }
        //else move towards left
        else{
            right--;
        }
    }
    return max;
    }
}