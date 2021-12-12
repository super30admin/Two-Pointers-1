// Time Complexity :  O(nlogn) + O(n^2) -> O(n^2)
// Space Complexity : O(1)
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return new ArrayList<>();
        // sort the array
        Arrays.sort(nums); // O(nlogn)
        List<List<Integer>> result = new ArrayList<>();
        // reduce stopping condition by 2 because we need i and low and high.
        // O(n ^2)
        for(int i = 0 ; i < nums.length-2; i ++) // O(n)
        {
            // avoid duplicate sets begining from i 
            if(i > 0 && nums[i] == nums[i-1])
                continue; // skip
            // if sorted array and number > 0 no point looking for it
            if(nums[i] > 0)
                break;
            
            int low = i+1, high = nums.length -1;
            
            while(low < high) //O(n)
            {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0)
                {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    // skip duplicate numbers for low
                    while(low < high && nums[low] == nums[low-1])
                    {
                        low++;
                    }
                    // skip duplicate numbers for high
                    while(low < high && nums[high] == nums[high+1])
                    {
                        high--;
                    }
                }
                else if(sum > 0)
                {
                    high--;
                }
                else // sum < 0
                {
                    low++;
                }
            }
        }
        
        return result;
    }
}
