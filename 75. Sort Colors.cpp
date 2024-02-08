/*
Time Complexity: O(N)
Space Complexity: O(1)

Approach: Maintain two pointers (one for red, one for blue)

As we traverse from left to right,
if it's a red, then place red in the left red pointer (and increment it)
if it's a blue, decrement blue pointer until its not pointing to a blue element and
 swap current element with the element now blue is pointing
And just mark white all the intermediate elements
*/

class Solution {
public:

    void sortColors(vector<int>& nums) {
      int red = 0, blue = nums.size()-1;  
      
      for(int i=0;i<nums.size();i++){
        //cout<<i<<" "<<nums[i]<<endl;
        if(i>blue)  break;
        
        if(nums[i]==0){
          nums[i] = 1;
          nums[red++] = 0;          
        }
        else if(nums[i]==2){
          while(i<blue && nums[blue]==2)  blue--;
          swap(nums[i],nums[blue]);
          blue--;

          if(nums[i]==0){
            nums[i] = 1;
            nums[red++] = 0;          
          }
        }        
      }
    }
};
