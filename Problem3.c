/* Problem Statement:
Verified on leetcode

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

Given an array of numbers of length N, find both the minimum and maximum. Follow up : Can you do it using less than 2 * (N - 2) comparison

https://leetcode.com/problems/container-with-most-water/

 *
 * Time Complexity : O(n) 
 * Space Complexity : O(1) 
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>


/* Macros for our use */
#define max(a, b) ((a) > (b)) ? (a) : (b);
#define min(a,b)  ((a) > (b)) ? (b) : (a);

/* Function which calculates max area. Returns the max area */
int maxArea(int* height, int heightSize){
    int max_cap = 0; /* max capacity of water recorded so far */
    int start_idx = 0; /* index moves from left to right in array */
    int end_idx = heightSize - 1; /* index moves from right to left in array */
    int min_height = 0; /* stores which index value is lower */
    
    while (start_idx < end_idx) {    
        /* Determine min height */    
        min_height = min(height[start_idx], height[end_idx]);
        /* Calculate capacity by multiplying min height with difference between indexes */
        max_cap = max(max_cap, (end_idx - start_idx) * min_height);
        
        /* 

         ^
         |          ++
       8 |          |                                    +-+
         |          |                                    |
       7 |          |                                    |                  +
         |          |                                    |                  |
       6 |          |       +                            |                  |
         |          |       |                            |                  |
       5 |          |       |           +                |                  |
         |          |       |           |                |                  |
       4 |          |       |           |                |                  |
         |          |       |           |      +         |                  |
       3 |          |       |           |      |         |                  |
         |          |       |           |      |         |        +         |
       2 |          |       |    +      |      |         |        |         |
         |    +     |       |    |      |      |         |        |         |
       1 |    |     |       |    |      |      |         |        |         |
         |    |     |       |    |      |      |         |        |         |
         +--------------------------------------------------------------------------->
              0     1      2    3      4       5         6        7         8

              start_idx = 1 end_idx=8, arr[8] = 7;
              area = 8 - 1 * 7;

              If arr[start_idx] <= arr[end_idx]
                  then : move start_idx to right by 1 as we are trying to maximise the area
              else 
                   move end_idx to right by 1.

        */
        if (height[start_idx] <= height[end_idx]) {
            start_idx += 1;
        } else {
            end_idx -= 1;
        }        
    }
    printf("Max area is %d\n", max_cap);
    return max_cap;
}


int main(int argc, char *argv[]) {
    int *num_p = NULL;
    int idx = 0;

    if (argc < 2) {
        printf("Usage: ./a.out <num1> ... <num n>\n");
        exit(1);
    }
    printf("Input size array : %d \n", argc - 1);

    num_p = (int *)malloc((argc - 1)*sizeof(int));
    if (num_p == NULL) {
        printf("Memory allocation failed \n");
        return -1;
    }

    /* Dont want to change the function, so copying the input to int array */
    for (idx = 1; idx < argc; idx++) {
        num_p[idx - 1] = atoi(argv[idx]);
    }

    maxArea(num_p, argc - 1);
    free(num_p);
    return 0;
}


