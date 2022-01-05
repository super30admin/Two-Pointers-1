/*
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
*/




class Solution {
    public void sortColors(int[] nums) {
        // two pass solution
        int red = 0; // for counting 0
        int white = 0;// for counting 1
        int blue = 0; // for counting 2

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                red++;
            }
            else if(nums[i] == 1)
                white++;
            else
                blue++;
        }


        int count = 0;

        while(count < red){
            nums[count++] = 0;
        }
        while(count < red + white){
            nums[count++] = 1;
        }
        while(count < nums.length){
            nums[count++] = 2;
        }

    }

       // single pass solution

        int zero = 0;
        int curr = 0;
        int two = nums.length - 1;

        while(curr <= two){
            if(nums[curr] == 0){
                swap(nums,zero, curr);
                curr++;
                zero++;
            }
            else if(nums[curr] == 2){
                swap(nums,two,curr);
                two--;
            }
            else{
                curr++;
            }
        }


    }

    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

        return;
    }
}
