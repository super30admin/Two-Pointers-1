public class 3sum {
    public List<List<Integer>> threeSum(int[] nums) {
 
        HashSet <List<Integer>> set = new HashSet<>();
 
        int n = nums.length;
 
        for( int i = 0; i < n-2; i++){
 
            for(int j = i+1; j < n-1; j++){
 
                for(int k = j+1; k < n; k++){
 
                    int sum = nums[i]+ nums[j] + nums[k];
 
                    if(sum == 0){
 
                        List<Integer> myList = Arrays.asList(nums[i],nums[j],nums[k]);
 
                        Collections.sort(myList);
 
                        set.add(myList);
 
                    }
 
                }
 
            }
 
        }
 
        return new ArrayList<>(set);
 
    }
 
}