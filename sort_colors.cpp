//sort colors 

class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.empty() || nums.size() == 0) return;

        int start = 0;
        int end = nums.size() - 1;
        int index = 0;

        while(index <= end && start < end){
            if(nums[index] == 0){
                nums[index] = nums[start];   //getting 0s to the beginning of nums
                nums[start] = 0;
                start++;
                index++;
            }else if(nums[index] == 2){
                nums[index] = nums[end];    // getting 2s to the end of nums
                nums[end] = 2;
                end--;
                //index++;
            }else
                index++;

        }

    }
};

//time complexity: O(n)
//space complexity:O(1)
