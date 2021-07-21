class MaxArea {
    //time:O(n)
    //space:O(1)
    //did it run successfully on leetcode: yes
    public int maxArea(int[] height) {
        
        //initializing max, low and high variables
        int max = 0;

       int low = 0;

       int high = height.length - 1;
        
        //untill low is less than high
       while (low < high){
           
           //initializing curr area
           int currentArea = 0;
            
           //elemnt at low is less than high
           if(height[low] < height [high]){
            //update curr area
               currentArea = height[low] * (high - low);
            //increase low
               low++;
            //elemnt at low is greater or eaqual to high
           } else {
            //update curr area
               currentArea = height[high] * (high - low);
            //decrease high
               high--;

           }
            //update max
           max = Math.max(max, currentArea);

       }

      return max;
    }
}