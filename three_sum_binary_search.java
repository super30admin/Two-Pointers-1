class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length==0) return new ArrayList<>();
    
        //Solution 4, Using Binary Search solution O(n^2*log(n)) TC, O(1)-average-SC
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                int low = j+1;
                int high = n-1;
                int target = 0 - (nums[i]+nums[j]);
                while(low<=high){
                    int mid = low+(high-low)/2;
                    if(nums[mid]==target){
                        List<Integer> li = Arrays.asList(nums[i],nums[j],nums[mid]);
                        low++;
                        high--;
                        if (!result.contains(li)){
                            result.add(li);
                        }
                    }else if(nums[mid] > target){
                        high = mid--;
                    }else{
                        low = mid++;
                    }
                }
            }
        }
        return result;
    }
}