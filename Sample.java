// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Sort Colors
//TC : O(N)
//SC O(1)
class Solution {
    public void sortColors(int[] nums) {
        int start  =0;
        int end = nums.length-1;
        
        int index =start;
        
        while(index<=end && start<end){
            if(nums[index] == 0){
            nums[index] = nums[start];
            nums[start] = 0;
            start++;
            index++;
            }
            else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
            else
            index++;
            
        }
      
    }
}



//ThreeSum
//TC : O(N^2)
//SC O(1)
class Solution {
 public List<List<Integer>> threeSum(int[] num) {
     
    Arrays.sort(num);     
    List<List<Integer>> res = new ArrayList<>();
     
     
       for (int i = 0; i < num.length-2; i++) {
       if(i==0 || (i>0  && num[i]!=num[i-1])) { 
      
        int target= 0-num[i], l=i+1, r = num.length-1;
        
        while(l<r)
        {
            if((num[l] + num[r]) == target)
            {
                res.add(Arrays.asList(num[i],num[l],num[r]));
                while(l<r && num[l] == (num[l+1])) l++;
                
                while(l<r && num[r] == (num[r-1])) r--;
                
                l++; r--;
            }     
            else if((num[l]+num[r]) < target ) l++;
            else r--;       
        }  
}
       
       }
return res;    
} 
}

//Container With most water
//TC : O(n) 
//SC = O(1)
class Solution {
    public int maxArea(int[] height) {
        
    int maximum_area=0; // 8
    int current_area=0;   
        
        
    int left = 0; //put my left to extreme left index
    int right = height.length-1; // my right ot the rightmost index
        
    
        
        while(left<right){
            
         current_area = Math.min(height[left],height[right])*(right-left);
            
            if(current_area > maximum_area){
                maximum_area = current_area;
            }
                if(height[left] < height[right]){
                  left++;
                }
                else right--;
            }
        
        return maximum_area;
    }
}


