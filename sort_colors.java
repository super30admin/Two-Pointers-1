// TC: O(n)
//sc : O(n)

//approach: 3 pointer solution
//take the pointers mid and start as 0 and end as len-1, 
//mid<=end is the breach cdn for the while loop as start is always< mid
// when the nums[mid] is found as 0, swap(mid,start)  then inc mid,start
//// when the nums[mid] is found as 1, inc mid++ as mid values are 1 and they are in their actual places
// when the nums[mid] is found as 2, swap(mid,end)  then dec end-- 
class Solution{
    public void sortColors(int[] nums){
        int mid =0,start =0,end = nums.length-1;
        while(mid<=end){ //mid collects all the 1's so it is always < end
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                mid++;
                start++;
            }
            else if(nums[mid]==1)
                mid++;
            else{
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                // mid++; // since we are not sure if the value swapped to mid is 1 or 0
                end--;
            }  
        }
        return;
    } 
}
