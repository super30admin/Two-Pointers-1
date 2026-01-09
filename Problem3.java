class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int l=0; //where l is left pointer
        int r=n-1; //where r is right pointer
        while(l<r){
            int currArea= Math.min(height[l],height[r])*(r-l); 
            max=Math.max(max,currArea);
            if(height[l]<height[r]){
                //if height of right is greater than move the left pointer to next index
                l++;
            }
            else{
                //if hieght of left is grater than right then move the right pointer to i-1
                r--;
            }
        }
        return max;
    }
}