/*
Time Complexity: O(n)
Space Complexity: O(n)
Code run on Leetcode: yes
Any difficulties: no

Approach: attempted after the class

 */
public class SortColors {

    public static void sortColors(int [] nums){
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int num: nums){
            switch(num){
                case 0:
                    zeros++;
                    break;
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
            }
        }

        for(int i = 0; i<zeros; i++){
            nums[i] = 0;
        }
        for(int i = zeros; i<zeros+ones; i++){
            nums[i] = 1;
        }
        for(int i = zeros+ones; i<zeros+ones+twos; i++){
            nums[i] = 2;
        }
    }

    public static void main(String[] args){
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+",\t");
        }
    }
}
