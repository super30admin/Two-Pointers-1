//11. Container With Most Water

/*
Using two pointers, maintain a variable to hold the maximum value
if left less than right, increment left
else increment right
Time complexity: O(n)
Space complexity: O(1)
*/


class Solution {
public:
    int maxArea(vector<int>& height) {
        int total = height.size();

        int i = 0;
        int j = total - 1;

        int fix = 0;
        int maxFill = 0;

        while( i < j){
            //multiply difference of index [gives width of container]and minimum of the two heights[gives height of container]
            fix = (j - i) * (min(height[i], height[j]));
            maxFill = max(fix, maxFill);

            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }

    return maxFill;
    }
};