//the lower of the 2 hts will always be the ht of the container. Try to match the greater ht and take max area
//Time complexity: O(n)
//Space complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int area = 0;
        while(i < j){
            area = Math.max(area, Math.min(height[i],height[j])*(j-i));
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return area;
    }
}