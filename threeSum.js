/**
 * @param {number[]} nums
 * @return {number[][]}
 * 
 * Intuition:
 To find all unique triplets that sum to zero efficiently, I first sort the array.
Sorting helps in two important ways: 
it allows the use of the two-pointer technique, and 
it makes it easy to skip duplicate values to avoid repeated triplets.
I iterate through the array and fix one number at a time. For each fixed number nums[i], I convert the problem into finding two numbers in the remaining part of the array whose sum equals -nums[i].

Using two pointers:
I place one pointer at the element just after i (left)
Another pointer at the end of the array (right)
At each step:
If nums[left] + nums[right] equals the target, I record the triplet and move both pointers inward.
If the sum is smaller than the target, I move the left pointer to increase the sum.
If the sum is larger, I move the right pointer to decrease the sum.
To ensure unique triplets, I skip over duplicate values for:
The fixed element (i)
The left pointer
The right pointer
Since the array is sorted, once the fixed number becomes greater than zero, no valid triplet can exist, so I stop early.
This approach reduces the time complexity from O(n³) to O(n²) while using constant extra space (excluding the output).
 * 
 * 
 */
var threeSum = function (nums) {
    // sort nums
    nums.sort((a, b) => a - b);
    const result = [];
    for (let i = 0; i < nums.length - 2; i++) {
        const currNum = nums[i];
        // if nums[i] > 0 then as the array is sorted there is no way we find negatives after this number;
        if (currNum > 0) break;
        // outer loop duplicates reduction
        if (i > 0 && currNum === nums[i - 1]) continue;
        const target = 0 - currNum;
        let left = i + 1; right = nums.length - 1;
        while (left < right) {
            const leftAndRightSum = nums[left] + nums[right];
            if (leftAndRightSum === target) {
                result.push([currNum, nums[left], nums[right]]);
                left++;
                right--;
                // skip if the curr num is same as previous ones on both left and right
                while (left < right && nums[left] === nums[left - 1]) left++;
                while (left < right && nums[right] === nums[right + 1]) right--;
            } else if (leftAndRightSum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    return result;
};