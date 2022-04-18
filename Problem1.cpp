//time complexity : o(n)
// space : O(1)
//apraoch : We are using 2 pointer in this qustion
class Solution {
public:
    int maxArea(vector<int>& height) {
        
        int left  = 0;
        int right = height.size()-1;
        
         long long int maxArea = 0;
        while(left < right) {
            long long int area = (right - left) *  min(height[left],height[right]);
             maxArea = max(maxArea ,area);
            
            if( height[left] < height[right]) {
                left++;
               
            } else {
                 right--;
            }
        }
        
        return maxArea;
         
    }
};