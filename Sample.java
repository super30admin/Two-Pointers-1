// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public int maxArea(int[] height) {
        

        int pleft = 0;
        int pright = height.length-1;
        int max=0;

        while (pleft < pright) {
            int area = Math.min(height[pleft], height[pright]) * (pright-pleft);
            max = Math.max(area, max);
            System.out.println(max);
            if (height[pleft] <= height[pright]) {
                pleft++;
            } else if (height[pright] < height[pleft]) {
                pright--;
            }
        }

        return max;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            int pleft = i+1;
            int pright = nums.length-1;
            if (nums[i] > 0){
                break;
            }
            if (i!=0 && nums[i] == nums[i-1]) {
                continue;
            }
            while(pleft < pright) {
                int sum = nums[pleft] +nums[i] + nums[pright];
                if(sum == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[pleft]);
                    temp.add(nums[pright]);
                    result.add(temp);
                    pleft++;
                    pright--;
                    while(pleft < pright && nums[pleft-1] == nums[pleft]){
                        pleft++;
                    }
                    while (pright > pleft && nums[pright] == nums[pright+1]){
                        pright--;
                    }
                } else if (sum > 0) {
                    pright--;
                } else if(sum < 0){
                    pleft++;
                }

            }
        }

        return result;
    }
}

class Solution {
    public void sortColors(int[] nums) {
        
        if(nums.length == 1) {
            return;
        }
        int pleft =0;
        int curr = 0;
        int pright=nums.length-1;

        while (curr<=pright) {
            if (nums[curr] == 0) {
                int temp = nums[curr];
                nums[curr]=nums[pleft];
                nums[pleft] = temp;
                pleft++;
                curr++;
            } else if(nums[curr] == 2) {
                int temp = nums[pright];
                nums[pright] = nums[curr];
                nums[curr] = temp;
                pright--;
            } else {
                curr++;
            }
        }
    }

}
