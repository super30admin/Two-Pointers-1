// 15 3sum
// solved on leetcode
// time complexity - O(n^2)
// space complexity -O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList();
        int i=0;
        Arrays.sort(nums);
        
        while(i<nums.length-2){
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right){
                // find the sum for three numbers
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ArrayList<Integer> triplet = new ArrayList();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    
                    result.add(triplet);
                    // eliminating the duplicates
                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
            while((i<nums.length-2) && nums[i]==nums[i+1]) {
                i++;
            }
            
            i++;
        }
        return result;
    }
}