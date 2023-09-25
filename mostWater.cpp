//Tc: O(n)
//Sc: O(1)
//Approach: we use two pointers to find aear held by container, we move the pointer with smaller height
//because if we ave tp make a decision between two container heights we know width will be certainly 
//decreased by 1 but we always have a chance to find taller height and ultimately bigger area which is what the problem is asking

class Solution {
public:
    int maxArea(vector<int>& height) {
        int left=0;
        int right=height.size()-1;
        int maxArea=INT_MIN;
        while(left<right)
        {
            maxArea=max(maxArea, min(height[left], height[right])*(right-left));
            if(height[left]<height[right])
                    left++;
            else
                    right--;
        }
        return maxArea;
    }
};