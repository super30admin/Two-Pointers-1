class Solution {
    public int maxArea(int[] height) {
        //Brute Force
        //O(n2),O(1)
        // int max = 0;

        // for(int i=0 ; i<= height.length-2; i++){
        //     for(int j= i+1; j<=height.length-1; j++){
        //         int width = j - i;
        //         int minheight = Math.min(height[i],height[j]);
        //          max = Math.max(max,width * minheight);

        //     }
        // }
       
       //Two Poniers
       //O(n),//O(1)

       int l = 0;
       int h = height.length-1;
       int max = 0;

       while(l < h){
           int width = h - l;
           int minheight = Math.min(height[l],height[h]);
           max = Math.max(max, width * minheight);
           if(height[l] < height[h]){
               l++;
           }
           else{
               h--;
           }

       }





        return max;
    }
}



//Approach
//TC-O(n), SC - O(1)

//In BruteForce, checking each and every posibilty by iterating whole array in 2 for loops which leads to O(n2) TC. Using Two pointers reducing n2 TC to O(n). In Two Ponter Approach my left pointer lies at 0th index and right pointer (h) at n-1th index.
// Checking width between left and right that by h-l. Caliculating the water between left and right pointer by (h-l) * min(height(l),height(h)). Comparing with max and updating max. Moving the min between two pointers bcz we need maximum. By this we can reduce all occorences between left pointer and right pointer.