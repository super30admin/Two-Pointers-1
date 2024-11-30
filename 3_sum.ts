function threeSumWithTwoPointer(nums: number[]): number[][] {
  let result: number[][] = [];
  nums.sort((a, b) => a - b);
  let target = 0

  for (let first = 0; first < nums.length; first++) {
    if (first > 0 && nums[first] == nums[first - 1]) continue;
    if (nums[first] > target) break;

    let left: number = first + 1;
    let right: number = nums.length - 1;
    while (left < right) {
      let sum = nums[first] + nums[left] + nums[right];
      if (sum == target) {
        result.push([nums[first], nums[left], nums[right]]);
        left++;
        right--;
        while (left < right && nums[left] == nums[left - 1]) {
          left++;
        }
        while (left < right && nums[right] == nums[right + 1]) {
          right--;
        }
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
  }

  return result;
}
function threeSum(nums: number[]): number[][] {
  let result: number[][] = [];
  let sortedNums = nums.sort();
  let target = 0;
  for (let index = 0; index < sortedNums.length; index++) {
    if (index > 0 && sortedNums[index] == sortedNums[index - 1]) continue;
    let innerTarget = target - sortedNums[index];
    let intermediateResult: number[][] = twoSum(
      sortedNums,
      innerTarget,
      nums[index],
      index + 1
    );
    result.push(...intermediateResult);
  }

  return result;
}

function twoSum(
  nums: number[],
  target: number,
  prefix: number,
  startIndex: number
): number[][] {
  if (startIndex == nums.length) return [];

  let result: number[][] = [];

  let set = new Set<number>();
  for (let index = startIndex; index < nums.length; index++) {
    if (index > startIndex + 1 && nums[index] === nums[index - 1]) continue; // Skip duplicates
    let remainingSum = target - nums[index];
    if (
      set.has(remainingSum) &&
      hasTriplet(result, [prefix, nums[index], remainingSum]) == false
    ) {
      result.push([prefix, nums[index], remainingSum].sort());
    } else {
      set.add(nums[index]);
    }
  }

  return result;
}

function hasTriplet(result: number[][], target: number[]): boolean {
  let sortedTarget: number[] = target.sort();
  for (let index = 0; index < result.length; index++) {
    let intermediateResult = result[index].sort();
    if (
      intermediateResult[0] == sortedTarget[0] &&
      intermediateResult[1] == sortedTarget[1] &&
      intermediateResult[2] == sortedTarget[2]
    )
      return true;
  }
  return false;
}

describe("3 Sum", () => {
  it("Happy Path", () => {
    expect(threeSumWithTwoPointer([-4, -1, -1, 0, 1, 2])).toStrictEqual([
      [-1, -1, 2],
      [-1, 0, 1],
    ]);
  });
  it("Happy Path 01", () => {
    expect(
      threeSumWithTwoPointer([-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4])
    ).toStrictEqual([
      [-4, 0, 4],
      [-4, 1, 3],
      [-3, -1, 4],
      [-3, 0, 3],
      [-3, 1, 2],
      [-2, -1, 3],
      [-2, 0, 2],
      [-1, -1, 2],
      [-1, 0, 1],
    ]);
  });
  it("Negative", () => {
    expect(threeSumWithTwoPointer([0, 0, 0, 0])).toStrictEqual([[0, 0, 0]]);
  });
  it("Negative - 2", () => {
    expect(threeSumWithTwoPointer([-2, 0, 1, 1, 2])).toStrictEqual([
      [-2, 0, 2],
      [-2, 1, 1],
    ]);
  });
});
