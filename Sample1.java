// Time Complexity :O(2N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach 


//ides:shift all 0 to left and shift all 1 to right
public void sortColors(int[] nums) {
    if(nums==null || nums.length<2) return;
    int start=0,end=nums.length-1;
    for(int i=start;i<=end;){
        if(nums[i]==0){
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            i++;
            start++;
        }
        else if(nums[i]==2){
            int temp=nums[i];
            nums[i]=nums[end];
            nums[end]=temp;
            end--;
        }else{
            start++;
        }
    }
}
}

Q2)

O(n),O(1)
//take two pointers,whichever height is min among i and j select it also j-i gives horizontal area.Then take max among
//value seen so far 
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=0;
        while(i<j){
            max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i++;
                
            }else{
                j--;
            }
        }
        return max;
    }
}
    
    
    
