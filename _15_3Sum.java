
// time complexity - o(nlogn + n*2)
    //space - o(1)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : SorT the array and for first eleemnt find two elements whose sum when added equals zero. Since array is sorted we can Use
    // two pointer approach to find thosenumber isn o(n)time
    // NOw one thig is to node about duplicate triplets, you can use set to avoid it but that will require extra space
    // whenever you find triplet, move the left and right until nums[left] or nums[right] are equal , this way we will avoid duplicates.
    // Same logic t=when choosing first number, keep moving i until previous number is different

class Solution {

    List<List<Integer>> res = null;

    public List<List<Integer>> threeSum(int[] nums) {

        res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length; i++){
            if(i == 0  || (nums[i-1] != nums[i] && nums[i] <= 0) )
                twoSum(nums, i);
        }
        return  res;
    }

    public void twoSum(int[] nums, int targetIndex){

        int start = targetIndex + 1;
        int end = nums.length - 1;

        while(start < end){

            int sum = nums[targetIndex] + nums[start] + nums[end];

            if(sum == 0){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[targetIndex]);
                temp.add(nums[start]);
                temp.add(nums[end]);
                res.add(temp);
                start++;
                end--;
                while(start < end && nums[start-1] == nums[start]){
                    start++;
                }
                while(end > start && nums[end] == nums[end+1] ){
                    end--;
                }
            }
            else if(sum < 0){
                start++;
            }
            else{
                end--;
            }
        }
    }


}
