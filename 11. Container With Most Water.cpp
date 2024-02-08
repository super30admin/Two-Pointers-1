/*
Time Complexity: O(N)
Space Complexity: O(1)

Approach: Maintain two pointers (left, right)

area = min(h[left],h[right]) * distance(left,right);


If left one is smaller than right one, then we can only maximize area by incrementing left
And vice versa
*/



class Solution {
public:
    const int MAX_HEIGHT = 1e4+2;
    int maxArea(vector<int>& ht) {
      int ans = 0;
      int left = 0, right = ht.size()-1;

      while(left<right){
        int mini = min(ht[left],ht[right]);
        int area = mini * (right-left);
        ans = max(ans, area);

        if(ht[left]<ht[right])  left++;
        else  right--;
      }

      return ans;
    }
};
