// Time Complexity:           O(n^2)
// Space Complexity:          O(1)
// where n is length of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Sum3 s = new Sum3();
        List<List<Integer>> list = s.threeSum(nums);
        System.out.println(list);
    }
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);                                                                  // sorting array first

        for(int i=0; i<nums.length; i++)
        {
            if(i!=0 && nums[i]==nums[i-1])                                                  // repeating first value
                continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];

                if(sum==0)                                                                  // triplet found with sum 0
                {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(temp);                                                 // sorting triplet before adding in list
                    list.add(temp);
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1])                                        // repeating second value
                        j++;
                    while(j<k && nums[k]==nums[k+1])                                        // repeating third value
                        k--;
                }
                else if(sum<0)                                                              // sum needs to be increased
                    j++;
                else                                                                        // sum needs to be decreased
                    k--;
            }
        }
        return list;

// ****************************** HashMap Approach ******************************
//        Map<Integer,Integer> hm = new TreeMap<>();
//        HashSet<List<Integer>> list = new HashSet<>();
//        List<Integer> temp ;
//        for(int i=0 ; i<nums.length - 2 ; i++)
//        {
//            int rem = 0 - nums[i] ;                                                 // remaining sum for 2 values
//            for(int j=i+1 ; j<nums.length ; j++)
//            {
//                int diff = rem - nums[j] ;                                          // third value to be found
//                if(hm.containsKey(diff) && i!=hm.get(diff) && j!=hm.get(diff))      // if third value is already added in map and it has new index
//                {
//                    temp= new ArrayList<>(3);
//                    temp.add(nums[i]);                                              // then we will store all 3 values in map
//                    temp.add(nums[j]);
//                    temp.add(diff);
//                    Collections.sort(temp);
//                    list.add(temp);
//                }
//                hm.put(nums[j], j);                                                 // or else we will add third value and index in map
//            }
//        }
////        System.gc();
//        return new ArrayList<>(list);





// ****************************** Brute-Force Approach ******************************
//        List<List<Integer>> list = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//
//        for(int i=0; i<nums.length-2; i++) {
//            for(int j=i+1; j<nums.length-1; j++) {
//                for(int k=j+1; k<nums.length; k++) {
//                    if(nums[i]+nums[j]+nums[k] == 0) {
//                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);  // sum 0
//                        Collections.sort(temp);                                       // sorting values for no duplicates
//                        if(!set.contains(temp)) {
//                            set.add(temp);
//                            list.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return list;
    }
}
