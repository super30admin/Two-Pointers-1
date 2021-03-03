// Time Complexity -> O(n)
// Space Complexity -> O(1)


class Solution {
public:
    void sortColors(vector<int>& nums) {    
        int n_0 = -1,n_1=-1,n_2=-1;
        for(int i = 0; i < nums.size();i++){
            if(nums[i]==2)nums[++n_2]=2;
            else if(nums[i]==1){
                nums[++n_2]=2;
                nums[++n_1]=1;
            }
            else{
                nums[++n_2]=2;
                nums[++n_1]=1;
                nums[++n_0]=0;
                
            }
        }
        
    }

};