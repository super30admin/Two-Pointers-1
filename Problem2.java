
/**
Leet Code Submitted : YES
Space Complexity : O(1)
Time Complexity : O(N^2)

The idea is to iterate each position in the array after sorting and check if the sum goes overflow or underflow and accordingly increases/decreases pointer.
**/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> out = new ArrayList<>();
        
        if(nums == null || nums.length < 1)
            return out;
        
        int low_pointer = 0;
        int high_pointer = nums.length - 1;
        
        Arrays.sort(nums);
        
        for(int i  = 0; i< nums.length; i++){
            
            low_pointer = i+1;
            high_pointer = nums.length - 1;
            
            while(low_pointer < high_pointer){
                int tempLow   = nums[low_pointer];
                int tempHigh  = nums[high_pointer];
                int tempSum  = nums[i] + tempLow + tempHigh;
            if(tempSum  < 0){
                low_pointer ++;
            }else if(tempSum > 0){
                high_pointer --;
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(tempLow);
                temp.add(tempHigh);
                
                if(!out.contains(temp))
                    out.add(temp);
                low_pointer = low_pointer + 1;
            }
            
        }
        
        }
        return out;
        
        
    }
}
