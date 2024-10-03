/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let i = 0;
    let j = height.length - 1;
    let res = 0;
    let area = 0;
    while(i < j) {
        area = (j - i) * Math.min(height[j] , height[i]);
        res = Math.max(res, area);
        if(height[i] < height[j]) {
            i += 1;
        }
        else j -= 1;
    }
    return res;
    
};