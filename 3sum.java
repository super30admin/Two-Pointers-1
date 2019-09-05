//Time Complexity:O(N^2)
//Space Complexity:O(1)
//In this problem, I'll first sort my array in the ascending order. I'll iterate through the array and skip the duplicates. I'll initialize my left and right pointers to be equal to current iteration value +1 and array length -1 respectively. When left is less than right, I'll compute the sum of array[i] with the sum of left and the right element and check if my sum is equal to 0. In that case I'll append these three values to the output array and then check whether my left+1 is less than my right and if my left+1 element is equal to my left element. In that case, I'll be incrementing my left further to avoid duplicates. I'll check a similar condition with and decrement it further to avoid duplicates. Otherwise,I'll increment left and decrement right once and continue. If my sum is less than zero, I'll be incrementing my left,else, I'll be decrementing my right.
//This code was successfully executed and got accepted in leetcode.  


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        if(nums.length<3){
            return a;
        }
        Arrays.sort(nums);
      
        for(int i=0;i<nums.length-2;i++){
            if(i-1>=0&&nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r =nums.length-1;
            while(l<r){
                int sum= nums[i]+nums[l]+nums[r];
                if(sum==0){
                    a.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l+1<r&&nums[l]==nums[l+1]){
                        l++;
                    }
                    while(r-1>l&&nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                    
                }
                else{
                    r--;
                    
                }
            }
        }
        return a;
    }
}