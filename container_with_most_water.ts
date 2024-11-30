import { number } from "yargs";

// TC: O(N) SC: O(1)
function maxArea(height: number[]): number {
  let left: number = 0;
  let right: number = height.length - 1;
  let max: number = Number.MIN_SAFE_INTEGER;
  while (left < right) {
    let left_height = height[left];
    let right_height = height[right];
    let distance = right - left;
    let area = distance * Math.min(left_height, right_height);
    max = Math.max(area, max);
    if (left_height < right_height) {
      left++;
    } else {
      right--;
    }
  }
  return max;
}

describe("Container with max water", () => {
  it("Happy Path", () => {
    expect(maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7])).toStrictEqual(49);
  });
});
