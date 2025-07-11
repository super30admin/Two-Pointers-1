//Time Complexity (TC): We traverse the entire array once with the `currentPointer`
//Space Complexity (SC):We use only a fixed number of extra variables (`zeroPointer`, `twoPointer`, `currentPointer`) regardless of input size
 
//Use three pointers: `zeroPointer` for placing 0s, `twoPointer` for placing 2s, and `currentPointer` to traverse the array.
//If the current element is 0, swap it with `zeroPointer` and move both pointers forward; if it's 2, swap it with `twoPointer` and move only `twoPointer` back.
//If it's 1, just move `currentPointer` forward—this ensures all 0s are on the left, 2s on the right, and 1s in the middle.



class Solution {
    public void sortColors(int[] colors) {
        int zeroPointer = 0, twoPointer = colors.length - 1, currentPointer = 0;

        while (currentPointer <= twoPointer) {
            if (colors[currentPointer] == 2) {
                swap(colors, currentPointer, twoPointer);
                twoPointer--;
            } else if (colors[currentPointer] == 0) {
                swap(colors, currentPointer, zeroPointer);
                zeroPointer++;
                currentPointer++;
            } else {
                currentPointer++;
            }
        }
    }

    private void swap(int[] colors, int index1, int index2) {
        int temp = colors[index1];
        colors[index1] = colors[index2];
        colors[index2] = temp;
    }
}
