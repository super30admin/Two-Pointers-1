class MostWater {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int low =0; 
        int high = n-1;
        int maxArea=0;
        while(low<high){
            maxArea = Math.max(maxArea,Math.min(arr[low],arr[high])*(high-low));
            if(arr[low]<arr[high]) low++;
            else high--;
        }
        return maxArea;
    }
}