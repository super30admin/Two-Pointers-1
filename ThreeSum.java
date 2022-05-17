import java.util.*;

/**
 * Iterative:
 * 
 * time: n^3
 * space: O(n)
 * leetcode: Yes but Time Limit Exceeded
 * 
 * Approach:
 * 
 */
class Problem35Iterative {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        int n = nums.length;
        
        HashSet<List<Integer>> s = new HashSet<>();
        
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int total = nums[i] + nums[j] + nums[k];
                    
                    if(total == 0){
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(li);
                        s.add(li);
                    }
                }
            }
        }
        
        return new ArrayList<>(s);
    }
}

/**
 * Iterative optimized
 * 
 * time: n^2
 * space: O(n) + O(n) => O(2n) => O(n)
 *    Hashset1 + hashSet2
 * 
 * Approach:
 * Pairing the outside element with
 * HashSet for finding the two sum pairs
 * whose sum is the compliment of the outside element
 * 
 */
class Problem35Iterative2 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        int n = nums.length;
        
        HashSet<List<Integer>> s = new HashSet<>();
        
        for(int i = 0; i < n-1; i++){
            HashSet<Integer> s2 = new HashSet<>();
            int compl = 0 - nums[i];    // compliment of outside element
            
            for(int j = i+1; j < n; j++){
                int compl2 = compl - nums[j]; // compliment of inside element
                
                if(s2.contains(compl2)){
                    List<Integer> li = Arrays.asList(nums[i], nums[j], compl2);
                    Collections.sort(li);
                    s.add(li);
                } else{
                    s2.add(nums[j]);
                }
            }
        }
        
        return new ArrayList<>(s);
    }
}

/**
 * Two pointer
 * 
 * time: nlogn + n^2 => n^2
 *       sort + n^2
 * space: O(1)
 * 
 * Approach:
 * 
 * 1. sort the array
 *        L >>                        << R
 *        |                              |
 *  [-3, -2, -2, 0, 0, 0, 1, 2, 2, 3, 3, 4]
 *    |
 *   Outside element
 * 
 * 2. pair with the outside element (*check for outside duplicacy)
 *    and the L and R to get the sum 0
 * 
 * 3. If the sum == 0 then move both L, R inwards
 *    (Check for inner duplicacy)
 * 
 * 4. if sum < 0 move towards right => 
 * 5. else move towards left        <=
*/
class Problem35TwoPointers {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        int n = nums.length;
                
        for(int i = 0; i < n-2; i++){
            //outside duplicacy
            if(i > 0 && nums[i-1] == nums[i]) continue;
            // optimize
            if(nums[i] > 0) break;
            
            int left = i + 1;
            int right = n - 1;
            
            while(left < right){
                int curr = nums[i] + nums[left] + nums[right];
                if(curr == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    // inner duplicacy
                    while(left < right && nums[left-1] == nums[left]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                    
                } else if(curr < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result;
    }
}
