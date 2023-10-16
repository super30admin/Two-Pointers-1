//we have 3 pointers, low, mid and high
//the low and mid pointer, points to the beginning of the array 
//high pointer points to the end of the array
//when iterating through the array in while loop where mid <= high
//we check if the current mid pointer value is 0 then we swap with mid
//else if it is 2 then we swap with high pointer
//incrementing mid pointer along the way 
//since we only have 3 colors to sort here

//Time Complexity : O(n) -- iterating through the array
//Space Complexity : O(1) -- no additional auxilliary space used

public class SortColors {
    
    public static void main(String[] args)
    {
        int nums [] = {2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(low, mid, nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(mid,high,nums);
                high--;
            }
            else
            {
                mid++;
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("Elements " + nums[i] );
        }
    }

    private static void swap(int one, int two, int[] nums)
    {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}
