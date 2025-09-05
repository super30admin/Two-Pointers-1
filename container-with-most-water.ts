// Time complexity- O(n), number of container
// Space complexity- O(1)
function maxArea(height: number[]): number {
	let max = 0;
	let low = 0;
	let high = height.length - 1;

	while (low <= high) {
		let width = high - low;
		let length = Math.min(height[low], height[high]);
		let area = width * length;
		max = Math.max(max, area);

		if (height[low] < height[high]) {
			low++;
		} else {
			high--;
		}
	}

	return max;
}
