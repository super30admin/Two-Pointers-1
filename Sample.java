// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int low =0; int high = height.length-1;
        while(low<high){
            if(height[low]< height[high]){
                max = Math.max(max,(high-low)*height[low]);
                low++;
            }else{
                max = Math.max(max,(high-low)*height[high]);
                high--;
            }
                
        }
        return max;
    }
}


// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int low = 0; int mid =0; int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
               //Swap(nums,mid,low);
                int i= (nums[mid]+nums[low])-nums[low];
               int j = (nums[low]+nums[mid])-nums[mid];
                nums[low] =i;
                nums[mid] =j;
                low++;
                mid++;
                
            }else if(nums[mid] ==2){
                //Swap(nums,mid,high);
                int i= (nums[mid]+nums[high])-nums[high];
                int j= (nums[mid]+nums[high])-nums[mid];
                nums[high] =i;
                nums[mid] = j;
                high--;
                //mid++;
            }else
                
                mid++;
            
        }
    }
        // public void Swap(int [] nums,int i ,int j){
        //     int temp = nums[i];
        //     nums[i] = nums[j];
        //     nums[j] = temp;
        // }
    
}
// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            //outside duplicacy
            if(i!=0&&nums[i] == nums[i-1]) continue;
            int low = i+1;int high = nums.length-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while(low < high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low < high && nums[high]==nums[high+1]){
                        high--;
                    }
                }else if(sum >0){
                        high--;
                    }
                else
                    //while(nums[low] == nums[low-1]){
                        low++;
                    //}
                    
            }
        }
        return result;
    }
    
}