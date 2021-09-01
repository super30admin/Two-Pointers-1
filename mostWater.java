//TIme Complexity: O(N)
//Space Complexity:O(1)
class Solution {
    public int maxArea(int[] height) {
        int first=0;
        int last=height.length-1;
        int maxAmount=Integer.MIN_VALUE;
        while(first<last){
            int distance=last-first;
            maxAmount=Math.max(maxAmount,(distance*Math.min(height[first],height[last])));
            if(height[first]<=height[last]){
                first++;
            }
            else{
                last--;
            }
        }
        return maxAmount;
    }
}