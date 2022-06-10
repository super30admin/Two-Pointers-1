import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time Complexity: O(n^2 + nlogn)
//Space Complexity: O(n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //creating a list of list of integers to store the list of triplets
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        
        //null case check
        if(nums == null && n == 0) return result;  
        
        //using in-built java function to sort the nums array
        Arrays.sort(nums);
        
        //iterating through each element of nums
        for (int i = 0; i < n; i++)
        {
            //starting from secons element, if the element and its previous element
            //then we skip that iteration of loop as it may give us a duplicate triplet
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            
            //once our for loop reaches positive elements, it is impossible to finsd a trip..
            //as all none of the remaining elements are negative and all are greater than current one
            if(nums[i] > 0) break;
            
            //creating the low and high pointers so that...
            //low points to the element following i and high points to the last element
            int low = i + 1;
            int high = n - 1;
            //[-1,0,1,2,-1,-4]
            //[-1[i], 0[low], 1, 2, -1, -4[high]]
            // i is at -1, low is at 0 and high is at -4
            
            //we loop until the low and high pointers cross each other
            while (low < high)
            {
                //the sum will be the addition of elements at the three locations
                //to find a triplet, we need this addition to be zero
                int sum = nums[i] + nums[low] + nums[high];
                
                //if the three numbers do form a triplet
                if(sum == 0)
                {
                    //adding the three elements to a list of integers
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    //add that list to the resultant List<List<Integer>> 
                    result.add(li);
                    
                    //moving low and high pointers to check other possible tiplets
                    //[-1[i], 0, 1[low], 2, -1[high], -4]
                    low++;
                    high--;
                    
                    //first, rechecking the original while condition so we don't go out of bounds
                    //second, if the new [low]/[high] element is identical to its [previous]/[next] element
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--;
                    
                }
                
                //if the sum is greater>0 then we move the high pointer to the left
                //as the array is sorted, it will potentially move high to a smaller element
                else if(sum > 0)
                {
                    high--; 
                }
                //if the sum is lesser<0 then we move the high pointer to the right
                //as the array is sorted, it will potentially move low to a larger element
                else
                {
                    low++;
                }
            }  
        }
        return result;   
    }
}