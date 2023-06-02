import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSum_2pointer {

    public List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums); // O(nlogn)

        for(int i = 0; i < n-2; i++){

            //do not check for twoSum for the same number, but continue
            if(i > 0 && nums[i] == nums[i-1]) continue;

            // for a positive number, pointers can not give zero
            if(nums[i] > 0) return result;

            int left = i+1, right = n-1;

            while(left <= right ){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){

                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);

                    result.add(li);

                    // move pointers after adding to result
                    right--;
                    left++;

                    // if the element repeats, move further for a unique element
                    while(left <= right && nums[left] == nums[left - 1]) left++;
                    while(left <= right && nums[right] == nums[right + 1]) right--;
                }
                // if sum is negative, move right
                else if(sum < 0){
                    left++;
                }
                // if sum is positive, move left
                else{
                    right--;
                }
            }
        }
        return result;
    }

    /*
    Time complexity = O(n^2)
    Space complexity = O(1)
    */
    public static void main(String[] args) {
        ThreeSum_2pointer object = new ThreeSum_2pointer();

        int[] arr = {1,0,-1,4,-1,1,0,1,-1,-3,3,-4,2,-2,1,2,0,1};

        List<List<Integer>> answer = object.threeSum(arr);

        System.out.println("Unique triplets summing to zero are ");

        for(int i = 0; i < answer.size(); i++) {

            for (int j = 0; j < 3; j++) {

                if (j < 2) System.out.print(answer.get(i).get(j) + ", ");
                else System.out.print(answer.get(i).get(j));

            }
            System.out.println();
        }
    }
}
