// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. We will use three pointers low, mid = 0 and high = last index
// 2. If nums[mid] == 0, we will swap nums[low] and nums[mid] and increment low and mid
// 3. If nums[mid] == 1, we will increment mid
// 4. If nums[mid] == 2, we will swap nums[mid] and nums[high] and decrement high
// 5. We will repeat the above steps until mid <= high

class Solution {
private:
    void swap(int &a, int &b){
        int temp = a; 
        a = b; 
        b = temp;
    }
public:
    void sortColors(vector<int>& nums) {
        int low = 0, mid = 0, high = nums.size() - 1; 
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums[low], nums[mid]);
                low++; 
                mid++;
                
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums[mid], nums[high]);
                high--;
            }
        }
    }
};