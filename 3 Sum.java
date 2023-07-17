// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: We have fixed one pointer on the first element of the array and performed two sum array in the remaining elements using two pointers low and high. The sum of all these pointers should return 0.
// We set the number after the fixed outer pointer as low and the last element of the array as high. if the sum is lesser than 0 then we increment low otherwise we decrement high. Then perform this iteration until low crosses high. Then, we moved the outer pointer to the next element which is not same as the current one. This is done to remove duplicacy.

//Two pointer
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
List<List<Integer>> result=new LinkedList();
Arrays.sort(nums);
int n=nums.length;

for(int i=0;i<n-1;i++)
{
    //to remove outer duplicacy, we move i to the next number, not equal to the previous one
    if(i!=0 && nums[i]==nums[i-1]) continue;
    // low pointer will alway start from the value after the index i and high will be the last element
    int low=i+1, high=n-1;

    while(low<high)
    {
        int sum=nums[i]+nums[low]+nums[high];
        if(sum==0)
        {
            result.add(Arrays.asList(nums[i],nums[low],nums[high]));
            //move the pointers from the current pair
            low++;
            high--;
            //After finding the pairs , we need to check for inner duplicacy and skip the duplicate pointers
            while(low<high && nums[low]==nums[low-1])
            {
                low++;
            }
            while(low<high && nums[high]==nums[high+1])
            {
                high--;
            }
        }
        else if(sum<0)
        {
            low++;
        }
        else
        {
            high--;
        }
    }
}
return result;
    }
}


/*
 * class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            //This is to skip the outer duplicacy
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
// We need to look for three numbers which add up to 0. So we set the nums[i] as negative, so the number we look for in the remaining array is equal to the nums[i]
            int target = -nums[i];
            int low = i + 1, high = n - 1;


            HashSet<List<Integer>> set = new HashSet<>(); // To store unique triplets

            while (low < high) {
                int sum = nums[low] + nums[high];
// When the sum of low and high is equal to the negative value of nums[i]
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
                // Skip duplicates of the second number
                    while (low < high && nums[low] == nums[low - 1])
                        low++;
            }

            for (List<Integer> triplet : set) {
                result.add(triplet);
            }
        }

        return result;
    }
}

 */