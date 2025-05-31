//T.C: O(n)  no. of element in the nums[]. 
//S.c: O(1) No extra data structure is used.

/*Approach: iterate through the nums[]. At each iteration will keep the element at i 
as my constant num in the total sum and will apply 2Sum on remaining array.
*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i< n-2 ; i++){
            int num1 = nums[i];
            int low = i+1;
            int high = n-1;

            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;

            while(low<high){
                int tempSum = nums[low] + nums[high] +num1;

                if(tempSum == 0){
                     result.add(Arrays.asList(nums[low],nums[high],num1));
                     low++;
                     high--;
                     
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                }else if(tempSum<0){
                    low++;
                }else{
                    high--;
                }
            }

        }
    return result;  
    }
}