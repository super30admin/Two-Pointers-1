//TC: O(n), where n is number of elements
//SC: O(1) 

class Solution {
public:
    // void swap(int *a, int *b){
    //     int *temp = a;
    //     a = b;
    //     b = temp;
    //     return ;
    // }
    
    
    void sortColors(vector<int>& nums) {
        
        //do quicksort twice, once for the half containing 0, the other time for the half containing 2

//         int i=-1;
//         int j=0;
        
//         for(j=0; j<nums.size(); j++){
//             if(nums[j]<1){
//                 i++;
//                 swap(nums[i], nums[j]);
//             }            
//         }
        
//         for(int k=i+1; k<nums.size(); k++){
//             if(nums[k]<2){
//                 i++;
//                 swap(nums[i], nums[k]);
//             }
//         }
        
        
        //solved using two pointer where if 2 is reached, we swap with the last element in the array and then decrement last element sequentially.
        
        int curr=0; 
        int zeroswap = 0;
        int twoswap = nums.size()-1;
        
        while(curr <= twoswap){
            if(nums[curr] == 0){
                swap(nums[curr], nums[zeroswap]);
                curr++;
                zeroswap++;
            }
            else if(nums[curr] == 2){
                swap(nums[curr], nums[twoswap]);
                twoswap--;
            }
            else curr++;
        }
        
        
    }
};