/*
Time Complexity- O(n2) - trverseing all the elements.
Space - O(n)- sorting
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        //sort an array to have unique triplets. we can ignore the current element if prev element is same as current elemenet. 
        Arrays.sort(nums);
        
        List<List<Integer>> finalList = new LinkedList<>();
        //take 3 pointers. 
        //By iterating over the array and for each element I would be checking if we have a pair exists with sum equals to 0-sum. 
        for(int first=0; first<len-2; first++){
            int second = first+1;
            int third = len-1;
            int sum = 0-nums[first];
            if(first ==0 || nums[first] != nums[first-1]){
            while( second < third){  
                    if(nums[second] + nums[third] == sum){
                        finalList.add(Arrays.asList(nums[first], nums[second],                                                  nums[third]));
                        while(second<third && nums[second] == nums[second+1])
                            second++;
                        while(second<third && nums[third] == nums[third-1])
                            third--;
                        second++;
                        third--;
                    }
                    else if(nums[second] + nums[third] < sum)
                        second++;

                    else if(nums[second] + nums[third] > sum)
                     third--;                       
                }
    
            }
        }
        return finalList;
    }
}
// -4, -1, -1, 0, 1, 2

