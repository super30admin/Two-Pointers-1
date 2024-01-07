//Accepted on LT
//The idea is to have 2 pointers calculate the volume and move away from the side which is lower.
//Time is O(n) and space is constant;


class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int max =0;
        int h =height.length-1;
        while(l<h){
            if(height[l]>height[h]){
                int volume = (h-l)*height[h];
                if(max<volume){
                    max=volume;
                }
                h--;
            }
            else{
                int volume = (h-l) *height[l];
                if(max<volume){
                    max=volume;
                }
                l++;
            }

            
        }
        return max;
        
    }
}