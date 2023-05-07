// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Here to maximise area we need to maimise height and breadth ,first we select max breadth and we search for maximum height
//  with help of two pointers by moving them towards getting maximum height

class Solution 
{
public:
    int maxArea(vector<int>& height) {
        
        int start=0;
        int end=height.size()-1;
        int area=0;

        while(start<end)
        {
            int temp_area=(end-start)*min(height[start],height[end]);
            area=max(area,temp_area);

            if(height[start]<height[end])
            {
                start++;
            }
            else
            {
                 end--;
            }
        }

        return area;
    }
};