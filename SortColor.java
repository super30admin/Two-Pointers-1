class Solution {
    public void sortColors(int[] nums) {
        // 1. Take 3 variable to represent occurence of 2 , 0 & 1
        // 2. Iterate through nums & update variable as per occurence
        // 3. overwrite nums , first see 0s occurence & loop & write those & so on for other variable
        // Time = o(n) for occurence & o(n) for overrite = 2 o(n) , Space = o(1)

        // for one pass take 3 pointer low , med & high

        int zero = 0;
        int one = 0;
        int two = 0;

        for( int i = 0; i<nums.length; i++ ){
            if( nums[i] == 0 ){
                zero++;
            }
            else if( nums[i] == 1 ){
                one++;
            }
            else{
                two++;
            }
        }

        int zeroCount = 0;
        int index = 0;
        while( zeroCount  < zero ){
            nums[index] = 0;
            zeroCount++;
            index++;
        }
        int oneCount = 0;
        while( oneCount  < one ){
            nums[index] = 1;
            oneCount++;
            index++;
        }
        int twoCount = 0;
        while( twoCount  < two ){
            nums[index] = 2;
            twoCount++;
            index++;
        }
    }
}