// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : None

class MostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;
        while(start<=end){
            int area = (end-start)*Math.min(height[start],height[end]);
            if(area>max){
                max = area;
            }
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max;
    }

    public static void main(String [] args){
        int [] nums = new int[]{1,8,6,2,5,4,8,3,7};
        MostWater mw = new MostWater();
        System.out.println(mw.maxArea(nums));
    }
}