// Time Complexity : 0(n2)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Using two pointer approach and having a for loop for pivot to find the zero sum with
// sliding the pointers to avoid duplicates
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++){
            int left=i+1,right=n-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(nums[i]>0){
                break;
            }
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    System.out.println(i+" "+left+" "+right);
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left <right && (nums[left]==nums[left-1])){
                        left++;
                    }
                    while(left<right && (nums[right]==nums[right+1])){
                        right--;
                    }
                }else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return result;
    }
}


/***************************PROBLEM2*****************************/
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int left = 0, right = nums.length - 1, mid = 0;

        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(mid, right, nums);
                right--;
            } else if (nums[mid] == 0) {
                swap(left, mid, nums);
                left++;
                mid++;
            } else {
                mid++;
            }
        }

    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/***********************PROBLEM-3********************/
// Time Complexity : 0(n) n=length of height array
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int left=0,right=height.length-1,maxArea=0;
        while(left<right){
            maxArea=Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}