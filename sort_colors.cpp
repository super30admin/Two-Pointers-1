//TC:0(N)//SC:O(1)
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low=0,mid=0,high=nums.size()-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums[high],nums[mid]);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums[low],nums[mid]);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
};
