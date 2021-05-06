/* Approach: We use 3 pointers. 
1. One would be the pivot. 
2. Other 2 pointers would be pointing to begining and end of the array.
3. Depending on the sum of elements pointed by all these 3 pointers, change the pointers.
4. If the sum is greater than 0, high needs to be reduced to a element that would give a smaller sum
5. If the sum is smaller, then low needs to be increased to point to an element that'd increase the sum
6. If no combination is found for the pivot, make the next element the pivot

Space complexity: O(1)
Time complexity: O(NLogN)
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int pivot=0;
        int i=1;
        int j=nums.length-1;
        
        //sort the array first
        Arrays.sort(nums);
        
        while(pivot<=nums.length-3) //all the elements have to be different
        {
            i=pivot+1;
            j=nums.length-1;
            while(i<j)
            {
                ArrayList<Integer> combination = new ArrayList<>();
                if(nums[pivot]+nums[i]+nums[j]==0)
                {
                    combination.add(nums[pivot]);
                    combination.add(nums[i]);
                    combination.add(nums[j]);
                    result.add(combination);
                    int currentI = nums[i];
                    int currentJ = nums[j];
                    /* We need the combinations to be different. To ensure we don't count repeated 
                    elements more than once, move pointers till we encounter different elements
                    */
                    while(nums[i] == currentI && i+1<=(nums.length-1)) 
                        i++;
                    while(nums[j] == currentJ && j-1>=0)
                        j--;
                }
                else if(nums[pivot]+nums[i]+nums[j]>0) 
                    j--;
                else 
                    i++;
            }
            int currentPivot = nums[pivot];
            /* We need the combinations to be different. To ensure we don't count repeated 
            pivots more than once, move pivot till we encounter a new one
            */
            while(nums[pivot]==currentPivot && pivot<=nums.length-3)
                pivot++;
        }
        return result;
    }
}