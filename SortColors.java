//Time complexity: O(n)
//Space Complexity: O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[3];

        for(int num:nums){
            arr[num]++;
        }
        int k=0;
        for(int i=0;i<arr.length; i++){

            int count = arr[i];

            while(count-- >0){
                nums[k++] = i;
            }

        }
    }
}
