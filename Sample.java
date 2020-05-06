// Time Complexity : O(n) where n is the num of elements in nums arr
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes

// Prob-1:
class Solution {
    public void sortColors(int[] nums) {
        
       int low = 0;
       int high = nums.length -1;
        
        int mid =0;
        
        while ( mid <= high ) {
            
            switch ( nums[mid]) {
                case 0:
                    int temp = nums[low]; //swap
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                    
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    int temp1 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp1;
                   high--;                    
                default:
                    break;      
            }
        } 
    }
}


//prob-2:
// Time Complexity : O(n log n) + O(n^2) = n^2 . n log n to sort an array of n elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        // int sum =0;
        Arrays.sort(nums);
        int size = nums.length;
        for(int i=0; i < nums.length-2; i++){
            
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
            
            if( sum == 0){
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                
//                 check for the duplicates and skipping them
                int leftNum = nums[j];
                while( j < size && leftNum == nums[j] ){
                    j++;
                }
                
                int rightNum = nums[k];
                while( k > j && rightNum == nums[k]){
                    k--;
                }
            }else if( sum > 0){
                k--;
            }else if( sum < 0){
                j++;
            }
        }

//         getting rid of duplicates when it comes to current element or i
            while( i+1 < size && nums[i] == nums[i+1]){
                i++;
            }
    }
        
        return result;
}
}


//prob-3:
// Time Complexity : O(n) where n is the hieght of each boundary
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0 || height == null) return 0;
        int start=0;
        int end=height.length-1;
        int max = Integer.MIN_VALUE;
        while(start<end){
            if(height[start] <= height[end]){
                max = Math.max(max, height[start] * (end-start));
                start++;
            }else{
                max = Math.max(max, height[end] * (end-start));
                end--;
            }
        }
        return max;
    }
}

