// Time Complexity = O(n)
// Space Complexity = O(1)
// Changed to JavaSctript for this week as I have interview for FrontEnd 

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let l = 0; // Pointer for 0s
    let r = nums.length - 1; // Pointer for 2s
    let m = 0; // Current pointer

    while (m <= r) {
        if (nums[m] === 2) {
            swap(m, r); // Move 2 to the right
            r--;
        } else if (nums[m] === 0) {
            swap(m, l); // Move 0 to the left
            l++;
            m++;
        } else {
            m++; // Move past 1
        }
    }

    function swap(i, j) {
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
};
