// Time Complexity : O(n2) n square
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int left = i+1, right = n-1;
        if(i!=0 && nums[i] == nums[i-1]) continue;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    List <Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                else if(sum > 0){
                    right--;
            }
                else{
                    left++;
                }
                
            }
        }
        
        return result;
        }
    
     }