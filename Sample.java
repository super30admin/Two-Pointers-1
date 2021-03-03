// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/*
 * Keep 3 pointers -> Low(0's) High(2's) Mid(1's). Make moves based on mid values
 * when '0' it means we need to swap the mid with low, also mid can be moved -> all possible 2's will be moved to the high.
 */

    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length==0)
            return;
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,high,mid);
                high--;
            }
            else if(nums[mid]==1){
                mid++;
            }
        }
    }
    
    private void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

 // Time Complexity :O(n^2)
 // Space Complexity :O(1) -> discarding the result list which is sent back
 // Did this code successfully run on Leetcode : yes
 // Any problem you faced while coding this :no


 // Your code here along with comments explaining your approach
 /*
  * A two pointer approach on each element. Considering a left and right pointer to the right of each element.
  * A current Sum is calculated by considering the current number, left number and right number.
  * A condition to handle duplicates is identified at both initial level and at the nested level.
  */
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length==0)
            return result;
        
		Arrays.sort(nums);
		
		
		
		int left = 0;
		int right = 0;
        int targetSum = 0;
		
		for(int cN=0;cN<nums.length-2;cN++){
            
			left = cN+1;
			right = nums.length-1;
			
            if(cN==0 || nums[cN]!=nums[cN-1]){
                while(left<right){
				int cS = nums[cN]+nums[left]+nums[right];
				if(cS==targetSum){
                    List<Integer> triplet = Arrays.asList(nums[cN],nums[left],nums[right]);
					result.add(triplet);
					left++;
					right--;
                    while(left<right && nums[left]==nums[left-1])
                        left++;
                    while(left<right && nums[right]==nums[right+1])
                        right--;
				}
				else if(cS>targetSum)
					right--;
				else
					left++;
			    }
            }
			
		}
		
        return result;
    }
    
    
    // Time Complexity :O(n)
    // Space Complexity :O(1)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this :no


    // Your code here along with comments explaining your approach
    /*
     * A two pointer approach, calculate the area of each of the heights. Multiply height by width.
     * calculate the max area, by moving the low pointer when height of low is less than height of high.
     * Similarly reduce the high pointer when height of high is less than height of low.
     */
    
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
            return 0;
        
        int low = 0;
        int high = height.length-1;
        
        int max = Integer.MIN_VALUE;
        
        while(low<high){
            max = Math.max(max,Math.min(height[low],height[high])*(high-low));
            
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        
        return max;
        
    }
 