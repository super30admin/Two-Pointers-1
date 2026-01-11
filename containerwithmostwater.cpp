class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int maximum = 0;
        //declare a left pointer and a right pointer
        int lpointer = 0;
        int rpointer = n - 1;

        while(lpointer < rpointer){//making sure left doesnt cross right
            int currArea = min(height[lpointer], height[rpointer]) * (rpointer - lpointer);//min of height at left anf right multiplied by width gives us the area
            maximum = max(maximum , currArea);//compare previous maximum and curr area and update
            if(height[lpointer] < height[rpointer]){
                lpointer ++;
            }else{
                rpointer--;
            }
        } 

        return maximum;
    }
};