// Time complexity: O(n)
// Space complexity: O(n)
class Solution {
    public void sortColors(int[] nums) {

        Map<Integer, Integer> map = new TreeMap<>();

        for(int num: nums) {
            if(map.get(num) == null) {
                map.put(num,1);
            }
            else {
                map.put(num, map.get(num)+1);
            }
        } // end of for loop

        int index = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            for(int i = 0; i < count; i++) {
                nums[index++] = key;
            }
        }

    }
}