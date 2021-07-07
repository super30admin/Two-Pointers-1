Time Complexity-O(n)
Space Complexity-O(1)
Did the code run on Leetcode? Yes

#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxarea=0;
        int low=0,high=height.size()-1;
        while(low<high)
        {
            maxarea=max(min(height[low],height[high])*(high-low),maxarea);
            if(height[high]>height[low])
                low++;
            else
                high--;
        }
        return maxarea;
    }
};

int main() {
	vector<int>m={1,8,6,2,5,4,8,3,7};
	Solution soln;
	int result=soln.maxArea(m);
	cout<<result;
	return 0;
}