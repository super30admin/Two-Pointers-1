//TC : O(n)
//SC : O(1)
class Solution {
public:
    void sortColors(vector<int>& nums) 
    {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;

        while(mid <= high){

            if(nums[mid] == 0){
                swap(nums[low], nums[mid]);
                low++;
                mid++;
            }

            else if(nums[mid] == 2){
                swap(nums[mid], nums[high]);
                    high--;
            }
            else {
                mid++;
            }
        }
    }
};