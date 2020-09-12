// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//1.Edge case
//A. return when size is 0 or 1
//B.  return when size is 2
//2. Sort
//A.check if mid pointer is 1 then proceed with no action,  increment mid
//B check if mid pointer is 0 then swap with low pointer, increment mid
//B. check if mid pointer is 2 then swap with high pointer, dont increment mid
class Solution {
   void sort_using_two_pointers(vector<int>&  nums){
       
       int low_pointer = 0;
       int high_pointer = nums.size()-1;
       int mid_pointer = 0;
       
       while( mid_pointer <= high_pointer){
           //2.A
           if(nums[mid_pointer] == 1)
            {
                mid_pointer++;
            }
           else if(nums[mid_pointer] == 0 ){
               swap(nums[low_pointer], nums[mid_pointer] );
               low_pointer++;
               mid_pointer++;
           }
         else if(nums[mid_pointer] == 2 ){
               swap(nums[high_pointer], nums[mid_pointer] );
               high_pointer--;
           }
            
       }
   }
public:
    void sortColors(vector<int>& nums) {
        //1.A
        if(nums.size()==0 || nums.size()==1){
            return;
        }
        //1.B
        if(nums.size()==2){
            if(nums[0]>nums[1]){
                swap(nums[0],nums[1]);
            }
            return;
        }
        
        //2. 
        return sort_using_two_pointers(nums);
    }
};


// Time Complexity : O(n * (k-1))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//1.Edge case
//A. return when size is 0 or 1
//2. Sort
//A. For each (K-1) color we have to go throiugh the array 
//B check if first pointer is at desired color, if yes then increment first pointer
//C. check if second pointer is at desired color then swap with two pointers, increment first pointer to point to non-color element

class Solution {
public:
    void sortColors(vector<int>& nums) {
        //edge
        if(nums.size()==0 || nums.size()==1)
            return;
        
        //logic
        int color = 0;
        int first_ptr =0;
        int second_ptr=0;
        int size = nums.size();
        
        while (color<2){
            //2.B
            while(first_ptr<size && nums[first_ptr] == color){
                first_ptr++;
                //cout<<"here "<<first_ptr<<endl;
            }
            //2.C
            for(second_ptr =first_ptr+1; second_ptr<size; second_ptr++ ){
                if(nums[second_ptr] == color){
                    swap(nums[second_ptr], nums[first_ptr]);
                    first_ptr++;
                }
                //cout<<"first "<< first_ptr<<"second "<<second_ptr<<endl;
            }
            color++;
        }
        
        return;
    }
};
