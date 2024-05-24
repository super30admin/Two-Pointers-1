/**
Sort -> O(nLogn)

Loop to store count coccurences of 1's, 0's and 2's . Another pass to put valus accordingly.
TC: O(N) , SC-O(N)

Pointers: One pass -> Loop with pointers and swap acc to the nums.
TC O(N), SC -O(1)
 */

 class Solution {
    public void sortColors(int[] colors) {
        int blue = colors.length-1;
        int white = 0;
        int red =0;


        while(white<=blue){
            if(colors[white] == 0)
            {
                // swap white, red
                int tmp = colors[white];
                //increment white too as we dont want swapping same elemnts all the time.
                //also it means red is not 2 or already processed to be 0.
                colors[white++]=colors[red];
                colors[red++]= tmp;
            }
            else if(colors[white] == 1)
                white++;
            
            else {
                // swap white and blue
                int tmp = colors[white];
 //When we decrement the blue pointer, the white pointer remains unchanged since it has to analyze the swapped element to determine if further swapping is required with the red pointer.
                colors[white]=colors[blue];
                colors[blue--]= tmp;
            }

        }
        
    }
}