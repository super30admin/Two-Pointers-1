// Time Complexity : O(n)
// Space Complexity : O(1)
public class SortColors {
	public void sortColors(int[] nums) {
		//null case
		if(nums==null || nums.length==0) return;
		
		//Low collecting 0
		//Mid collecting 1
		//High collecting 2		
		int low=0;
		int mid=0;
		int high= nums.length-1;		
		while(mid<=high) {			
			if(nums[mid]==2) { //swap with high
				swap(nums, mid, high);
				high--;
			}else if(nums[mid]==0) { //swap with low
				swap(nums, mid, low);
				low++;
				mid++;
			}else {
				mid++;
			}
		}
		System.out.println("Colors Sorted!");
	}
	//Swap elements at given indices in array
	private void swap(int[] nums, int idx1, int idx2) {
		int temp= nums[idx1];
		nums[idx1]= nums[idx2];
		nums[idx2]= temp;
	}
	
	//Driver Code
	public static void main (String[] args) {
		SortColors ob= new SortColors();
		int[] nums= {2,0,2,1,1,0};	
		ob.sortColors(nums);		
	}
}
