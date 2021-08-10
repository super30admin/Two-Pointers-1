//Time Complexity - O(N)
//Space Complexity - O(1)
class Solution {
public:
    int maxArea(vector<int>& height) {
        int l=0,h=height.size()-1,w=height.size()-1,ans=INT_MIN;
        while(l<h){
            ans=max(ans,min(height[l],height[h])*w);
            if(height[l]<=height[h]){
                l++;
            }
            else if(height[l]>height[h]){
                h--;
            }
            w--;
        }
        return ans;
    }
};