//B-F approach- take hashmap and store nums[i] as key and count as value and then go through hashmap and re-arrange it. it will use extra space O(n), traverse time for array and hashmap lookup - O(n), also it doesn't satisfy the condition of sorting IN-PLACE. 


//approach- Take three pointer low, mid (both pointing to zero) and high pointing at the end of matrix
//as the name suggest - low is for red, mid for white and blue for high
// we keep moving mid pointer only, when we swap values, that respective pointer will be incremeneted or decremented accordingly - let say low++ and blue --. 
//TC - O(n)
//SC- O(1)

class Solution {
    public void sortColors(int[] nums) {
	//base case
		if(nums ==0 || nums.length ==0) return;
		
		//red->0,  white -> 1, blue -> 2
		
		int low_red =0, mid_white =0, high_blue =nums.length-1;
		
		while(mid_white <= high_blue)
		{
			int temp = 0;
			if(mid_white == 0)//color red =0
			{
				temp = nums[low_red];
				nums[low_red] = nums[mid_white];
				nums[mid_white] = temp;
				low_red++;
			}
			if(mid_white == 2)//color blue
			{
				temp = nums[high_blue];
				nums[high_blue] = nums[mid_white];
				nums[mid_white] = temp;
				high_blue--;
			}
			else //it's white
			{
				mid_white++;
			}
		}
	}
}