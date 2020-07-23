/*******************************************Approach 1 - Brute Force***************************************/
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/* Comparing each number with next number and swap*/

public class SortColors {
	public void swap(int[] nums, int a, int b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    
    public void sortColors(int[] nums) {
      for(int i= 0; i<nums.length; i++){
          for(int j=i+1; j<nums.length; j++){
              if(nums[i] > nums[j])
                  swap(nums, i, j);
          }
      }
    }
}

/*******************************************Approach 2***************************************/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

/* If the number is 0 then swap the number mid with low and increment both the pointers.
 * if the number is 1 then keep it as it is but increment mid.
 * If the number is 2 then swap the number mid with high and decrement high.
*/
public class SortColors {
	public static void sortColors(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length-1;
		
		while(mid <= high) {
			if(nums[mid] == 0) {	//If the number is 0 then swap the number with the number at index low and increment low and mid
				swap(nums, low, mid);
				low++;
				mid++;
			}
			else if(nums[mid] == 1)	//If the number is 1 then increment mid
				mid++;
			else if(nums[mid] == 2) {	//If the number is 2 then swap the number with the element at index high and decrement high
				swap(nums, mid, high);
				high--;
			}
		}
	}
	
	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for(int i=0; i<nums.length; i++)
		System.out.print(nums[i]);
	}
}


/*******************************************Approach 3***************************************/
//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : no

/* Count the number of 0s, 1s and 2s in the array.
 * store all the 0s in the beginning followed by all the 1s then all the 2s */
public class SortColors {
	public static void sortColors(int[] nums) {
		int i, count0 = 0, count1 = 0, count2 = 0;
		
		// keep Count of number of 0s, 1s and 2s 
        for(i=0; i< nums.length; i++){
            if(nums[i] == 0) count0++;
            if(nums[i] == 1) count1++;
            if(nums[i] == 2) count2++;
        }
        
        i=0;	// updating the array
        	
        while(count0 > 0){	//Store all the 0s in the beginning 
            nums[i++] = 0;
            count0--;
        }
        while(count1 > 0){	// then Store all the 1s 
            nums[i++] = 1;
            count1--;
        }
        while(count2 > 0){	// then Store all the 2s
            nums[i++] = 2;
            count2--;
        }
	}

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for(int i=0; i<nums.length; i++)
		System.out.print(nums[i]);
	}
}