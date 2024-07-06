//time complexity: O(n) where n is length of input array
//space complexity: O(1) no extra datastructure created

class MaxArea {
    public int maxArea(int[] height) {
        int l = height.length;
        int rIdx = l-1;
        int lIdx = 0;
        int area=0;
        int maxArea=0;
        while(lIdx<=rIdx){
            int h = Math.min(height[rIdx],height[lIdx]);
            int w = rIdx-lIdx; 
            area = h*w;
            maxArea = Math.max(maxArea, area);
            if(height[rIdx]<height[lIdx]){
                rIdx--;
            } else{
                lIdx++;
            }
        }
        return maxArea;
    }

     public static void main(String[] args) {
        MaxArea obj = new MaxArea();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(nums));
    }

}