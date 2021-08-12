// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// use three pointers to demarcate each of the colors
// move the mid pointer from left to right by swapping its values with thelow and right pointers deppending on its values



class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low=0;
        int mid =0;
        int high = nums.size()-1;
        while(mid <= high){
            if(nums[mid] ==0){
                swap(nums[low],nums[mid]);
                low++;
                mid++;
            }else if(nums[mid] ==1){
                mid++;
            }
            else{
                swap(nums[mid],nums[high]);
                high--;
                
            }
        }
            
    }
};