/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
import java.util.*;
public class Solution {
public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res=new ArrayList<>();
    for(int i=0;i<nums.length-2&&nums[i] <= 0;i++){
     if(i==0||nums[i-1]!=nums[i]){
    int sum=0-nums[i];
    int low=i+1;
    int high=nums.length-1;
    while(low<high){
    if((nums[low]+nums[high])<sum){
    	low++;
        
    }
    else if((nums[low]+nums[high])>sum){
    	high--;   
    }
    else
    {
        res.add(Arrays.asList(nums[i],nums[low],nums[high]));
        low++;
        high--;     
        while (low < high && nums[low] == nums[low - 1]) {
            ++low;
            
    }
    }
    }
    }
    }
return res;
}
public static void main(String[] args) {
	List<List<Integer>> out=new ArrayList<>();
	int a[]=new int[] {-1,0,1,2,-1,-4};
	Solution x=new Solution();
	out=x.threeSum(a);
	System.out.println(out.toString());
}
}