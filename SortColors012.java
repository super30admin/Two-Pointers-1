import java.util.Arrays;
public class SortColors012 {


        public void sortColors(int[] nums) {

            int n = nums.length;

            if(nums == null || n == 0) return;

            int pointer0 = 0, pointer1 = 0, pointer2 = n-1;

            while(pointer1 <= pointer2){ // O(n)

                // push 2 to the end and reduce the last pointer
                if(nums[pointer1] == 2){

                    swap(nums, pointer1, pointer2);
                    pointer2--;
                }
                // keep 1 in middle and iterate further
                else if(nums[pointer1] == 1){

                    pointer1++;
                }
                // push 0 to the beginning and update both pointers
                else{

                    swap(nums, pointer1, pointer0);

                    pointer0++;
                    pointer1++;
                }
            }
        }
        private void swap(int[] nums, int i, int j){

            if(i == j) return;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }


        /*
        Time Complexity = O(n)
        Space Complexity = O(1)
        */

        public static void main(String[] args){

            SortColors012 object = new SortColors012();

            int[] colors = {2, 0, 1, 0, 0, 1, 2};

            object.sortColors(colors);

            System.out.println("Sorted color array is " + Arrays.toString(colors));
        }
}
