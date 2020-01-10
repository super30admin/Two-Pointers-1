// Time Complexity : O(N)
// Space Complexity : vector/auxiallary data structure
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes
//It failed for the following scenario:-
{2,0,1}


// Your code here along with comments explaining your approach
// PROGRAM IMPLEMENTED IN C++//
// Using vectors instead of arrays as vector are dynamic arrays and occupy dynamic size  in real time programming//
// Using 2 pointers - iterators i and j in a while loop//
class Solution {
public:
    void sortColors(vector<int>& nums) 
    {
      
      vector<int>::iterator i = nums.begin();
      vector<int>::iterator j = nums.end()-1;
      while(j!=nums.begin() && i!=j)
      {
          if(*i>*j) // Check if content of i is greater than j
          {
              swap(*i,*j); //swap contents
              i++;          //increment i pointer
          }
          else if(*i==*j) //check for equal contents of i and j
          {
             j--;          // decrement j pointer
          }
          else if(*i==0) //if first element is 0, then increment only i
              i++;
          else i++;
      }//end of while
        
    }//end of func
};//end of class