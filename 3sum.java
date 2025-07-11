//Time Complexity (TC): Sorting the array takes **O(n log n).
//The main loop runs O(n) times, and for each iteration, the two-pointer scan takes up to O(n)—so overall O(n²).

//Space Complexity (SC):Apart from the output list, only a constant amount of extra space is used—so O(1) auxiliary space.


//Sort the array and fix one element at a time, then use two pointers to find pairs that sum to the negative of the fixed element.
//Skip duplicates for both the fixed element and the two-pointer elements to avoid repeating triplets.




class Solution {
    public List<List<Integer>> threeSum(int[] numbers) {
        Arrays.sort(numbers);

        int length = numbers.length;
        List<List<Integer>> triplets = new ArrayList<>();

        for (int firstIndex = 0; firstIndex < length; firstIndex++) {
            if (firstIndex != 0 && numbers[firstIndex] == numbers[firstIndex - 1]) continue;
            if (numbers[firstIndex] > 0) break;

            int secondIndex = firstIndex + 1, thirdIndex = length - 1;

            while (secondIndex < thirdIndex) {
                int currentSum = numbers[firstIndex] + numbers[secondIndex] + numbers[thirdIndex];
                if (currentSum == 0) {
                    triplets.add(Arrays.asList(numbers[firstIndex], numbers[secondIndex], numbers[thirdIndex]));
                    secondIndex++;
                    thirdIndex--;
                    while (secondIndex < thirdIndex && numbers[secondIndex] == numbers[secondIndex - 1]) secondIndex++;
                    while (secondIndex < thirdIndex && numbers[thirdIndex] == numbers[thirdIndex + 1]) thirdIndex--;
                } else if (currentSum > 0) {
                    thirdIndex--;
                } else {
                    secondIndex++;
                }
            }
        }

        return triplets;
    }
}
