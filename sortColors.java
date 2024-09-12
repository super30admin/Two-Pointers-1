/* 75. Sort Colors, Dutch National Flag Algorithm Question
Time Complexity: O(n)
Space Complexity: O(1)
Try to use contant space
*/

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;

        int c1 =0, c2=0, c3=0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0)
                c1++;
            else if(nums[i] == 1)
                c2++;
            else
                c3++;
        }

        int i = 0;
        while(c1 > 0){
            nums[i++] = 0;
            c1--;
        }

        while(c2 > 0){
            nums[i++] = 1;
            c2--;
        }

        while(c3 > 0){
            nums[i++] = 2;
            c3--;
        }
    }
}

/* 75. Sort Colors
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public void sortColors(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) +1);
        }

        int index=0;

        for(int j : map.keySet()){
            for(int i=0;i < map.get(j); i++ ){
                nums[index]=j;
                index++;
            }
        }
    }
}

/* 75. Sort Colors
Time Complexity: O(n)
Space Complexity: O(1)
Try to use contant space
*/

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid<=high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else
                mid++;
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
