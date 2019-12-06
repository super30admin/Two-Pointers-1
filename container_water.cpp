//container with most water
class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.empty() || height.size() == 0) return 0;
        int low = 0;
        int high = height.size() - 1;
        int max_area = 0;


        while(low < high){
             int min = std::min(height[low], height[high]);
             max_area = std::max(max_area, min * (high - low));   //area

            while(height[low] <=  min && low < high) low++;
            while(height[high] <= min && low < high) high--;

        }

       return max_area;
    }
};

//Time Complexity: O(n)
//Space Complexity: O(1)
