//If the question allowed non-inplace algorithm: we can use a hashmap of size 3 (since only 3 colors)
//TC = O(N)
//SC = O(3) ~ O(1)
class Solution {
public:
    void sortColors(vector<int>& nums) {
        unordered_map<int,int> hash(3);
        for(int i=0;i<nums.size();i++){
            hash[nums[i]]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=k;j<k+hash[i];j++){
                nums[j]=i;
            }
            k+=hash[i];
        }
    }
};

//In-place algorithm - 3 pointers
//TC = O(N)
//SC = O(1)
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int left=0;
        int mid=0;
        int right = nums.size()-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums[left],nums[mid]);
                left++; mid++;
            }else if(nums[mid]==2){
                swap(nums[mid],nums[right]);
                right--;
            }else{
                mid++;
            }
        }
    }
};
