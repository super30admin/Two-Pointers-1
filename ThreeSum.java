class ThreeSum {
    //time:O(n^2)
    //space:O(1)
    //did it run successfully on leetcode: yes
    public List<List<Integer>> threeSum(int[] nums) {
        
        //create list to store our result
        List<List<Integer>> result = new ArrayList<>();
        //if it has less than 3 elements
       if(nums.length < 3) return result;
    //sort the input
       Arrays.sort(nums);
       //get length of input 
       int n = nums.length;
    //looping through the input
       for(int i = 0; i < n-2; i++){
        
           if ((i > 0) && (nums[i - 1] == nums[i])) continue;
            //initializing low and high variables
           int low = i + 1;

           int high = n - 1;
        //until low is less than high
           while (low < high){
                //calculate sum of element at low, high and curr element
               int sum = nums[i] + nums[low] + nums[high];

               // case 1 sum = 0 
                
               if(sum == 0){
                   //create list of triplets to add to result 
                   List<Integer> current = Arrays.asList(nums[i],nums[low],nums[high]);

                   result.add(current);
                    //increase low and decrease high
                   low++; high--;
                //untill low is less than high and element at low is equal to its previous element ,increase low
                   while(low < high && nums[low] == nums[low-1]) low++;
                //untill low is less than high and element at high is equal to its previous element, decrease high
                   while(low < high && nums[high] == nums[high + 1]) high--;

               } else if (sum < 0){ // case 2 sum < 0
                //increase low
                   low++;

               }else { // case 3 sum > 0
                    //decrease high
                   high--;

               }

           }

       }

       return result; 
    }
}