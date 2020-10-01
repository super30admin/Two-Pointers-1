package com.javadwarf.leetcode;

public class _75_SortColors {

	public static void main (String[] args)
	{
		/*Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		for(int i =0; i<testCases; i++) {
			int size = s.nextInt();
			int[] a = new int[size];
			for(int x=0; x<size; x++) {
				a[x] = s.nextInt();
			}
			sortColors(a);
			System.out.println();
		}
		s.close();*/

		//String input = "0 2 2 1 0 0 2 0 1 1 1 0 0 2 0 1 2 1 2 0 2 2 0 0 1 2 1 2 2 1 0 2 1 2 1 0 0 1 0 2 0 2 0 1 0 1 2 0 0 2 1 2 2 2 1 0 2 2 0 2 0 0 1 2 1 0 0 2 2 1 2 0 1 2 2 1 2 2 1 2 1 1 2 1 0" ;
		//String input = "2 0 0 2 1 1 0 0 1 1 1 1 2 1 1 1 1 1 0 1 0 2 2 1 2 0 2 2 1 2 1 1 0 1 2 2 0 2 2";
		//String input = "2 0 0 2 1 0 2 2";
		//String input = "0 0 2 2";
		//String input =  "2 1 1 0 1 0";
		//String input =  "0 1 0";

		//String input =  "2 1";
		//String input =  "1 2 0";
		
		String input =  "0 2 1 2 0";
		//String input =  "0 1 0";
		
		String[] arr = input.split(" ");
		int[] arr1 = new int[arr.length];
		for(int x =0; x<arr.length; x++) {
			arr1[x] = Integer.parseInt(arr[x]);
		}
		//sortColors2(arr1);
		sortColors(arr1);
		

	}

	/*
	 * two pass solution
	 * 
	 * one for loop for moving all 0's to left
	 * one for loop for moving all 2's to right
	 * 
	 */
	public static void sortColors2(int[] nums) {

		if(nums.length==0) return;

		int min = 0 ;
		int max = 2;

		int start = 0;
		int end = nums.length-1;

		for(int i=start+1; i<nums.length; i++) {
			if(nums[i]==min) {
				while(start<i && nums[start]==min) {
					start++;
				}
				int temp = nums[i];
				nums[i] = nums[start];
				nums[start] = temp;
			}
		}

		for(int i=end-1; i>=0; i--) {
			if(nums[i]==max) {
				while(end>i && nums[end]==max) {
					end--;
				}
				int temp = nums[i];
				nums[i] = nums[end];
				nums[end] = temp;
			}

		}

		for(int x : nums) {
			System.out.print(x + " ");
		}

	}

	/* One pass solution -- copied from wikipedia
	 idea is to have three variables (low, high , mid ) and try to put low elements to 
	 left of mid and high elements to the right of the mid
	 
	 DUTCH NATIONAL FLAG PROBLEM
	 
	 when mid passes the high that means we need to terminate as all the o's and 2's have been arranged
	 that means 1's are also arranged.
	 
	 */
	// time o(n) and space o(1)
	public static void sortColors(int[] nums) {
		
		if(nums.length==0) return;

		int low = 0;
		int high = nums.length-1;
		int mid = 0;
		
		while(mid<=high) {
			if(nums[mid] == 0) {// if we swap mid with left, we will be surly swapping 0 from mid and 1 from left, so thats why move both left and mid
				int temp = nums[mid];
				nums[mid]= nums[low];
				nums[low] = temp;
				low++;
				mid++;
			}
			else if(nums[mid]==1) {
				mid++;// mid will always like to have 1 so 1 is encountered just move as 1 is in its right place of being in middle
			}
			else if(nums[mid]==2) {
				int temp = nums[mid];
				nums[mid]= nums[high];
				nums[high] = temp;
				high--; // if we swap mid with right, we might be swapping 2 from mid with either 0 or 1 from right, so thats why move right--, we are not doing mid++ as we want to compare the newly swapped number with low also before moving it
			}
		}
		for(int x : nums) {
			System.out.print(x + " ");
		}
	}

	// doesn't work	
	public static void sortColors1(int[] nums) {

		if(nums.length==0) return;

		int min = 0 ;
		int max = 2;

		int start = 0;
		int end = nums.length-1;

		while(start<nums.length-1 && nums[start]==min) {
			start++;
		}

		while(end>0 && nums[end]==max) {
			end--;
		}

		for(int i=start; i<nums.length; i++) {
			if(start>=end) {
				break;
			}
			if(nums[i]==max) {
				int temp = nums[end];
				nums[end] = nums[i];
				nums[i] = temp;
				while(end>i && nums[end]==max) {
					end--;
				}
			}
			if(nums[i] == min) {
				int temp = nums[start];
				nums[start] = nums[i];
				nums[i] = temp;
				while(start<i && nums[start]==min) {
					start++;
				}
			}

			if(i>=end) {
				break;
			}

		}
		for(int x : nums) {
			System.out.print(x + " ");
		}

	}


}
