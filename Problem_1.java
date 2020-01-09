
public class Problem_1 {
public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return;
        }
        
        int mid = 0, low = 0;
        int high = nums.length - 1;
        
        while(mid <= high){
            
            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else{
                
                swap(nums, high, mid);
                
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
