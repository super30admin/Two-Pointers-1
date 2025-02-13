//Brute Force 

// Time Complexity : O(n^3)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet <List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for( int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int sum = nums[i]+ nums[j] + nums[k];
                    if(sum == 0){
                        List<Integer> myList = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(myList);
                        set.add(myList);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
 }


//Two pointers approach

// Time Complexity : O(nlogn)+ O(n^2) = O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // base condition
        if (nums == null || nums.length < 3) {
            return result;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i ++) {
            if (nums[i] > 0) break;
            //outside duplicacy
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1; int r = n - 1;
            while (l < r) {
                int curr = nums[i] + nums[l] + nums[r];
                if (curr == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[l], nums[r]);
                    result.add(li);
                    l ++;
                    r --;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l ++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r --;
                    }
                } else if (curr > 0) {
                    r --;
                } else {
                    l ++;
                }
            }
        }
        return result;
    }
}

//HashSet approach

// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution3 {

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums==null || nums.length==0) return new ArrayList<>();

        //Solution 3, Using Hashset solution O(n^2) TC, O(n)-SC

        HashSet<List<Integer>> result = new HashSet<>();

        int n = nums.length;
        int target = 0;
        int complement = 0;

        if(n==3){
           List<Integer> li = Arrays.asList(nums[0],nums[1],nums[2]);
           if(nums[0]+nums[1]+nums[2] == 0){
            result.add(li);
           }
           return new ArrayList<>(result);
        }
        for (int i=0; i<n-2; i++){
            HashSet<Integer> seen = new HashSet<>();
            // System.out.println(seen);
            target = 0 - nums[i];
            for(int j=i+1; j<n; j++){
                complement = target - nums[j];
                if (seen.contains(complement)){
                    List<Integer> li = Arrays.asList(nums[i],nums[j],complement);
                    Collections.sort(li);
                    if (!result.contains(li)){
                        result.add(li);
                    }
                }else{
                    seen.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}