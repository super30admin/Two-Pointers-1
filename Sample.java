// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :nope


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int cur=0;
        while(cur<=high){
            if(nums[cur]==0){
                int temp=nums[cur];
                nums[cur]=nums[low];
                nums[low]=temp;
                cur++;
                low++;
            }
            else if(nums[cur]==2){
                if(nums[high]==2){
                    high--;
                }else{
                    int temp=nums[high];
                    nums[high]=nums[cur];
                    nums[cur]=temp;
                    high--;
                    
                    }
            }else{
                cur++;
            }
        }
        
    }
}


// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
    
    for(int i=0;i<nums.length;i++){
        if(i==0||nums[i-1]!=nums[i]){
        twosum(nums,i,res);
    }
    }
       return res; 
    }
    public void twosum(int[] nums,int index, List<List<Integer>> res){
        int j=index+1;
        int high=nums.length-1;
        while(j<high){
            if(nums[index]+nums[j]+nums[high] == 0){
                List<Integer> n1=new ArrayList<Integer>();
                n1.add(nums[index]);
                n1.add(nums[j]);
                n1.add(nums[high]);
                
                res.add(n1 );
                j++;
             while (j < high && nums[j] == nums[j - 1])
                    ++j;
                
            }
            if(nums[index]+nums[j]+nums[high] < 0){
                j++;
            }
             if(nums[index]+nums[j]+nums[high] > 0){
                high--;
            }
        }
    }
}





// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        if(height.length==0 || height==null){
            return 0;
        }
        int low=0;
        int high=height.length-1;
        int area=0;
        while(low<high){
            area=Math.max((Math.min(height[low],height[high]) * (high-low)),area);
                if(height[low]<height[high]){
                    low++;
                }else{
                    high--;
                }
        }
        return area;
        
    }
}