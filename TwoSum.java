

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum
{
    public static void main(String[] args) {
        TwoSum test = new TwoSum();
        test.twoSum(new int[]{2,4,6,8,9,10,23,44,55,12,13,17}, 0);
    }
    public int[] twoSum(int[] nums, int target)
    {
        int[] ans = new int[2];
        //ans = twoSumBruteforce(nums, target, ans);
        //ans = twoSumHashMap(nums, target, ans);
        ans = twoSumTwoBinarySearch(nums, target);
        System.out.println(ans[0] + "------" + ans[1]);
        return ans;
    }

    // time complexity O(N^2);
    // space complexity O(1);
    public int[] twoSumBruteforce(int[] nums, int target, int[] ans)
    {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // time complexity O(N);
    // space complexity O(N);
    public int[] twoSumHashMap(int[] nums, int target, int[] ans)
    {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++)
        {
            int key = target - nums[i];
            if(map.containsKey(key))
                return new int[]{i, map.get(key)};
            else
                map.put(nums[i], i);
        }
        return null;
    }


    public int[] twoSumTwoPointer(int[] nums, int target, int[] ans)
    {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        while (start < end)
        {
            if(nums[start] + nums[end] > target)
                end--;
            else if (nums[start] + nums[end] < target)
                start++;
            else
                return new int[] {nums[start], nums[end]};
        }
        return null;
    }

    public int[] twoSumTwoBinarySearch(int[] nums, int target)
    {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        while (start < end)
        {
            int searchTarget = target - nums[start];
            int foundTarget = binarySearch( nums,start + 1, end, searchTarget);
            if(foundTarget == -1)
                start++;
            else
                return new int[] {nums[start], nums[foundTarget]};
        }
        return null;
    }
    public int binarySearch(int[] nums, int start, int end, int target)
    {
        if(start > end )
            return -1;
        int mid = start + (end-start)/2;
        if(nums[mid] == target)
            return mid;
        else if (nums[mid] > target)
            return binarySearch(nums, start,mid-1, target);
        else
            return binarySearch(nums, mid+1, end, target);
    }
}
