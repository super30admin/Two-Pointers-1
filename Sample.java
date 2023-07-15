//----------PROBLEM 1: SORT COLORS----------------
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : coming up with constant space solution


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0, mid=0, high=n-1;

        while(mid<=high){
            if(nums[mid]==2){  // numbers- 0,1,2 assigned to low, mid, high,
                swap(nums,mid,high); // if mid=2 we want to high as 2 so swap
                high--; 
            }
            else if(nums[mid]==0){
                swap(nums,mid,low); //we want low as 0 so swap with mid
                mid++;
                low++;
            }
            else
                mid++;
        }
    }

    public void swap(int[] nums, int one, int two){
        int temp= nums[one];
        nums[one]=nums[two];
        nums[two]=temp;
    }
}



//----------PROBLEM 1: 3 SUM----------------
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : coming up with constant space solution


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //total 4 soln: (n2 + hashmap) (n3) (n2 + 2 pointers) (n2logn binary search)
        List<List<Integer>> res= new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            //outside duplicacy
            if(nums[i]>0) //Array is sorted, so if nums[i]>0 means other 2 elements>0 so break;
                break;
            if(i!=0 && nums[i]==nums[i-1]) continue; //we dont want repetitive solutions so change for same first element of result set.
            int low=i+1, high= n-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){ 
                    res.add(Arrays.asList(nums[i],nums[low],nums[high])); // if equal, add to result
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) // skip similar low elements untill u get different one
                        low++;
                    while(low<high && nums[high]==nums[high+1])// skip similar high elements untill u get different on
                        high--;
                }
                else if(sum<0) 
                    low++; // sum is less so we need higher number in sorted array
                else
                    high--; //sum is high so we need lower number in sorted array
            }//while
        }
        return res;
    }
}


//----------PROBLEM 1: CONTAINER WITH MOST WATER----------------
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : coming up with constant space solution


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        //bruteforce
        // int max=0;
        // for(int i=0;i<height.length-1;i++)
        //     for(int j=i+1;j<height.length;j++){
        //         max=Math.max(max, Math.min(height[i],height[j])*(j-i));
        //     }
        // return max;
    
        int max=0;
        int low= 0;
        int high=height.length-1;
        while(low<high){
            int curArea=0;
            if(height[low]<=height[high]){
                curArea=(high-low)*height[low]; //current volume
                low++;
            }
            else{
                curArea=(high-low)*height[high];
                high--;
            }
            max=Math.max(max,curArea); //compute all volume but always select the maximum.
        }
        return max;


        //better Solution with less computation 
        // int max=0;
        // int i=0;
        // int j=height.length-1;
        // while(i<j){
        //     int heightVar=Math.min(height[i],height[j]);

        //     if(max<heightVar*(j-i))
        //         max=(Math.min(height[i],height[j])*(j-i));
            
        //     while (height[i] <= heightVar && i < j)
        //         i++;
        //     while (height[j] <= heightVar && i < j)
        //         j--;
        // }
        // return max;
    }
}