class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length== 0){
            return 0;
        }
        int max=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            max= Math.max(max,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return max;
    }
}

//time complexity=o(n)
//space complexity=o(1)