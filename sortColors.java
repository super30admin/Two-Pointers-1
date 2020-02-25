/*
1. I wll be taking 3 pointers for one , zero and two
2. collect all once at middle , all the zeros at start and  
all the twos are at the end
*/
class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int one=0, zero=0, two=len-1;
        while(one<= two){
            //case1 
            //if number at pointer one is 2 then we swap 
            if(nums[one] == 2){
                nums[one] = nums[two];
                nums[two--] = 2;
            }
            //case2
            else if(nums[one] == 0){
                nums[one] = nums[zero];
                nums[zero++] = 0; 
                one++; //increase one pointer because i am sure I have put zeor at this location now so one is never gonna come
            }
            //case3
            else // nums[one]==1
                one++; //one is supposed to point to 1 so when the current element is 1 increase one's pointer
        }
    }
}



