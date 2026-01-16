/**
 * @param {number[]} height
 * @return {number}
 * This solution uses a two-pointer approach to find the maximum water container efficiently.
 * One pointer starts at the beginning of the array (left) and the other at the end (right). 
 * The area formed by the two lines is calculated by multiplying the distance between the pointers with the minimum of their heights, since the shorter line limits the amount of water that can be held. 
 * After computing the area, we compare it with the current maximum and update the maximum if needed. 
 * To potentially find a larger area, we always move the pointer pointing to the smaller height, because moving the taller line cannot increase the area when the width decreases, while moving the shorter line may lead to a taller boundary.
 *  This process continues until the two pointers meet, ensuring all optimal pairs are considered in linear time.
 */
var maxArea = function (height) {
    let left = 0, right = height.length - 1;
    let max = 0;

    while (left < right) {
        const capacity = Math.min(height[left], height[right]) * (right - left);
        if (max < capacity) max = capacity;
        if (height[left] <= height[right]) left++;
        else right--;
    }
    return max;
};