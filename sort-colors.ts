// Time complexity- O(n)
// Space complexity- O(1)
function sortColors(nums: number[]): void {
	let low = 0;
	let mid = 0;
	let high = nums.length - 1;
	while (mid <= high) {
		if (nums[mid] === 2) {
			swap(nums, mid, high);
			high--;
		} else if (nums[mid] === 0) {
			swap(nums, mid, low);
			low++;
			mid++;
		} else {
			mid++;
		}
	}
}

function swap(nums: number[], a: number, b: number) {
	const temp = nums[a];
	nums[a] = nums[b];
	nums[b] = temp;
}
