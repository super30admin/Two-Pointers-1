class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //     List<List<Integer>> result = new ArrayList<>();

    //     int n = nums.length;

    //     for(int i = 0; i<n-2; i++){
    //         for(int j = i+1; j<n-1; j++){
    //             for(int k = j+1; k<n; k++){
    //                 int sum = nums[i] + nums[j] + nums[k];
    //                 if(sum ==0 ){
    //                     List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
    //                     Collections.sort(li);
    //                     if(!set.contains(li)){
    //                         result.add(li);
    //                         set.add(li);
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //   return result;


List<List<Integer>> result = new ArrayList<>();

Arrays.sort(nums);


for(int i = 0; i<=nums.length-1; i++){
    if(nums[i] > 0) break;
    // Outside Duplicancy
    if(i>0 && nums[i] == nums[i-1]) continue;
    int low = i+1;
    int high = nums.length - 1;
    while (low < high){
        int sum = nums[i]+nums[low]+nums[high];

        if(sum == 0){
            List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
            result.add(li);
            low++;
            high--;
            while(low < high && nums[low] == nums[low-1]) low++;
            while(low < high && nums[high] == nums[high + 1]) high--;
        }
        else if(sum > 0){
            high--;
        }
        else{
            low++;
        }

    }
}
return result;


    }
}



//Approach 

//TC - O(n2), O(1)

//Using Two Pointers Approach, Taking low pointer as i+1 element and high pointer as nth element. 
//For every Iteration we are doing 2sum from low to high by adding i. If sum of i + low + high is equal to zero then Incrementing low and high. if the sum is greater than 0 decrementing high. If sum is less than 0 Incrementing low. So that will be O(n2) with two pointers and there is no auxilary data structure so SC will be O(1).