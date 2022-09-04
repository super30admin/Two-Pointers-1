class Problem3 {
    public int maxArea(int[] height) {
        int low = 0;
        int high = (height.length)-1;
        int maxCapacity = 0;
        //null check
        if(height == null || height.length == 0) return maxCapacity;

        while(low<high){
            int currentCap = 0;
            currentCap = (Math.min(height[low], height[high]))*(high-low);
            if(currentCap>maxCapacity) maxCapacity = currentCap;
            if(height[low]<=height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return maxCapacity;
    }
}