  //Optimized
        // TC:O(N)
        // SC:O(1)
        int max = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length - 1;
        while(low <= high) {
            max = Math.max(max, (high - low)*(Math.min(height[low], height[high])));
            if(height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
