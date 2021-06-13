
/* leetcode 3 sum problem 
Idea here is to use Two pointers approach - with sorting
I sorted array before which takes O(nlogn) and then putting pivot at 0 and low running from pivot+1
High pointer runs backwards. for every pivot check the sum of the triplet equals 0, less than 0 or greater than 0
if sum ==0 add  the triplet to result and increase low, decrease high
*/

