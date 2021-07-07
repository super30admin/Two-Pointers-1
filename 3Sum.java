//Time Complexity:O(n2)
//Space Complexity:O(1)
//All edge cases covered in : [-4,-1,-1,-1,0,1,2,2]
//Sort the array, increment till the previous values are same.
//for i , check next j and k starting from last element
//if they are i+j+k== k--, j++ . Since there can be other solutions
//otherwise i+j+k>0 k--
//or i+j+k<0 then j++

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums==null || nums.length==0)
            return result;
        else{
            Arrays.sort(nums); //Remmeber to sort
             for(int i=0;i<nums.length;i++){
                 
                 int k = nums.length-1; //Still needs to be checked everytime
                 int j = i+1;
                 
                 if(i>0 &&nums[i]==nums[i-1])
                 {
                     continue; //previous counts wont matter
                     //e,g,[-1,-1,2] will not repeat - Edge case
                 }
                 
                 while(j<k)
                 {
                     if(k<nums.length-1 && nums[k]==nums[k+1]){
                        k--;
                        continue;
                    }
                     
                      if(nums[i]+nums[j]+nums[k]>0){
                        k--; //Since k is greater than  0 k needs to decrease
                    }
                     
                     else if(nums[i]+nums[j]+nums[k]<0){
                        j++;
                    }
                    else{
                        ArrayList<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        result.add(l);
                        
                        //To find other combinations with i
                        
                        j++;
                        k--;
                    }
                     
                 }
             }
            
            
    }
        return result;
}
}
