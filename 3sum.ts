// Time complexity- O(n*2), length of input array
// Space complexity- O(1)
function threeSum(nums: number[]): number[][] {
	let result = [];
	nums.sort((a, b) => a - b);
	for (let i = 0; i < nums.length; i++) {
		if (nums[i] > 0) break;
		if (i !== 0 && nums[i] == nums[i - 1]) continue;

		let low = i + 1;
		let high = nums.length - 1;
		while (low < high) {
			let curr = nums[i] + nums[low] + nums[high];
			if (curr === 0) {
				result.push([nums[i], nums[low], nums[high]]);
				low++;
				high--;

				// move left and right pointer if the value is same as last one
				while (low < high && nums[low] === nums[low - 1]) low++;
				while (low < high && nums[high] === nums[high + 1]) high--;
			} else if (curr > 0) {
				high--;
			} else {
				low++;
			}
		}
	}

	return result;
}
