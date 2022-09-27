// tc - O(n2 nlogn)
// sc - O(1)
// ran in leetcode -yes


// two pointer - By Sorting the array the efficiency of the algorithm can be improved. This efficient approach uses the two-pointer technique. Traverse the array and fix the first element of the triplet. Now use the Two Pointers algorithm to find if there is a pair whose sum is equal to x – array[i]. Two pointers algorithm take linear time so it is better than a nested loop.

// we can do using hash for linear sol.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        for(int i=0;i < nums.length ;i++){
            input.add(nums[i]);
        }
        int sum =0;
        Collections.sort(input);
        for(int i=0;i<input.size()-2;i++){
            if(i==0 || (i>0 && !input.get(i).equals(input.get(i-1)))){
                int low = i+1;
                int high = input.size() -1;
                sum=sum-input.get(i);
                while (low < high){
                    if(sum == input.get(low)+input.get(high)){
                        ArrayList<Integer> inans = new ArrayList<Integer>();

                        inans.add(input.get(i));
                        inans.add(input.get(low));
                        inans.add(input.get(high));
                        ans.add(inans);

                        while (low < high && input.get(low).equals(input.get(low + 1)))
                            low++;

                        while (low < high && input.get(high).equals(input.get(high - 1)))
                            high--;

                        low++;
                        high--;
                    } else if (input.get(low)+input.get(high) < sum){
                        low ++;
                    }else{
                        high --;
                    }
                }

            }
            sum =0;
        }
        return ans;
    }
}
