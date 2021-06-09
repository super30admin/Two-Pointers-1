class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        //Using Two pointers approcach fpr the same
        //since the white isthe middle color we dont move it, just cur inceremnt 
        //just check if its red- then swap with element @start
        //since red is in good place move both start and cur by one
        // check if cur is green, then swap it with last element and devrement end pointer
        // and since you dont know what is new swapped value- keep cur at the same position
        
        int start=0;
        int end=nums.size()-1;
        int cur=0;
     
        while(cur<=end)
        {
            if(nums[cur]==0)
        {
            swap(nums[cur],nums[start]);
            cur++;
            start++;
        }
       else if(nums[cur]==2)
        {
            swap(nums[cur],nums[end]);
            end--;    
        }
        else
            cur++;
        }
        
    }
};
