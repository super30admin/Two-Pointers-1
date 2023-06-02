class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums .length == 0)return;
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(mid,high,nums);
                high--;
            }else if(nums[mid] == 0){
                swap(mid,low,nums);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    public void swap(int i , int j, int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        System.out.println(""+nums[i]+""+nums[j]);
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int l = nums.length;
        //3sum
        for(int i=0; i<l-2; i++){
            //removing external duplicates
            if(i!=0 && nums[i] == nums[i-1]) continue;
            //2sum
            int com = 0-nums[i];
            int j = i+1;
            int k = l-1;
            while(j<k){
                int sum = nums[j]+nums[k];
                if(sum > com){
                    k--;
                    
                }else if(sum < com){
                    j++;
                    
                }else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
            
        }
        return result;
    }
}

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while(low < high){
            max = Math.max(max,Math.min(height[low],height[high]) * (high - low));
            if(height[low] < height[high]){
                low++;
            }else if (height[low] == height[high]){
                low++;
                high--;
            }
            else{                
                high--;
            }
        }
        return max;
    }
}
