/*
Time complexity: O(n).

Space : O(1)
Leetcode: Successful
Runtime: 7 ms, faster than 29.05% of Java online submissions for Container With Most Water.
Memory Usage: 40 MB, less than 93.59% of Java online submissions for Container With Most Water.

Concern:
I dont understand why I am getting 29 percentile in time complexity, as my while loop would run for n+1 max.
is it because the number of computations that I am doing, they are constant number though.


Approach:

Maintain two pointers, leftpt and rightpt.
Also maintain, max height while traversing left pt and max height hile traversing right pt.
Also, keep on maintaining the 2nd max height from both the ends.

at each iteration, compute the combinations between height of max and 2nd max on both the pointers side.
this way, we would have computed area between all the contesting heights.


*/

class Solution {
    public int maxArea(int[] height) {
        
        
        int maxarea=0;
        int size=height.length;
        int start=size/2;
        int leftpt=0;
        int rightpt=size-1;
        int leftmax=0;
        int lastleftmax=0;
        int rightmax=rightpt;
        int lastrightmax=rightpt;
        
        
        while(!(leftpt>rightpt+1))
        {
            
                    
            if(height[leftpt]>height[leftmax])
            {
                lastleftmax=leftmax;
                leftmax=leftpt;
            }
            
            if(height[rightpt]>height[rightmax])
            {
                lastrightmax=rightmax;
                rightmax=rightpt;
            }   
  
            int area1=(leftmax-lastleftmax)*Math.min(height[leftmax],height[lastleftmax]); //leftmax*lastleftmax;
            int area2=(lastrightmax-rightmax)*Math.min(height[lastrightmax],height[rightmax]);//rightmax*lastrightmax;
            int area3=(rightmax-leftmax)*Math.min(height[rightmax],height[leftmax]);//leftmax,rightmax
            int area4=(leftmax-lastrightmax)*Math.min(height[leftmax],height[lastrightmax]);//leftmax,lastrightmax
            int area5=(lastrightmax-lastleftmax)*Math.min(height[lastrightmax],height[lastleftmax]);//lastleftmax,lastrightmax;
            int area6=(rightmax-lastleftmax)*Math.min(height[rightmax],height[lastleftmax]);//lastleftmax,rightmax
                                                     
                                                     
            int max1=Math.max(area1,area2);
            int max2=Math.max(area3,area4);
            int max3=Math.max(area5,area6);
            maxarea=Math.max(Math.max(Math.max(max1,max2),max3),maxarea);
                                   
            leftpt++;
            rightpt--;                   
        }
                                                                                   
            return maxarea;
      
    }
}
