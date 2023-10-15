// Dutch Flag Algorithm
class Solution {
public:
    void sortColors(vector<int>& nums) {
      int n=nums.size();
      int low=0, high = n-1, mid=0;
      while(mid<=high){
          if(nums[mid]==0){
              swap(nums[low], nums[mid]);
              low++;
              mid++;
          }
          else if(nums[mid]==2){
              swap(nums[high], nums[mid]);
              high--;
          }
          else{
              mid++;
          }
      }  
    }
};
