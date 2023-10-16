//this is an extension of the two sum problem
//we sort the array initially giving the time complexity of : O(nlog n)
//then taking each element, we check for the third sum in the remaining array
//thus the best time complexity for two sum was : O(nlog n) and counting the traversal of the array

//Time complexity: O(n^2 log n)
//Spaces complexity: O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSummation {

    public static void main(String[] args)
    {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list = threeSum(nums);
        System.out.println("Result is " + list );

    }
    
    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++)
        {
            //outer duplicacy
            if(i>0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = n-1;

            while(l < r)
            {
                int currSum = nums[i] + nums[l] + nums[r];
                if(currSum == 0)
                {
                    List<Integer> li = Arrays.asList(nums[i] , nums[l] , nums[r]);
                    result.add(li);
                    l++; r--;
                    //inner duplicacy
                    while(nums[l] == nums[l-1] && l<n-1)
                    {
                        l++;
                    }
                    while(nums[r] == nums[r+1] && r>0)
                    {
                        r--;
                    }
                }
                else if(currSum > 0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
    return result;
    }
}
