// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    var st=0,end=height.length-1;
    var hght = -Infinity;
    while(st<end)
    {
        hght= Math.max(hght,Math.min(height[st],height[end])*
                        Math.abs(st-end));
       
        if(height[st]<height[end])
        {
            st++;
        }
        else
        {
            end--;
        }
    }
   
    return hght;
    
};