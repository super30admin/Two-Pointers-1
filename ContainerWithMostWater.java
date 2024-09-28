class ContainerWithMostWater {

    /*
      Time : O(N)
      Space : O(N)
      Leetcode : YES
    */
    
    /*
      Approach : Two Pointers
      1. start with low and high pointer
      2. Container area would always be dominated by lowest height hence if left height is low move left pointer else move right pointer.
      3. at every iteration area would be, lowest of low and high heights multiplied by the width ( diif of high and low)
      4. move pointers to find max area.
    */
    public int maxArea(int[] height) {
        if(height == null) return 0;
        int n = height.length;
        
        int low = 0;
        int high = n -1;
        int max = 0;
        while(low < high){      
            max = Math.max(max, Math.min(height[high], height[low]) * (high - low));
            
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }     
        return max;
    }
    
    
    /*
      Time : O(n^2) | two for loops
      Space : O(1) 
      Leetcode : YES
    */
    
    /*
      Approach : Brut Force
      1. try out every possible combination and figure out max area.
    */
    public int maxArea(int[] height) {
        if(height == null) return 0;
        int n = height.length;
        
        int low = 0;
        int high = n -1;
        int max = 0;
       
        for(int i = 0; i < n -1; i++){
            for(int j = i+1; j < n; j++){
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        
        return max;
    }
}
