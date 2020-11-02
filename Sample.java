
//Containers using Brute Force
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

// Take two nested loops and iterate each height with next till you get the max area 
//here height of the constrained matters!

///////////////////////////////////////////////////////////////////////////////////////////////

//Containers using Pointers
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach


//Take two pointers low and high,iterate them till both meets if height of low is less than height of high
//then calculate its area if its max then store it in max value.
//Similarly for height of high is low then calculate its area between low and high
//return max



//Sort Colors
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

//Take 3 pointers low(to track red i.e. 0), mid(to track white i.e. 1) ,high (to track blue i.e.2)
//then pointer shd start like this low = 0, mid = 0 high= array length (last index) 
//if(nums[mid] ==1) mid++;
//else nums[mid] ==2  use swap function to swap high and mid then after this decrement high
//else nums[mid] ==00  use swap function to swap low and mid then after this increment low and mid
//do this till mid reaches high
