//  ## Problem 1

// ## Problem1 (https://leetcode.com/problems/sort-colors/

//Did this code run on leetcode :Yes

// Time complexity: O(n)
// Space complexity: O(1) 
// Idea- to maintain 3 pointers - low, mid and high -swap 0 , 2 

class Solution {
public:
    void sortColors(vector<int>& nums) {
     
        if(nums.size()==0){
            return;
        }
        
        int low =0;
        int high = nums.size()-1;
        int mid=0;
        
        while(mid<=high){
            
            if(nums[mid]==0 ){ //swap mid and low
                int temp = nums[mid];
                nums[mid] =nums[low];
                nums[low]= temp;
                
                mid++;
                low++;
            }
                
           else if(nums[mid]==2){ //swap mid and high
                int temp= nums[mid];
                nums[mid] = nums[high];
                nums[high]= temp;
               
               high--;
            }
           else{
               mid++;
           }
        }
    }
};