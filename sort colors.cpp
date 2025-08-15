class Solution { //tc: o(n) sc:o(1)
public:
    void sortColors(vector<int>& nums) {
        int low =0;
        int high = nums.size()-1;
        int mid = 0;
        while(mid<=high)
        {
            if(nums[mid]==2)
            {
             swap(nums[mid],nums[high]);
             high--;
            }
            else if(nums[mid]==0)
            {
              swap(nums[low],nums[mid]);
              low++;
              mid++;
            }
            else
              mid++;
        }
     
        
    }
};