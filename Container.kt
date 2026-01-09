// In this solution, the idea is to keep two pointers and measure the area between them. We start with the left pointer at the beginning of the array and the right pointer at the end of the array. 
//We calculate the area formed between the two pointers and keep track of the maximum area found so far.
// Time complexity: O(n), Space complexity: O(1)
class Solution {
    fun maxArea(height: IntArray): Int {
       var leftPtr = 0
       var rightPtr = height.lastIndex
       var resultArea = 0
       while (leftPtr < rightPtr) {
            val currentArea = minOf(height[leftPtr], height[rightPtr]) * (rightPtr - leftPtr)

            if (currentArea > resultArea) {
                resultArea = currentArea
            }
            if (height[leftPtr] < height[rightPtr]) {
                leftPtr++
            } else {
                rightPtr--
            }
       }
       return resultArea
    }
}