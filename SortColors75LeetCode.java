//Time Complexity : O(n)
//Space Complexity : O(1)
//runs successfully on leetcode
//didn't face any problems


public class SortColors75LeetCode {
    public void sortColors(int[] nums) {

        int l = 0;                          //left pointer before this all will be 0
        int a = 0;                          //running pointer before this all will be 0,  1
        int r = nums.length - 1;            //right pointer after this all will be 2

        while(a<=r){                        //running is less then right

            if(nums[a] == 2){               //if running point to 2 then
                swap(nums, a, r);           //swap running and right pointer elements
                r--;                        //decrement the right pointer

            }
            else if(nums[a] == 0){          //if running point to 0 then
                swap(nums, a, l);           //swap running with left pointer
                l++;                        //increment running and left pointer
                a++;
            }
            else{
                a++;                        //if running point to 1 then increment running pointer
            }
        }

    }


    public void swap(int[] nums, int elementIndex1, int elementIndex2){

        int temp = nums[elementIndex1];
        nums[elementIndex1] = nums[elementIndex2];
        nums[elementIndex2] = temp;

    }

}

