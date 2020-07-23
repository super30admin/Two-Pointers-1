
public class Sort_colors {
	//Approach: 1. To sort colors, am assigning 3 pointers, low to 0, mid to 1, and high to 2. low and high stays, mid is the moving pointer.
	//2. I will iterate through the loop, i will compare mid to values, if its an index where the value is 1, i will just move ahead, or if its 0 i will swap it with low,
	// or if its 2 i will swap it with high. 
	//3. While swapping, if am swapping with low, I can increment both low and mid pointers as we are sure what the numbers will be, but while swapping with high we dont increment mid,
	// since the number we swap with high is unknown to us. 
	
	public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high)
        {
            if(nums[mid] == 1)mid++;
            else if(nums[mid] == 0)
            {
                swap(nums, low, mid);
                mid++;low++;
            }   
            else
            {
                swap(nums, mid, high);
                high--;
            }    
        }
    }
    
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//Time Complexity : O(n) 
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :