class ThreeSumProblem {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) 
            return new ArrayList();
        
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i != 0 && nums[i] == nums[i - 1])
                continue;
            
            int low = i+1;
            int high = nums.length - 1;
            
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if( sum == 0){
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));     
                    // Found the values --> add to output
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]){      
                        // for a same low value, it will be defintely same right value --> waste of traverse for duplicates.
                        low++;
                    }
                    while(low < high && nums[high] == nums[high + 1]){    
                        // for a same high value, it will be defintely same right value --> waste of traverse for duplicates.
                        high--;
                    }
                } else if( sum < 0){
                    low++;
                    while(low < high && nums[low] == nums[low - 1]){
                        low++;
                    }
                } else {
                    high--;
                    while(low < high && nums[high] == nums[high + 1]){
                        high--;
                    }
                }
            }
        }
        return res;
    }   
}
