public class sortcolors {
    //start: Points to the first available position for a 0 (red)
    //end: Points to the last available position for a 2 (blue)
    //index: The current element under consideration. It iterates through the array from left to right.
    // elements are swapped based on the position and color and then pointers are moved accordingly.

    //Time Complexity: O(n)
    //Space Complexity: O(1)
        public void SortColor(int[] nums) {

        if(nums.Length==0|| nums.Length==1)
        return ;

        int start=0,index=0;
        int end=nums.Length-1;
        while(index<=end )
        {
            if(nums[index]==0)
            {
                nums[index]=nums[start];
                nums[start]=0;
                start++;
                index++;
            }
            else if(nums[index]==2)
            {
                nums[index]=nums[end];
                nums[end]=2;
                end--;
            }
            else
            {
                index++;
            }

        }
    }
}
