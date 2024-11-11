// Time Complexity: Time complexity O(n) as each element is traversed once
// Space Complexity : O(1)
// Ran on Leetcode : Yes
// Any problem s encountered: No
public class SortColours {
    public void sort (int [] nums){
        int low = 0; // low pointer tracks 0s
        int mid = 0; // mid pointer for traversing the array
        int high = nums.length -1; // high pointer for tracking 2's

        while (mid <= high){
            if(nums[mid] == 0) {// mid is zero then swap mid with low and increment both mid anf low pointers
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1){ // we already have 1s in the middle, so now just increment mid
                mid++;
            } else if(nums[mid] == 2){ // if mid is at 2 then swap mid with high and decrement high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }

        }


    }

    public static void main (String[] args){
        SortColours solution = new SortColours();
        int [] nums = {0,2,1,0,2,1};
        solution.sort(nums);
        for(int num: nums){
            System.out.println(num + "");
        }

    }
}
