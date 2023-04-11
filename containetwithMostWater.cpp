class Solution {
   // TC - O(n);
   // SC - O(1); 
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int p1=0;
        int p2 =n-1;
        long long int max1 = INT_MIN;
        while(p1<p2){
            long long int temp = ((p2-p1) * (std::min(height[p1], height[p2])));
            max1 = std::max(temp, max1);
            if(height[p1]>height[p2]) p2--;
            else p1++;
        }
        return max1;
    }
};