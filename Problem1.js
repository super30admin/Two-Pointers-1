// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : With mid++ in the nums[mid] === 2/ 0 cases

var sortColors = function (nums) {
    if (!nums || nums.length === 0) return [];
    let low = 0, mid = 0, high = nums.length - 1;

    while (mid <= high) {
        if (nums[mid] === 2) {
            swap(nums, mid, high);
            high--;

        } else if (nums[mid] === 0) {
            swap(nums, mid, low);
            low++;
            mid++
        } else {
            mid++;
        }
    }

};

var swap = function (arr, i, j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}