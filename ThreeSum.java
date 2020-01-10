package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ThreeSum  {
    public List<List<Integer>> threeSum(int[] nums) {

        /*
        //Brute Force method:
        //TC: O(n^3) SC: O(n)
        HashSet<List<Integer>> set = new HashSet<>();

        //Edge case
        if(nums == null || nums.length < 3) return new ArrayList<>();

        //first pointer will go upto last but second element only
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum == 0){
                        //Adding the numbers to array list
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
                        //sorting the array list
                        Collections.sort(li);
                        //adding the sort arraylist to set
                        set.add(li);
                    }
                }
            }
        }
        //converting set to arraylist and returning it back
        return new ArrayList<>(set);
    }
    */

        //Optimal Solution

        List<List<Integer>> result = new ArrayList<>();

        //Edge

        if(nums == null || nums.length < 3) return result;

        Arrays.sort(nums);
        //[-1, 0, 1, 2, -1, -4]
        for(int i=0; i<nums.length-2; i++){
            //no point in traversing through if numbers have crossed the target as it is sorted array

            if(nums[i] > 0) break;

            //Checking this to make sure not to get duplicate triplets
            //if nums[i] is same as previous nums[i] as further the numbers would be same in array
            //you will end up getting same triplets

            //make sure i isnt less than 0 to avaoid AOBExc
            //if two elements are same skip that i and continue with next elements nums[i]

            if(i>0 && nums[i] == nums[i-1]) continue;

            //initializing low and high wrt to fixed first element of the supposed to be triplet
            int low = i+1;
            int high = nums.length - 1;

            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];

                if(sum == 0){
                    //got a triplet
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    //once the first to be element is fixed, while finding other two elements
                    //if we low[i-1] and low[i] might be same; then again we end up getting same triplets
                    //so, check that aswell
                    //also imp check l< h
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;

                }
                else if(sum < 0){ low++;}
                else{high--;}
            }

        }
        return result;
    }

    public static void main(String args[]){
        ThreeSum obj = new ThreeSum();

        List<List<Integer>> result = new ArrayList<>();

        int[] nums = new int[]{-1,0,1,2,-1,4};
        result = obj.threeSum(nums);


        ListIterator iter = result.listIterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}