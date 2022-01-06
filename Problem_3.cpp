//Two approaches are used: i> Brute force ii> Two Pointers

//Time complexity is O(n^2)
//Space Complexity is O(1)

//Approach: Brute force
//The code ran perfectly


class Solution {
public:
    int maxArea(vector<int>& height) {
        
        int maxArea = 0;
        for(int i = 0; i<height.size(); i++){
            for(int j = i+1; j<height.size(); j++){
                int factor = min(height[i], height[j]);
                int currArea = abs(factor * (j - i));
            maxArea = max(maxArea, currArea);
            }
        }
        
        return maxArea;
        
    }
};

//Two Pointers Approach:
//Time complexity is O(n) as we are iterating through the array only once
//Space complexity is O(1) as we are not creating any extra space for computations

/*
Approach: 
We are using two pointer approach.
Area will be the lowest of the two bars multiplied by the distance between two bars.
So we keep on checking which is the small bar between two bars and increment or decrement the 
pointer according to that. If the low pointer is small as compared to the high pointer then
it is incremented and if the high is smnall it is decremented. The reason for this is that
we need to find the max area so we will increment only that pointer which is small in order to find a bigger bar than it. 
We also maintain maxarea and keep on updating it if we find larger
area than the earlier area.
*/

class Solution {
public:
    int maxArea(vector<int>& height) {
        int low = 0;
        int high = height.size() -1;
        int maxArea = 0;
        while(low<high){
            int factor = min(height[low], height[high]);
            int currArea = abs(factor * (low - high));
            maxArea = max(maxArea, currArea);
            if(height[low]>height[high]) high--;
            else low++;
        }
        return maxArea;
        
    }
};

