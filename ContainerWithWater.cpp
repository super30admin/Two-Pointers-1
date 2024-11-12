// given the array of int [1,8,6,2,5,4,8,3,7]
// find the the maximum area we can get

// brute force approach would be to iterate through each hight for each width
// and get the max so that the time complexity will be O(n^2)

// but we can use the two pointer approach
// first = 0
// second = last 

// now if we calculate the area and store the area we will have the area with maximum width
// but we need to calculate the one with the max height as well
// so we iterate the pointer one with min height till low < height


class Solution {
public:
    int maxArea(vector<int>& height) {
        int low = 0;
        int high = height.size()-1;
        int max_area = 0;

        while(low <= high)
        {
            
            int area = (high-low)*min(height[low],height[high]);
            max_area = max(area,max_area);

            if(height[low] < height[high])
                low++;
            else
                high--;
        }

        return max_area;
    }
};

// Time complexity is O(N)
//space complexity is O(1)