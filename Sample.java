
//Sort colors
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
       
        int i=0; // boundary for 0
        int j=nums.length-1; // boundary for 2
        int k=0; // current element
        while(k<=j) // traverse till current pointer does not reach the boundary of 2
        {
            if(nums[k] == 0) // if curr element is 0 (to sort zeros)
            {
                   int temp= nums[k]; // swap elements k and i
                   nums[k] = nums[i]; 
                   nums[i] = temp;
                    i++;   // increment both pointers
                    k++;
            }
            
           else if(nums[k] == 2) // if curr element is 2 ( to sort ones)
            {
                   int temp= nums[k]; // swap elements k and j
                   nums[k] = nums[j];
                   nums[j] = temp;
                    j--;    // decrement j
            }
            else
                k++; // if current element is 1, increase k as 1 will automatically be sorted
            
        }
        
    }
    
    
}

//Container with most water
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach


class Solution {
    public int maxArea(int[] height) {
        int i=0; // left pointer
        int j=height.length-1; // right pointer
        int max = Integer.MIN_VALUE; // to calculate max area found
        while(i<j) // till the two pinters dont cross each other
        {
           int water = Math.min(height[i], height[j]) * (j-i);  // caluclating the area by considering min between the two heights as that would be the amount of water filled
           max = Math.max(max, water); // find max between previous found max and current water area
           if(height[i] <height[j]) // to maximize the area we increase i if it is less than j 
        
        return max;
    }
}

//3 sum
// Time Complexity : O(nlogn + n^2) = O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
     List<List<Integer>> list = new ArrayList<>();
        
        if(nums==null || nums.length <3) // if length<3 then no triplets
            return new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // first sort the array
        
      for(int i=0;i<n-2;i++) // to keep track of outer index
      {
         int low = i+1;
         int high = n-1;
         
          //duplicates check for outer index
          if(i> 0 && nums[i] == nums[i-1])
              continue; // if both value same, no need to check
          
          if(nums[i] > 0)
              break; // wont find sum 0 in a sorted array after 0 as values more than 0
    
          while(low<high) // can't consider value again so no equal check
          {
              int sum = nums[i] + nums[low] + nums[high]; // finding sum
              if(sum == 0) // checking sum with target
              {
                List<Integer> li= Arrays.asList(nums[i],nums[low],nums[high]); // making a list
                  Collections.sort(li); // sorting
                    list.add(li); // adding to final list
                    // here no need to check if list already contains the triplet as duplicacy has been checked at indices
                  
                  low++; // more triplets could be present
                  high--;
                  
                  //duplicates check for inner index 
                  while(low<high && nums[low] == nums[low-1])
                  {
                      low++;
                  }
                  while( low<high && nums[high] == nums[high+1])
                  {
                      high--;
                  }
              }
              else if(sum<0) // if sum > 0 
              {
                  low++; // need to increase sum so increment low
              }
              else
              {
                  high--; // need to decrease sum so decrement high
              }
          }
      }
        return list;
        
    }
}