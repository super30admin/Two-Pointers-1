class Solution {
    public int maxArea(int[] height) {
        int maxlen=0;
        /*
        //Brute Force approach
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int len=Math.min(height[i],height[j])*(j-i);
                if(len>maxlen)
                    maxlen=len;
            }
        }
        return maxlen;
        */
        int l=0,r=height.length-1;
        while(l<r){
            maxlen=Math.max(maxlen,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxlen;
    }
 }

//Time complexity: O(n)
