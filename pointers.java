
// Approach:
// 1. Count the number of 0s, 1s, and 2s in the array.
// 2. Traverse the array again and place all 0s first.
// 3. Fill the next positions with 1s.
// 4. Fill the remaining positions with 2s.
// 5. This sorts the array using the counting technique.

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count1++;
            }else if(nums[i]==1){
                count2++;
            }else{
                count3++;
            }
        }
        int z=count1+count2;
        for(int i=0;i<count1;i++){
            nums[i]=0;
        }for(int i=count1;i<z;i++){
            nums[i]=1;
        }for(int i=z;i<n;i++){
            nums[i]=2;
        }
        return;
    }
}
//problem 2
// Approach:
// 1. Sort the array.
// 2. Fix one element and use two pointers (left and right) to find two numbers
//    whose sum with the fixed element equals zero.
// 3. If the sum is zero, store the triplet and skip duplicate elements.
// 4. If the sum is less than zero, move the left pointer forward.
// 5. If the sum is greater than zero, move the right pointer backward.
// 6. Repeat until all unique triplets are found.

// Time Complexity: O(n^2)
// Space Complexity: O(1) (excluding the output list)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
                else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}
//problem 3
// Approach:
// 1. Place one pointer at the beginning and another at the end of the array.
// 2. Calculate the area formed by the two lines.
// 3. Update the maximum area if the current area is larger.
// 4. Move the pointer with the smaller height inward since it limits the area.
// 5. Repeat until the two pointers meet.

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int ans=0;
        while(left<right){
            int res=Math.min(height[left],height[right]);
            ans=Math.max(ans,res*(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
