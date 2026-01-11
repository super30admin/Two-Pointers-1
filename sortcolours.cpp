class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int left = 0;
        int mid = 0;
        int right = n-1;
        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums,mid,right);
                right--;
            }else if(nums[mid] == 0){
                swap(nums,mid,left);
                left++;
                mid++;
            }else{
                mid++;
            }
        }
    }

private:
    void swap(vector<int>& nums, int mid, int idx) {
    int temp = nums[idx];
    nums[idx] = nums[mid];
    nums[mid] = temp;
}
};