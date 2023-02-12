"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def maxArea(height) -> int:
    """
    Using 2 pointers, we calculate the area and then move the pointer
    with lower height as we want higher height to increase our area (width
    is already decreasing) and then return maximum area.
    """
    max_area = 0
    n = len(height)

    # brute force

    #         for i in range(n):
    #             for j in range(i+1, n):
    #                 max_area = max(max_area, (min(height[i], height[j]) * (j-i)))

    # using 2 pointers
    low = 0
    high = n - 1

    while low < high:
        curr_area = min(height[low], height[high]) * (high - low)
        max_area = max(max_area, curr_area)
        if height[low] <= height[high]:
            low += 1
        else:
            high -= 1

    return max_area


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    height1 = [1, 8, 6, 2, 5, 4, 8, 3, 7]
    print(maxArea(height1))  # returns 49
    height2 = [1, 1]
    print(maxArea(height2))  # returns 1


if __name__ == "__main__":
    main()
