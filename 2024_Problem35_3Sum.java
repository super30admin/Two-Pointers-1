//Time Complexity: O(n^3)
//Space Complexity: O(1)
//Brute Force
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //base case
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum == 0){
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

//Time Complexity: O(n^3)
//Space Complexity: O(1)
//2-Pointer Solution
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //base case
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        //Sort Array first
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n-2; i++){
            //for each element in the array 'i'
            //consider low 'i+1' and high pointer 'n-1'
            int low = i+1; int high= n-1;
            //edge case
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++; high--;
                    while(low < high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                } else if(sum < 0){
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }
}