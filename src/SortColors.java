// Time Complexity:           O(n)
// Space Complexity:          O(1)
// where n is length of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,1,1,1,2,0,2,1,1};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        for (int i:nums) {
            System.out.print(i+" ");
        }
    }
    public void sortColors(int[] nums) {
        int a=0, b=0, c=nums.length-1;                      // a=>0, b=>1, c=>2
        while(b<=c)                                         // repeat until b crosses c
        {
            if(nums[b]==2)                                  // if b=2
            {
                swap(nums, b, c);                           // then swap b & c
                c--;                                        // and decrement c
            }
            else if(nums[b]==1)                             // if b=1
            {
                b++;                                        // then increment b
            }
            else                                            // if b=0
            {
                swap(nums, a, b);                           // then swap b & a
                a++;                                        // and increment b & a
                b++;
            }
        }
    }
    private void swap(int[] arr, int x, int y)              // swapping values
    {
        arr[y] = arr[x] + arr[y] - (arr[x]=arr[y])  ;
    }
}
