class Solution {
public:
    int maxArea(vector<int>& height) {
        int n=height.size();
        int maximum=0;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            maximum=std::max(maximum,(right-left)*std::min(height[left],height[right]));
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maximum;
    }
};
