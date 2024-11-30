/**
 Do not return anything, modify nums in-place instead.
 */
function sortColors(nums: number[]): void {
  let left: number = 0;
  let right: number = nums.length - 1;
  let mid = left;

  function swap(l: number, r: number) {
    let temp: number = nums[l];
    nums[l] = nums[r];
    nums[r] = temp;
  }

  while (mid <= right) {
    if (nums[mid] == 2) {
      swap(mid, right);
      right--;
    }
    if (nums[mid] == 0) {
      swap(mid, left);
      left++, mid++;
    }
    if (nums[mid] == 1) {
      mid++;
    }
  }
}

describe("Sort Colors", () => {
  it("Happy Path", () => {
    let num = [2, 2, 1, 0, 1, 2];
    sortColors(num);
    expect(num).toStrictEqual([0, 1, 1, 2, 2, 2]);
  });
});
