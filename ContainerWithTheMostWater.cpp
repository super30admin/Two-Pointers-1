//TC = O(N)
//SC = O(1)
class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size()-1;
        int maxResult = 0;
        int area = 0;
        while(left<right){
            int w = int(right - left) ;
            int h = min(height[left],height[right]);
            int A = h * w;
            maxResult = max(A, maxResult);
            if(height[left] <= height[right]) left++;
            else right--;
        }
        return maxResult;
    }
};
