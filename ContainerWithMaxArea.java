//approach-here i am using two pointer placed at both the boundaries. max area is dependent on the height of the shorter line. if i move the pointer on the larger line inward the height would still be the same while the width is being reduce resulting in yeilding a lesser area. so we move only the pointer pointing the shorter line while storing the maximum area yeild at each point.
//time complexity-O(n) as we are getting the area in a single pass
//space Complexity-O(1) as we are using only extra variables which occupy constant space.

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            area=Math.max(area,h*(r-l));
            if(h==height[l])l++;
            else r--;
        }

        return area;
    }
}
