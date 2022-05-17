import java.util.*;

/**
 * https://leetcode.com/problems/two-sum
 * 
 *  Approaches              For getting index
 * 1. Iterative             works
 * 2. Two pointer           doesnt work
 * 3. Binary search         doesnt work
 * 4. HashSet / HashMap     works
 * 
 */

/**
 * Iterative approach
 * 
 * time: n^2
 * space: O(1)
*/
class Problem29Iterative {
    public int[] twoSum(int[] nums, int target) {
        int[] pairs = new int[2];
        
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                    pairs[0] = i;
                    pairs[1] = j;
                    break;
                }
            }
        }
        
        return pairs;
    }
}

/**
 * Two pointer fails here as we sort the array we lose the index
 * which needs to be returned for this problem
 * 
 * But this will work to count the pairs or return the elements
*/
class Problem29TwoPointer {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int left = 0;
        int right = n-1;
        
        while(left < right){
            if((nums[left] + nums[right]) < target){
                left++;
            } else if ((nums[left] + nums[right]) == target){
                return new int[]{left, right};
            } else{
                right--;
            }
        }
        return new int[]{0};
    }
}


/**
 * displays count of pairs and
 * returns the pairs whose sum equals the target
 * 
 * time: nlogn + n  => nlogn
 *     sorting + moving 2 pointers
 * space: O(1)
 * 
 * Approach: 
 * 1. sort the array
 * 2. two pointers L, R at beginning and end
 * 3. if sum(L,R) == target
 *      move the pointers inwards as we got the 1st pair
 *    else if sum(L,R) < target
 *      move towards right
 *    else 
 *      move towards left
 */
class TwoSumTwoPointer2 {
    public List<List<Integer>> twoSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        int left = 0;
        int right = n-1;
        int count = 0;
        
        while(left < right){
            if((nums[left] + nums[right]) == target){
                result.add(Arrays.asList(left, right));
                count++;
                left++;
                right--;
            } else if ((nums[left] + nums[right]) < target){
                left++;
            } else{
                right--;
            }
        }
        System.out.println("Pair Count:" + count);
        return result;
    }
}

/**
 * Binary search
 * 
 * time: nlogn + n + logn  => nlogn
 *       sort + iterate + BS
 * space: O(1)
 * 
 * Approach:
 * 1. sort the array
 * 2. take the 0th element find the current elements compliment w.r.t target
 * 3. if found increment count
 *    else continue with next element
 */
class TwoSumBinarySearch {
    public List<List<Integer>> twoSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < n; i++){
            int compl = target - nums[i];

            int low = i+1;
            int high = n-1;
            
            while(low <= high){
                int mid = low + (high-low)/2;

                if (nums[mid] == compl) {
                    count++;
                    result.add(Arrays.asList(nums[i], nums[mid]));
                    break;
                } else if(nums[mid] < compl){
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
        }
        
        System.out.println("Two sum BS count:" + count);
        return result;
    }
}


/**
 * HashSet
 * 
 * time: O(n) + O(1) => O(n)
 *       iterate + find in a set
 * space: O(n)
 *         set
 * 
 * Approach:
 * 1. Either put the elements or the compliment w.r.t target in a set
 * 2. if storing elements, 
 *      check if compliments are present in the set
 *      if present then pair is found else add the element
 */
class TwoSumHashSet {
    public void twoSum(int[] nums, int target) {
        HashSet<Integer> s = new HashSet<>();

        int n = nums.length;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            int compl = target - nums[i];
            if (s.contains(compl)) {
                count++;
            } else {
                s.add(nums[i]);
            }
        }
        
        System.out.println("Two sum BS count:" + count);
    }
}

/**
 * HashMap
 * 
 * time: O(n) + O(1) => O(n)
 *       iterate + find in a map
 * space: O(n)
 *         map
 * 
 * Approach:
 * 1. Either put the elements or the compliment w.r.t target in a map
 * 2. if storing elements, store their index as values, 
 *      check if compliments are present in the set
 *      if present then pair is found else add the element
 */
class TwoSumHashMap {
    public List<List<Integer>> twoSum(int[] nums, int target) {
        Map<Integer,Integer> s = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            int compl = target - nums[i];

            if (s.containsKey(compl)) {
                count++;
                result.add(Arrays.asList(i, s.get(compl)));
            } else {
                s.put(nums[i], i);
            }
        }
        
        System.out.println("Two sum BS count:" + count);
        return result;
    }
}






public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 3, 2, 6, -1, 0};

        // List<List<Integer>> li = new TwoSumTwoPointer2().twoSum(nums, 7);
        // System.out.println(li);

        // List<List<Integer>> li2 = new TwoSumBinarySearch().twoSum(nums, 7);
        // System.out.println(li2);

        new TwoSumHashSet().twoSum(nums, 7);

        List<List<Integer>> li3 = new TwoSumHashMap().twoSum(nums, 7);
        System.out.println(li3);

    }
}
