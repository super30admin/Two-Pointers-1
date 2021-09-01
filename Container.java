/ Time Complexity :o(n2)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : no, time exceeded. But worked for the base cases
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach : tried the bruteforce method
class Container {
    public int maxArea(int[] height) {
        int result=0;
        for(int i=0;i<height.length;i++){ // loop to check all possible outcomes of this
            for(int j=i+1;j<height.length;j++){ // inner loop for all possibilities.
                int maximum= (j-i)*Math.min(height[i],height[j]); // calculating the minimum.
                if(maximum>result)
                    result= maximum; // if you find any result assigning that to the result.
                
            }
        }
        return result;
    }
}


// Optimised solution: Used 2 pointer approach for comparing all the combinations.
TC:O(N)
Space: o(n)
class Solution {
    public int maxArea(int[] height) {
        int result=0;
        int left =0;
        int right =height.length-1;
        int Maximumresult=0;
        while(left<right)
        {
            if(height[left]<height[right])
            {            result= (right-left)*Math.min(height[right],height[left]);
             System.out.println(result);
             left++;
             }
            else{
                result= (right-left)*Math.min(height[right],height[left]);
                System.out.println(result);
                right--;
                
            }
            if(result>Maximumresult)
                Maximumresult= result;
            System.out.println(Maximumresult);
            
    }
        return Maximumresult;
    }
}