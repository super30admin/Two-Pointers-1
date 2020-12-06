//  ## Problem 2

// ## Problem2 (https://leetcode.com/problems/3sum/

//Did this code run on leetcode :Yes

// Time complexity: O(nlogn) + O(n) == O(nlogn) 
// Space complexity: O(1) 
// Idea- to maintain 2 pointers - low and high- try to achieve given sum



class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        vector<vector<int>> result;
        
        //sort array
        sort(nums.begin(), nums.end());
        
        for(int i=0; i<nums.size() ; i++)
        {
           
         //break the algo as all +ve nos , so cant sum up to 0
         if(nums[i] > 0){
             break;
         }
         int low = i+1;
         int high = nums.size() -1;
            
            
        //to stop checking same value
        if( i > 0 && nums[i] == nums[i-1]){
            continue;
        }
            
         while(low < high){
             
             int curr_sum = nums[i] + nums[low] + nums[high];
             
             
             if ( curr_sum < 0){
                 low++;
             }
             else if ( curr_sum > 0){
                 high--;
             }
             else{
                 
                 vector<int> triplet;
                 
                 //inserting the triplet in sorted order
                 triplet.push_back(nums[i]);
                 triplet.push_back(nums[low]);
                 triplet.push_back(nums[high]);
                 
                 result.push_back(triplet);
                 low++;
                 high--;
                 
                 //to stop checking duplicates
                 while(low<high && nums[low] == nums[low-1]){
                     low++;
                 }
                 while(low< high && nums[high]== nums[high+1]){
                     high--;
                 }
                 
             }
             
         }    
             
        }
        
        return result;
    } 
};