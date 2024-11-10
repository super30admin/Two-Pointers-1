// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Problem2 (https://leetcode.com/problems/3sum/)
class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        return twoPointer(nums);
    }

    //TC:nLogn + O(N^2) = O(N^2)
    //SC : O(1)
    public List<List<Integer>> twoPointer(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int num = nums[i];
            int target = 0-num;
            int l = i+1;
            int r = nums.length-1;

            List<List<Integer>> sumLst = twoSum(nums,num,target,l,r);
            result.addAll(sumLst);
        }

        return result;




    }

    public List<List<Integer>> twoSum (int[] nums,int firstNum,int target,int l,int r){
        List<List<Integer>> sumList = new ArrayList<>();
        while(l<r){

            if(nums[l]+nums[r]==target){
                // Skip duplicates for the second and third elements
                while (l < r && nums[l] == nums[l + 1]) {
                    l++;
                }
                while (l < r && nums[r] == nums[r - 1]){
                    r--;
                }
                sumList.add(Arrays.asList(firstNum,nums[l],nums[r]));
                l++;
                r--;
            }else if (nums[l]+nums[r]<target){
                l++;
            }else{
                r--;
            }
        }
        return sumList;
    }






}