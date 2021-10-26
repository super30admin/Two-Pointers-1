//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i:nums) {
            switch(i) {
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
            }
        }

        for(int i=0;i<zero;i++) {
            nums[i] = 0;
        }

        for(int i=zero;i<zero+one;i++) {
            nums[i] = 1;
        }

        for(int i=zero+one;i<zero+one+two;i++) {
            nums[i] = 2;
        }
    }
}