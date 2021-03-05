// Time Complexity : O(n^2*logn) for both approaches
// Space Complexity : O(1) for both approaches
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
-------------------------------------------------------------------- Approach 1 -------------------------------------------------------------------------------
 class Solution {
    //Binary Search approach
    //In order to find X+Y+Z=0 , we can find Y+Z=-X;
    public List<List<Integer>> threeSum(int[] nums) {
        //{-4,-1,-1,0,0,0,1,1,2}
        Arrays.sort(nums);//sort the array
        List<List<Integer>> triplets = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                //base condition - for not repeating elements - for outer loop
                continue;
            }
            searchTriplets(-nums[i],nums,i+1,triplets);
        }
        return triplets;
    }
    
    public static void searchTriplets(int target, int[] arr, int left, List<List<Integer>> triplets){
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                triplets.add(Arrays.asList(-target,arr[left],arr[right]));
            
            left++;
            right--;
            while(left<right && arr[left]==arr[left-1]){
                //There may be case for duplicate triplet, example {0,0,1,1} -> we end up going to                      zero again - so we increment again
                left++;
            }
            while(left<right && arr[right]==arr[right+1]){
                //There may be case for duplicate triplet, example {0,0,1,1} -> we end up going to                      one again - so we decrement again
                right--;
            }
            }
            else if(arr[left]+arr[right]>target){
                right--;//Decrement right if sum is greater than target
            }
            else{
                left++; //Increment left if sum is lesser than target
            }
            
        }
    }
}

-------------------------------------------------------------------- Approach 2 -----------------------------------------------------------------------------
  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Two Pointers Approach
        Arrays.sort(nums);//sort the array
        List<List<Integer>> triplets = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            //base condition - for not repeating elements - for outer loop
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int low=i+1;int high=nums.length-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    triplets.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    //There may be case for duplicate triplet, example {0,0,1,1} -> we                      end up going to zero again - so we increment again
                    while(low<high && nums[low]==nums[low-1]) low++;
                    //There may be case for duplicate triplet, example {0,0,1,1} -> we                     end up going to one again - so we decrement again
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(sum<0){
                    low++;//Increment low if sum is less than target
                }
                else{
                    high--;//Decrement high if sum is greater than target
                }
            }
        }
        return triplets;
    }
}
