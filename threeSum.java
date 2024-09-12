/* 15. 3Sum
Time Complexity: O(n^2)
Space Complexity: O(n)
Approach, for each index, keep L and R on the rest of the array. Keep incrementing or decrementing as and when we find sum; if sum > 0, do r-- since we need a lower value. else do l++, if sum < 0
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();

        int n=nums.length;
        int left, right;
        int sum;
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            //duplicates
            if(i>0 && nums[i] == nums[i-1])
                continue;

            left = i+1;
            right = n-1;

            while(left < right){
                sum = nums[i] + nums[left] + nums[right];

                if(sum==0){
                    List<Integer> newList = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(newList);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}



/* 15. 3Sum => Brute force
Time Complexity: O(n^3)
Space Complexity: O(n)
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return new ArrayList<>();

        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum==0){
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


