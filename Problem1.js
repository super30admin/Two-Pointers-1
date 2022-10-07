//Time: O(n), Space:O(1)
 var sortColors = function(nums) {
    if(nums.length ==0) return;
    let low=0,mid=0,high = nums.length-1;
    while(mid<=high){
        if(nums[mid] == 2){
            let temp = nums[mid];
            nums[mid] = nums[high]
            nums[high] = temp;
            high--;
        }else if(nums[mid] == 0){
            let temp = nums[mid];
            nums[mid] = nums[low]
            nums[low] = temp;
            low++;
            mid++;
        }else{
            mid++;
        }
    }
    return nums;
};