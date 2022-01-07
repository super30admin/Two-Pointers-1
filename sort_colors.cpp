// Time Complexity : O(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

void swap(int& mid, int& high, vector<int>& nums){
    int temp=nums[high];
    nums[high]=nums[mid];
    nums[mid]=temp;
}
class Solution {
public:
    void sortColors(vector<int>& nums) {
        
    int low=0;
    int mid=0;
    int high=nums.size()-1;
        
    while(mid<=high){
        
        if(nums[mid]==2){
            swap(mid,high,nums);
            high--;
     
        }else if(nums[mid]==0){
            swap(mid,low,nums);
            low++;
            mid++;
    
        }else if(nums[mid]==1){
            mid++;
        }
    
    }  
    }
    
};
