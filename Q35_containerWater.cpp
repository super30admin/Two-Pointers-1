//  ## Problem 3

// ## Problem3 (https://leetcode.com/problems/container-with-most-water/

//Did this code run on leetcode :Yes

// Time complexity: O(n)
// Space complexity: O(1) 
// Idea- to maintain 2 pointers - low and high- reduce width and increase height


class Solution {
public:
    int maxArea(vector<int>& height) {
        
        if(height.size()==0){
            return 0;
        }
        
        int max_cap =0;
        int curr_cap =0;
        int curr_ht= 0;
        
        int low =0; 
        int high = height.size()-1;
        while( low <=high){
            curr_ht = min( height[low], height[high]);
            curr_cap = (high -low ) * ( curr_ht);
            
            if ( curr_cap > max_cap){
                max_cap = curr_cap;
            }
            
            if( height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        
        return max_cap;
    }
};