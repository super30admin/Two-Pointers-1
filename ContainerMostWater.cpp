// Brute-Force Solution
// Time Complexity - O(n^2)
// Space Compelxity - O(1)
// It runs on leetcode but for some cases the time limit is exceeded.
class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int area = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                area = max(area, min(height[i],height[j])*(j-i));
            }
        }
        return area;
    }
};

// Approach 2 -> 2-pointer technique
// Time Complexity - O(n), since we are iterating over the vector once.
// Space Complexity - O(1);
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0, n = height.size(), right = n-1;
        int area = 0;
        while(left < right){
            area = max(area, min(height[left], height[right])*abs(right-left));
            if(height[left] <= height[right])
                left++;
            else
                right--;
            cout << area << endl;
        }
        return area;
    }
};

// Follow-up -> Find the indices.

class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0, n = height.size(), right = n-1;
        int area = 0;
        int currArea = 0;
        
        int start = 0, end = n-1;
        while(left < right){
            if(area < min(height[left], height[right])*abs(right-left)){
                start = left;
                end = right;
            }
            area = max(area, min(height[left], height[right])*abs(right-left));
            
            if(height[left] <= height[right])
                left++;
            else
                right--;
            cout << area << endl;
        }
        cout << "Start" << start << endl;
        cout << "End" << end << endl;
        return area;
    }
};