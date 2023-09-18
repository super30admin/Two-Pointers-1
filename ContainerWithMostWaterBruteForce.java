class ContainerWithMostWaterBruteForce {
    //Brute Force, will work but not optimal as time limit exceeds
    //TC will be O(n^2), as linearlly searching for every combination
    //SC will be O(1), no extra space is used.
    public int maxArea(int[] height) {
        if(height == null || height.length==0){
            return 0;
        }

        int n = height.length;
        int max = 0;

        for(int i= 0; i< n; i++){
            for(int j= i+1; j<n;j++){
                max = Math.max(max, Math.min(height[i],height[j])*(j-i));
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWaterBruteForce obj = new ContainerWithMostWaterBruteForce();
        System.out.println(obj.maxArea(height));
    }
}