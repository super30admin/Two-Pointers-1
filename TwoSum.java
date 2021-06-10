import java.util.Arrays;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		
		int n=numbers.length;
		int leftp= 0;
		int rightp=n-1;
		
		while(leftp<rightp) {
			int sum= numbers[leftp]+numbers[rightp];
			if(sum<target) {
				leftp++;
			}else if (sum>target) {
				rightp--;
			}else {
				return new int[] {leftp+1,rightp+1};
			}
		}
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		int[] arr= new int[] {2,7,11,15};
		System.out.println(Arrays.toString(new TwoSum().twoSum(arr, 9)));
	}
}
