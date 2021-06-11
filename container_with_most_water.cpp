//TC : O(n)
//SC : O(1)
class Solution {
public:
    int maxArea(vector<int>& height) 
    {
        int low =0;
        int high = height.size()-1;
        int max1 =0;
        while(low<high){
            max1 = max(max1, (high-low)*min(height[low],height[high]));
            if(height[low]<=height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max1;
    }
};