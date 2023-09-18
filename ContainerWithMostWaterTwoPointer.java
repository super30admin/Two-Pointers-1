class ContainerWithMostWaterTwoPointer {
    //USing two pointer approach, taking left and right pointer, if left is smaller than right then moving left otherwise moving right pointer.
    //TC will be O(N), as traversing only once.
    //SC will be O(1), as no extra space is used.
    public int maxArea(int[] height) {
        if(height == null || height.length==0){
            return 0;
        }

        int n = height.length;
        int left=0;
        int right= n-1;
        int max=0;

        while(left<right){
            max = Math.max(max,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }


    public static void main(String[] args){
        ContainerWithMostWaterTwoPointer obj = new ContainerWithMostWaterTwoPointer();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }
}