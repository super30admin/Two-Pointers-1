// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

// Using Two Pointers approach, by creating one at the beginning (first line) and one at the end (so last line), and move the shorter (less in value) pointer to the other one hoping that we meet possible taller line, and calc the max area as you go:

/**
 * @param {number[]} height
 * @return {number}
 */
 const maxArea1 = (height) => {
    let max = 0;
    let left = 0;
    let right = height.length - 1;
    
    while (left < right) {
        max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return max;
}

// Using Brute Force approach, we calculate the maximum area for every possible lines pair by two nested for loops:

// Time O(n²) - Considering the constraints, this will lead to Time Limit Exceed (TLE)
// Space O(1)

/**
 * @param {number[]} height
 * @return {number}
 */
 const maxArea2 = (height) => {
    let max = 0;
    for (let i = 0; i < height.length; i++) {
        for (let j = i; j < height.length; j++) {
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
        }
    }
    return max;
}