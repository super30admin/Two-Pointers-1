/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 * We use three pointers to sort the three colors:
 *  a `left` pointer to place `0`s at the beginning,
 *  a `mid` pointer to scan the array, and
 *  a `right` pointer to place `2`s at the end.
 *  Both `left` and `mid` start at index `0`, while `right` starts at `nums.length - 1`.
 *  As `mid` scans the array, if it encounters a `0`, we swap it with the value at `left` and increment both `left` and `mid` since that position is now correctly placed. 
 * If `mid` encounters a `1`, it is already in the correct middle region, so we simply increment `mid`. 
 * If `mid` encounters a `2`, we swap it with the value at `right` and decrement `right`, but we do not increment `mid` because the value swapped in from the right is still unprocessed. 
 * We repeat this process until `mid` moves past `right`, at which point all elements are sorted in-place. 
 * 
 * T.C: O(n), S.C: O(1)
 */
var sortColors = function(nums) {
    // left to catch 0's, mid to catch 1's and right to catch 2's
    let left =0; mid = 0, right = nums.length - 1;
    
    while(mid <= right){
     if(nums[mid]===2){
        // swap mid and right pointer values.
        [nums[mid], nums[right]] = [nums[right], nums[mid]];
        // decerement the right pointer
        right--;
     }else if(nums[mid] === 0){
        // swap mid and left pointer values.
        [nums[mid], nums[left]] = [nums[left], nums[mid]];
        // increment both left and right pointers
        left++, mid++;
     }else{
        // if mid points to value 1
        // just increment the mid pointer
        mid++;
     }
    }
};