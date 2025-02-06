// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : while submit i got time limit exceeded error
// Any problem you faced while coding this :got time limit exceeded error


// Your code here along with comments explaining your approach: bruetforce just implemennt nested itteration to get max between all possiblities

class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n=height.length;
        for(int i=0;i<n-1;i++){ // O(n)
             for(int j=i+1;j<n;j++){ //O(n)
            int area=Math.min(height[i],height[j])*(j-i);
            max=Math.max(max,area);
        }
        }
        return max;
        
    }
}
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach: because of getting time limit exceeded error in the above approach, i came to this approach by taking l and r in parallel checking max
// here we need to increase the area so that i am moving away from low heights and calculating max area between possible heights


class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n=height.length;
        int l=0;int r=n-1;
        while(l<=r){ //O(n)
        int area=Math.min(height[l],height[r])*(r-l);
        max=Math.max(max,area);
        if(height[l] < height[r]){
                l++;
        }else{
            r--;
        }
        }
        return max;
        
    }
}