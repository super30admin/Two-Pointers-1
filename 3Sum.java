// Time Complexity : O(N^2)
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

import java.util.*;
class Main{
  public static void main(String []args){
    int []nums={-1,-1,-1,2,2,2-1,1,-4,0,0,0};
    System.out.println("The list whose sum equal to zero are : "+findList(nums));
  }
  private static List<List<Integer>> findList(int []nums){
    List<List<Integer>> result=new ArrayList<>();
    Arrays.sort(nums);
    int n=nums.length;
    for(int i=0;i<n-2;i++){
      if(i>0 && nums[i]==nums[i-1]){
        continue;
      }
      if(nums[i]>0){                    // Array is sorted after this sum 0 is not possible
        break;
      }
      int low=i+1; int high=n-1;
      while(low<high){
        int sum=nums[i]+nums[low]+nums[high];
        if(sum==0){
          List<Integer> li=Arrays.asList(nums[i], nums[low], nums[high]);
          result.add(li);
          low++; high--;
          while(low<high && nums[low]==nums[low-1]){            //To ignore the duplicate list
            low++;
          }
          while(low<high && nums[high]==nums[high+1]){          //To ignore the duplicate list
            high--;
          }
        }else if(sum<0){
          low++;
        }else{
          high--;
        }
      }
    }
    return result;
  }
}