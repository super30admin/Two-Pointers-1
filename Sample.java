// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//sort colors
class Solution {
    public void sortColors(int[] nums) {
        int l=0; int mid = 0; int r = nums.length - 1;
        while(mid <= r){
            if(nums[mid] == 0){//if mid is 0 replace it with left element
                nums[mid] = nums[l];
                nums[l] = 0;
                l++;
                mid++;
            } else if(nums[mid] == 2){//if mid is 2 replace it with right element
                nums[mid] = nums[r];
                nums[r] = 2;
                r--;
            } else{
                mid++;
            }
        }
    }
}
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
//3sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        //t.p
        for(int i =0; i < n-2; i++){
            //outside duplicancy
            if(nums[i] > 0) break; // for positiv numbers > 0 there is no pointing in going forward
            if(i > 0 && nums[i] == nums[i-1]) continue;//for duplicate elimination
            //tp
            int l = i+1;
            int r = n-1;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){//we found a triple to get 0 sum.
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l< r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r+1]){
                        r--;
                    }

                } else if(sum > 0){
                    r--;
                } else{
                    l++;
                }
            }
        }
        return result;
    }
}
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
//cointainer with Most water

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int n = height.length;
        int l = 0; int r =  n-1;
        while(l < r){
            int currAr = (r-l)*Math.min(height[l], height[r]);//area calculation
            max = Math.max(currAr, max);//comparing areas for max area
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}