//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
    int low = 0;
    int high = nums.length-1;
    int current = 0;
    while(current<=high){
        if(nums[current] ==0){
            //swap(low, current);
            int temp = nums[low];
            nums[low] = nums[current];
            nums[current] = temp;
            low++;
            current++;    
        }else if(nums[current] == 2){
           // swap(high, current);
            int temp2 = nums[high];
            nums[high] = nums[current];
            nums[current] = temp2;
            high--;
        }else{
            current++;
        }
    }
            
    }
}
