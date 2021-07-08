//TimeComplexity:  O(N*N); we can ignore O(NlogN) of sorting as it is small compared to O(N*N)
//SpaceComplexity: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);

        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            while (j < k) {
                if (k < arr.length - 1 && arr[k] == arr[k + 1]) {
                    k--;
                    continue;
                }

                if (arr[i] + arr[j] + arr[k] > 0) {
                    k--;
                } else if (arr[i] + arr[j] + arr[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(arr[i]);
                    l.add(arr[j]);
                    l.add(arr[k]);
                    result.add(l);
                    j++;
                    k--;
                }
            }
        }

        return result;
    }
}