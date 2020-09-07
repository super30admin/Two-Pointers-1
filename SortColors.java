// Time Complexity : O(N) as we will run the while for max N times.
// Space Complexity : O(1) as we are using 2 pointers.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Struggled a bit deciding how
                                // do I update my iterating pointer 'x'.

class SortColors {
    public void sortColors(int[] nums) {
        if(nums.length == 1) {
            return;
        }
        //initialize two pointers,
        //one points where next 0 can go
        //other points where next 2 can go
        int zI = increaseZero(nums, 0);
        int tI = reduceTwo(nums, nums.length-1);
        
        //intialize x, our iterating pointer to zI
        //because everything before this will be 0
        int x = zI;
        while(x < nums.length && x <= tI && zI <= tI) {
            if(nums[x] == 2) {
                //if current num is 2, put it at tI and update pointers
                nums[x] = nums[tI];
                nums[tI--] = 2;
                tI = reduceTwo(nums, tI);
            } else if(nums[x] == 0 && x != zI) {
                //if current num is 0, put it at zI and update pointers
                nums[x] = nums[zI];
                nums[zI++] = 0;
                zI = increaseZero(nums, zI);
                x = zI;
            } else {
                //else keep going
                x++;
            }
        }
    }
    
    public int reduceTwo(int[] nums, int index) {
        while(index > 0 && nums[index] == 2) {
            index--;
        }
        
        return index;
    }
    
    public int increaseZero(int[] nums, int index) {
        while(index < (nums.length - 1) && nums[index] == 0) {
            index++;
        }
        
        return index;
    }
}
