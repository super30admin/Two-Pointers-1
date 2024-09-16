// Time Complexity : O(N) where N is length for strings array given and K is maximum size of each string.
// Space Complexity : O(NK) since N strings and each string has maximum K characters -- stored in HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Bruteforce
class Solution {
//     public int maxAreaBruteForce(int[] height) {
//         if(height==null || height.length==0){
//             return 0;
//         }
        
//         int globalMaximum=0;
        
//         for(int i = 0; i< height.length; i++){
//             for(int j = i+1; j<height.length; j++){
//                 globalMaximum = Math.max(Math.min(height[i], height[j])*(j-i), globalMaximum);
//             }
//         }
//         return globalMaximum;
//     }
    
    public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int globalMaximum=0;
        int low = 0;
        int high = height.length-1;
        
        while(low<high){
        globalMaximum = Math.max((Math.min(height[low], height[high])*(high-low)), globalMaximum);
        if(height[low]<=height[high]){ //Very important 
            low++;
        }
            else{
                high--;
            }
        }
        return globalMaximum;
    }
}
