class Solution {
    //TC - O(n) one pass
    // SC - O(1)
public:
    void sortColors(vector<int>& nums) {
        int low = 0;
        int mid =0;
        int n = nums.size();
        int high =n-1;
       while(mid<= high){
            if(nums[mid] == 2){
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
            else if(nums[mid] == 0){
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            }
            else mid++;
        }
        
       
    }
};