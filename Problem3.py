class Solution:
    # 1 Bruteforce:
    # Time Complexity:O(n^3)
    # Space Complexity:O(1)
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        triplets = []
        n = len(nums)

        for i in range(n - 2):
            for j in range(i + 1, n - 1):
                for k in range(j + 1, n):
                    if nums[i] + nums[j] + nums[k] == 0:
                        triplet = [nums[i], nums[j], nums[k]]
                        triplet.sort()
                        if triplet not in triplets:
                            triplets.append(triplet)

        return triplets

    # 2 Binary Search Approach:
    # Time Complexity:O(n^2 log n)
    # Space Complexity:O(1)
    class Solution:
        def threeSum(self, nums: List[int]) -> List[List[int]]:
            triplets = []
            nums.sort()
            n = len(nums)

            for i in range(n - 2):
                for j in range(i + 1, n - 1):
                    complement = -nums[i] - nums[j]
                    if self.binarySearch(nums, j + 1, n - 1, complement):
                        triplet = [nums[i], nums[j], complement]
                        triplet.sort()
                        if triplet not in triplets:
                            triplets.append(triplet)

            return triplets

        def binarySearch(self, nums, left, right, target):
            while left <= right:
                mid = left + (right - left) // 2
                if nums[mid] == target:
                    return True
                elif nums[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1

            return False

    # 3 Two Pointer Approach:
    # Time Complexity:O(n^2)
    # Space Complexity:O(1)
    class Solution:
        def threeSum(self, nums: List[int]) -> List[List[int]]:
            triplets = []
            nums.sort()
            n = len(nums)

            for i in range(n - 2):
                if i > 0 and nums[i] == nums[i - 1]:
                    continue

                left = i + 1
                right = n - 1

                while left < right:
                    total = nums[i] + nums[left] + nums[right]
                    if total < 0:
                        left += 1
                    elif total > 0:
                        right -= 1
                    else:
                        triplet = [nums[i], nums[left], nums[right]]
                        triplets.append(triplet)

                        while left < right and nums[left] == nums[left + 1]:
                            left += 1
                        while left < right and nums[right] == nums[right - 1]:
                            right -= 1

                        left += 1
                        right -= 1

            return triplets

    # 4 Hashing based Approach:
    # Time Complexity:O(n^2)
    # Space Complexity:O(n)
    class Solution:
        def threeSum(self, nums: List[int]) -> List[List[int]]:
            triplets = []
            n = len(nums)

            for i in range(n - 2):
                complements = set()
                for j in range(i + 1, n):
                    complement = -nums[i] - nums[j]
                    if complement in complements:
                        triplet = [nums[i], complement, nums[j]]
                        triplet.sort()
                        if triplet not in triplets:
                            triplets.append(triplet)

                    complements.add(nums[j])

            return triplets
