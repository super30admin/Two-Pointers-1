class containerWithMostWater{
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while(left < right){
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        containerWithMostWater cw = new containerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(cw.maxArea(height));
    }
}