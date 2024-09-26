//Time Complexity : O(n)
//Space Complexity : O(1)
//Run successfully on leetcode
//Had to think about which pointers to put condtions on. Understood it perfectly

//Here we will be swaps on the basis of middle pointer. If middle pointer is on its perfect position, will be increasing it
//If middle pointer is behind its position,We will be swapping with low pointer and increasing both the pointers
//If middle pointer is ahead of its position, we will be swapping with high pointer and decreasing the high by one


public class Two_Pointers_1_Problem_1_sortColors {
    public static void sortColors(int[] nums) {
        int length = nums.length;
        int left = 0;
        int mid = 0;
        int right = length - 1;
        while(mid <= right)
        {
            if(nums[mid] == 1)
            {
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid] == 0)
            {
                swap(nums,mid,left);
                mid++;
                left++;
            }
        }
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void printArr(int[] nums)
    {
        for(int i =0 ; i < nums.length; i ++)
        {
            System.out.print(nums[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        printArr(arr);
        sortColors(arr);
        System.out.println();
        printArr(arr);
    }
}
