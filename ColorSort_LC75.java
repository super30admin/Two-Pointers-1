 // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public void sortColors(int[] nums) {
        
        //set 3 pointers for 0's as low, 1's as mid and 2's as high
        
        int low=0;
        int high = nums.length-1;
        int mid =0;
        int temp = 0;
        //move mid untill end
        while(mid<=high)
        {
            // 3conditions to check - if mid =0, mid = 1 , and mid = 2
            
            //if mid = 2, swap with high and move high -1
      if(nums[mid]==2){
          temp=nums[mid];
          nums[mid] = nums[high];
          nums[high]= temp;
          high--;
          
      }
            //if mid =0,swap with low and move low +1 and mid +1
          else if(nums[mid]==0){
              temp = nums[low];
              nums[low]=nums[mid];
              nums[mid]= temp;
              mid++;
              low++;
            
          } 
            //when mid=1 , move mid +1
     else{
                mid++;
            }
            
            }
        }
    }
