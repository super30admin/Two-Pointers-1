class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int b=(height.length)-1;
        int max=0;
        while(a<b){
            if(height[a]<height[b]){
                max= Math.max(max,height[a] *(b-a));
                a++;
            }else{
                 max= Math.max(max,height[b] * (b-a));
                b--;
            }
        }
        return max;
    }
}