//space - constant
//time - linear - O(n)
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return;
        }
        
        //low pointer -> elements to left of low are all 0s
        //high pointer -> elements to right of high are all 2s
        int low = 0;
        int high = nums.length - 1;
        int index = 0;
        
        while(index <= high)
        {
            if(nums[index] == 0)
            {
                //swap with element at low, increament low and index
                swap(nums, low, index);
                low++;
                index++;
            }
            else if(nums[index] == 2)
            {
                //swap with element at high and reduce high
                swap(nums, index, high);
                high--;
            }
            else
            {
                //increase index
                index++;
            }
        }
        
        return;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
}
