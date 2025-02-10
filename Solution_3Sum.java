//TC: O(n^2)
//SC: O(1)
//Did it run on leetcode: Yes

import java.util.*;

public class Solution_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        HashSet<List<Integer>> hset = new HashSet<>();

        // Brute force
        // for(int i = 0; i < n-2; i++){
        //     for(int j = i+1; j < n-1; j++){
        //         for(int k = j+1; k < n; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> current = new ArrayList<>();
        //                 current.add(nums[i]);
        //                 current.add(nums[j]);
        //                 current.add(nums[k]);
        //                 Collections.sort(current);
        //                 hset.add(current);
        //             }
        //         }
        //     }
        // }
        // result.addAll(hset.stream().toList());
        // return result;

        // HashSet

        // HashSet<Integer> temp;

        // for(int i = 0; i < n-2; i++){
        //     int temtar = 0 - nums[i];
        //     temp = new HashSet<>();
        //     for(int j = i+1; j < n; j++){
        //         int diff = temtar - nums[j];
        //         if(temp.contains(diff)){
        //             List<Integer> li = Arrays.asList(nums[i], nums[j], diff);
        //             Collections.sort(li);
        //             hset.add(li);
        //         } else {
        //             temp.add(nums[j]);
        //         }
        //     }
        // }
        // result.addAll(hset.stream().toList());
        // return result;

        // Two pointers

        Arrays.sort(nums);
        for(int i = 0; i < n-2; i++){
            if(nums[i] > 0)
                break;

            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    Collections.sort(li);
                    hset.add(li);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1])
                        left++;
                    while(left < right && nums[right] == nums[right+1])
                        right--;
                }
                else if(sum > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }
        result.addAll(hset.stream().toList());
        return result;
    }

}
