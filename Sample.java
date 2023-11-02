// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Trapped Rain Water
//Time Complexity -> O(n) -> as we are iterating over each element only once
//Space Complexity -> O(1)
class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int low = 0;
        int high = n-1;
        int maxArea = 0;
        while(low<=high){
            int currArea = 0;
            if(height[low]<height[high]){
                currArea = height[low]*(high-low);
                low++;
            }else{
                currArea = height[high]*(high-low);
                high--;
            }
            maxArea = Math.max(currArea,maxArea);
        }

        return maxArea;
        
    }
}

//sort Colors
//Time Complexity -> O(n)
//Space Complexity -> O(1)
class Solution {
    //In place
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(mid<=high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                
                high --;

            }else if(nums[mid] == 0){
                swap(nums,mid,low);
                mid++;
                low ++;
            }else{
                mid ++;
            }
        }
        
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
}

//3 Sum
//Time Complexity -> O(nlogn) + O(n^2) nlogn for sorting and n2 
//because for each element we are doing 2 sum which is O(n)
//Space Complexity -> O(1)
class Solution {
    //Using 2 pointers
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < n-2;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            if(nums[i]>0) break;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum  == 0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low<high && nums[low]== nums[low-1]){
                        low ++;
                    }
                    while(low<high && nums[high] == nums[high+1]){
                        high --;
                    }
                }
                else if(sum<0){
                    low ++;
                }
                else{
                    high --;
                }

            }
        }

        return result;
        
    }
}

//Using Hashing
//Time Complexity -> O(nlogn) + O(n^2) 
//Space Complexity -> O(n) -> space for hashset
class Solution {
    //Using hashing 
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < n-2;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            if(nums[i]>0) break;
            Set<Integer> set= new HashSet();
            int target = -nums[i];
            for(int j = low; j<=high;j++){
                int complement = target- nums[j];
                if(set.contains(complement)){
                    result.add(Arrays.asList(nums[i],nums[j],complement));
                    while(j+1<n && nums[j]== nums[j+1]) j++;
                }
                else{
                   set.add(nums[j]);                
                }
                
            }

        }

        return result;
        
    }
}
