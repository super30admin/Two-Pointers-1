import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        //Condition to check if length of array less than 3 or if its empty
        if (nums == null || n < 3) return new ArrayList<>();

        //Step 1: Sort the elements in array
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        //Step 2: Using Two-pointer approach
        //Fix position of first element i.e. nums[i], traverse until < n-2 as we need triplets in end
        for (int i = 0; i < n - 2; i++) { //0(n)
            int l = i + 1;
            int r = n - 1;
            while (l < r) {   //0(n)
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    //Add the set and move to find other triplets, increment left and decrement right
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return new ArrayList<>(result);
    }
        /*
        //Brute-force approach
        for(int i=0; i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum==0){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
    */

    public static void main(String args[]){
        int [] arr1 ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr1));
    }
}

//Time complexity : 0(n^2)
//Space complexity : O(n)