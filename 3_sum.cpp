// Time Complexity : O(n*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {

private:
     vector<vector<int>> threesum_matrix(vector<int>& nums) {
         
         int lower,   higher, current_sum ;
         sort(nums.begin(), nums.end());
         vector<vector<int>> result;
         vector<int> res_vector(3,0);
         int count=0;
         //2.A
         for(int i=0; i<nums.size()-2;i++){
            
             if( i>0 && nums[i] == nums[i-1]){
                 continue;
          }
             lower = i+1; higher = nums.size()-1;
           while(lower<higher){
                 current_sum = nums[i] + nums[lower]+ nums[higher];
                      //target found
                 if(current_sum == 0){
                    res_vector[0] = nums[i];
                    res_vector[1] =nums[lower];
                    res_vector[2] =nums[higher];
                    result.push_back(res_vector);
                     count++;
                     lower++;
                     higher--;
                     
                    while(lower<higher && nums[lower] == nums[lower-1]){
                        lower++;
                    }
                     
                    while(lower<higher && nums[higher] == nums[higher+1]){
                        higher--;
                    }
                 }
                 //less than target
                else if(current_sum < 0){
                     lower++;
                     
                    while(lower<higher && nums[lower] == nums[lower-1]){
                        lower++;
                    }
                 }
                 //greater than target
                 else if(current_sum > 0){
                     
                     higher--;
                     
                    while(lower<higher && nums[higher] == nums[higher+1]){
                        higher--;
                    }
                 }
            }
                 
        }
       return result;      
    }
         
    
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        //1.A
        if(nums.size()<2){
             vector<vector<int>> result;
            return result;
        }
        //2. 
        return threesum_matrix(nums);
    }
};