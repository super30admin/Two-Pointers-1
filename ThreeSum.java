//two sum -- bruteforce-- try all possible combinations tc-O(n^2) SC- O(1)
//we do not need index here soo we will use hashset 
// remove duplicate with using hashset approach, when we look for target - element in hashset, if we find it
// then after putting the result pair in hashset, remove target - element and element from hashset.
//and we keep result pair in hashset to remove dulicates from that too. TC- On SC- On
//third approach-- sort it and iterate, have 2 pointers l and h at begining and end, take element from l and h 
// add if equal to target form a pair, if less than target mover h till next unique ele, if addition is low move 
//l till next unique ele. keep doing till l and h cross each other. TC- nlogn + On, SC- On
//sort it then binaru search TC- nlogn + nlogn SC- O1




//brute force tc- O(n^3) SC - O(1)-- to remove duplicates from this approach we will use hashset to store result list


// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
     
//     //  List<List<Integer>> result = new ArrayList<List<Integer>>();
//      Set<List<Integer>> resultSet = new HashSet<>();

//       for(int i = 0; i < nums.length; i++){

//         int t = 0-nums[i];

//         for(int j = i + 1; j < nums.length; j++){

//             for(int k = j+1; k < nums.length; k++){
//                 if(nums[j] + nums[k] == t){
//                     //result.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
//                     List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k]);
//                     Collections.sort(triplets);
//                     resultSet.add(triplets);
//                  }
//             }
//         }
//     }

//        return new ArrayList<>(resultSet);
//     }
// }

// Hashset - O(n^2) sc- On but it will contain duplicate 
//so to remove duplicate we need sort it that would add nlogn

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {

//        Arrays.sort(nums);
     
//     //  List<List<Integer>> result = new ArrayList<List<Integer>>();
//      List<List<Integer>> resultSet = new ArrayList<List<Integer>>();

//       for(int i = 0; i < nums.length; i++){
//         if(i > 0 && nums[i] == nums[i-1]){ // skip duplicates
//             continue;
//         }

//         int t = 0-nums[i];

//         HashSet<Integer> set = new HashSet<>();

//         for(int j = i + 1; j < nums.length; j++){

//         if(set.contains(t-nums[j])){
//             resultSet.add(Arrays.asList(nums[j],t-nums[j], nums[i]));

//         // Skip duplicates for the second number in the pair
//               while(j + 1 <nums.length && nums[j] == nums[j+1]){
//             j++;
//         }
//         }
      
//         set.add(nums[j]);
//         }
//     }

//        return resultSet;
//     }
// }


//sort it and binary search- nlogn + n*nlogn

// sort it and 2 pointer TC - nlogn + n^2 SC - O(1)(optimal approach space wise)


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // we will use sorting for this to remove duplicates
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
          if(i > 0 && nums[i] == nums[i-1]) continue;
          if(nums[i] > 0) break;// it is sorted array
          // if i found any num greater than 0 it will never be 0
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];

                if(sum == 0){

                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                while(low<high && nums[low] == nums[low - 1]) low++;
                while(low<high && nums[high] == nums[high + 1]) high--;

                }else if(sum >0 ){
                    high --;
                }else if(sum < 0){
                    low ++;
                }

            }
        }

        return result;
     
        
    }
}











































