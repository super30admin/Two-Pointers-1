# Two-Pointers-1

## Problem1: Sort colors

```Java
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void sortColors(int[] nums) {

        int zero =0;
        int one = 0;
        int two =0 ;

        for(int i =0; i<nums.length; i++){
            if(nums[i] ==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int index =0;
        for(int i=1; i<=zero; i++){
            nums[index++] = 0;
        }
        for(int i=1; i<=one; i++){
            nums[index++] = 1;
        }
        for(int i=1; i<=two; i++){
            nums[index++] = 2;
        }
    }
}
```

## Problem2: 3sum

```Java
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        //null check
        if(nums == null || nums.length ==0)
            return result;

        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(nums[i]>0)
                break;
            //outside duplicacy
            if(i!=0 || nums[i] == nums[i-1])
                continue;
            int low = i+1;
            int high = n-1;

            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    //inside duplicacy
                    while(low<high && nums[low] == nums[low-1])
                        low++;
                    while(low<high && nums[high] == nums[high-1])
                        high--;
                }
                else if(sum>0)
                    high--;
                else
                    low++;
            }
        }
        return result;
    }
}
```
## Problem3 Container with most water

```Java
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int low = 0;
        int high = n - 1;

        while(low<high){
            int currArea = Math.min(height[low], height[high]) * (high-low);
            max = Math.max(max, currArea);
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}
```