
//Time complexity - O(N^2)
//Space Complexity - O(N)


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //Sort the array

        Arrays.sort(nums);


        List<List<Integer>> result = new ArrayList<>();

        //Loop through the array if first element is > 0 break the loop

        for(int i = 0 ; i < nums.length && nums[i] <= 0; i++) {
            // if next element of i is not same as previous do twosum
            if(i == 0 || nums[i - 1] != nums[i]) {

                twoSum(nums,i,result);

            }


        }

        return result;


    }

    //twoSum solution calculate the difference and add triplets to the result
    void twoSum(int [] nums, int i, List<List<Integer>> result) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int j = i+1; j < nums.length; j++) {

            int difference = - nums[i] - nums[j];


            if(hashSet.contains(difference)) {

                result.add(Arrays.asList(nums[i],nums[j],difference));

                //if j+1 element is same as j element skip and movee to the next one
                while(j+1 < nums.length && nums[j] == nums[j+1])
                    j++;

            }

            else {

                hashSet.add(nums[j]);

            }



        }



    }

}