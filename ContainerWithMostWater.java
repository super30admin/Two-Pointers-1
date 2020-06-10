//Time complexity: O(n)
//Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Approach
//1) Initialize left and right pointers
//2) traverse and if value at left index is greater than value at right index, decrease right
//3) otherwise increase left pointer
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        if(height ==null || height.length == 0)return 0;
        int i =0;int j= height.length-1;
        int max = 0;
        while(i < j){
            if(height[i] > height[j]){
                if(height[j] * (j-i) > max){
                    max= height[j] * (j-i);
                }
                j--;
            }else{
                if(height[i] * (j-i) > max){
                    max= height[i] * (j-i);
                }
                i++;
            }
        }
        return max;
    }

	public static void main(String[] args) {
		ContainerWithMostWater obj = new ContainerWithMostWater();
		int nums[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(obj.maxArea(nums));
	}

}
