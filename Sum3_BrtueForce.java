import java.util.*;

class Sum3_BrtueForce {
    //Brute force appraoch to get 3 Sum arrays.
    //TC will be O(n^3), as there are 3 for loops to check for each and every combination.
    //SC will be O(n) as using set to store the unique values.
    public List<List<Integer>> threeSum(int[] nums) {   //Base case to check if array list is empty
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }

        HashSet<List<Integer>> set = new HashSet<>();       //to store unique values
        List<List<Integer>> result = new ArrayList<>();     //to return result list
        int n = nums.length;                                //length of array

        for(int i = 0; i< n; i++){              //to get 1st number from the array
            for(int j= i+1; j<n; j++){          //to get 2nd number
                for(int k = j+1; k<n ;k++){      //to get 3rd number
                    if(nums[i] + nums[j] + nums[k] ==0){        //if sum of 3 numbers is 0
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);   //temp list to hold values
                        Collections.sort(temp);     //to sort the list
                        if(!set.contains(temp)){        //adding to set in order to get unique values.
                            set.add(temp);
                            result.add(temp);
                        }
                    }
                }
            }
        }
        return result ;     //return result

    }

    public static void main(String[] args){
        Sum3_BrtueForce obj = new Sum3_BrtueForce();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(nums));
    }
}