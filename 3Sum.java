

// Solution 1 => Nested Iterations

/**
 *  Time Complexity: O(n^3) since for each element we iterate over 3 times
 * 
 *  Space Complexity: O(n) as we take set for checking duplicate triplets
 */


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0 ; i < nums.length - 2 ; i++){
            for(int j = i + 1 ; j < nums.length - 1; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum == 0){ 
                        List<Integer> triplet = new ArrayList();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(result); // convert set to list
    }
}


// Solution 2 => Hashing using Set

/**
 *  Time Complexity: O(n^2) since for each element we iterate over 2 times
 * 
 *  Space Complexity: O(n) + O(n) = O(n) as we take one set for storing unique triplets and one for storing complements
 */


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            int target = 0 - nums[i]; // fix one number

            Set<Integer> set = new HashSet<>(); // set to store complements

            for(int j = i + 1 ; j < nums.length ; j++){ 

                int complement = target - nums[j];

                if(set.contains(complement)){ // if set contains complements, we have found our triplet
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], complement));

                    Collections.sort(triplet); // sorting to check if triplets are unique
                    result.add(triplet);
                }

                set.add(nums[j]); // add current number to set
            }
        }

        return new ArrayList<>(result);
    }
}

// Solution 3.1 => Two Pointers using Hashset for duplicates

/**
 *  Time Complexity: O(n^2) since for each element we iterate over 2 times
 * 
 *  Space Complexity: O(n) as we use set for checking duplicate triplets
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 2 ; i++){
            int target = 0 - nums[i];

            int low = i + 1;
            int high = nums.length - 1;

            while(low < high){ 
                int sum = nums[low] + nums[high];

                if(sum == target){
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[low], nums[high]));

                    Collections.sort(triplet);

                    result.add(triplet);
                }

                if(sum < target){
                    low++;
                }else{
                    high--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}


// Solution 3.2 => Two Pointers without using Hashset for duplicates

/**
 *  Time Complexity: O(n^2) since for each element we iterate over 2 times
 * 
 *  Space Complexity: O(1) as we use dont use any auxillary space
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 2 ; i++){

            if(nums[i] > 0) break; // if first number after sorting is greater than 0 then all next numbers are also greater than 0

            if(i > 0 && nums[i] == nums[i - 1]) continue; // avoid duplicates if first number is same as previous

            int target = 0 - nums[i];

            int low = i + 1;
            int high = n - 1;

            while(low < high){
                int sum = nums[low] + nums[high];

                if(sum == target){
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[low], nums[high]));
                    result.add(triplet);

                    low++;
                    high--;

                    while(low < high && nums[low] == nums[low - 1]){ // avoid duplicate for low pointer number
                        low++;
                    }

                    while(low < high && nums[high] == nums[high + 1]){ // avoid duplicate for high pionter number
                        high--;
                    }

                }else if(sum < target){
                    low++;
                }else{
                    high--;
                }
            }
        }

        return result;
    }
}

// Solution 4 => Binary Search using Hashset (wasn't able to do without hashset)

/**
 *  Time Complexity: O(n) * o(n) * log(n) = n^2 log n.
 * 
 *  Space Complexity: O(n) as we use hashset
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 2 ; i++){ 
            int target = 0 - nums[i]; // fix one number

            for(int j = i + 1; j < nums.length - 1 ; j++){

                int low = j + 1;
                int high = nums.length - 1;

                int anotherNum = target - nums[j]; // get another number

                while(low <= high){ // search in remaining array

                    int mid = (low + (high - low)/2);

                    if(nums[mid] == anotherNum){
                        List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[mid]));

                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                    
                    if(nums[mid] > anotherNum){
                        high = mid - 1;
                    }else{
                        low = mid + 1;
                    }
                }

            }
        }

        return new ArrayList(result);
    }
}

