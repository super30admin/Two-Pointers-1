 //Problem-1
  // Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
 /* Here we will use three pointers and we make operations on the mid. if mid is equal to high will swap with high and
 decrement high by 1 and in the same way we compare with low and swap with low and increment both low and mid by 1.
 */

 class Solution {
     public void sortColors(int[] nums) {
         int low=0;
         int mid=0;
         int temp=0;
         int high=nums.length-1;
         while(mid<=high){
             if(nums[mid]==1) mid++;
             else if(nums[mid]==0){
                 temp=nums[low];
                 nums[low]=nums[mid];
                 nums[mid]=temp;
                 low++;
                 mid++;
             }
             else{
                 temp=nums[high];
                 nums[high]=nums[mid];
                 nums[mid]=temp;
                 high--;
             }
         }
     }
 }

 //Problem-2
 // Time Complexity :O(n*n)
// Space Complexity :O(1) //we use result list
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
 /* Here we need to list of triplets whose sum is equal to zero. for this we first sort the array. We try to iterate through
 the sorted array. we pick one element and try to find the complement of that in remaining elements in the array. x+y+z=0
 x+y=-z it turns out in to the two sum problem and we avoid duplicate tripltes while choosing the triplets.
 */

 class Solution {

     List<List<Integer>> res ;

     public List<List<Integer>> threeSum(int[] nums) {

         res = new ArrayList() ;

         if(nums.length <= 1){
             return res ;
         }

         Arrays.sort(nums);

         for(int i=0 ; i<= nums.length-3 ; i++){
             if(i == 0 || nums[i] != nums[i-1]){     // avoid duplicate of i
                 int target = 0 - nums[i] ;          // i+j+k = 0 ; ,hence need to find , j+k = target = 0-i ;
                 findTwoSum(i+1 , target , nums) ;
             }
         }

         return res ;
     }

     void findTwoSum(int start , int target , int[] nums){

         int i = start ;
         int j = nums.length - 1 ;

         while(i < j){

             int sum = nums[i] + nums[j] ;

             if(sum < target){
                 i++ ;
             }else if(sum > target){
                 j-- ;
             }else{

                 // Avoid duplicate of j
                 while(i < j && nums[i] == nums[i+1]){
                     i++ ;
                 }

                 // Avoid duplicate of k
                 while(i < j && nums[j] == nums[j-1]){
                     j-- ;
                 }

                 List<Integer> items = new ArrayList<>() ;
                 items.add(nums[start-1]) ;
                 items.add(nums[i]) ;
                 items.add(nums[j]) ;
                 res.add(items);

                 i++ ;
                 j-- ;
             }
         }
     }
 }

 //Problem-3
 // Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Your code here along with comments explaining your approach
 /* Here we need to return the max amount of water that can be stored in the container. For that case we need the maximum
 width and height can be minimum of two heights we are choosing.We move the indices by tending to prefer the maximum height.
 */
class Solution {
    public int maxArea(int[] height) {

        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            max=Math.max(max,h*w);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;

    }
}