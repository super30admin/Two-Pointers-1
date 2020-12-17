// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*using 3 pointer approach, with low-pointer pointing to index 0, mid pointing to index 0 and high pointer pointing to last element. 
when the mid element is 0, swap the low and mid and increment low and mid
when the mid element is 1, increment mid by 1
when the mid element is 2, swap mid and high and decrement high*/

public class SortColors{
	
	private int[] swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
		
		return nums;
	}
	
	public int[] getsortedColors(int[] nums) {
		
		if(nums==null || nums.length==0) {
			return nums;
		}
		
		int l =0, m=0, h=nums.length-1;
		
		while(m<=h) {
			if(nums[m]==1) {
				m++;
			}
			else if(nums[m]==0) {
				swap(nums,l,m);
				l++;
				m++;		
			}
			else if(nums[m]==2) {
				swap(nums, m,h);
				h--;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		SortColors ob = new SortColors();
		int[] nums = {2,0,2,1,1,0};
		int[] printRes = ob.getsortedColors(nums);
		
		for(int i=0;i<printRes.length;i++) {
			System.out.println("i:"+i +" " +printRes[i]);
		}
	}
}