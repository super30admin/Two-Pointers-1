/* Problem Statement:
Verified on leetcode

Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Follow up:

    A rather straight forward solution is a two-pass algorithm using counting sort.
    First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
    Could you come up with a one-pass algorithm using only constant space?



 *
 * Time Complexity : O(n) 
 * Space Complexity : O(1)
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>


/* Swap two numbers */
void swap(int *num1, int *num2) {
    int temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}

/* Function to sort in place the colors : 0,1,2 red, blue , green */
void sortColors(int* nums, int numsSize){
    /* index to take care of all the numbers */
    int low = 0;
    int mid = 0;
    int high = numsSize - 1;
    
    if (!numsSize) {
        printf("Invalid num size\n");
        return;
    }
    /* Go on until mid becomes greater than high index */
    while (mid <= high) {
        /* FOR DEBUGGING PURPOSE 
        printf("low:%d mid:%d high:%d  [",low,mid,high);
        for (test=0;test<numsSize;test++)
            printf("%d ", nums[test]);
        printf("]\n");
        */
        /* The idea is to make sure that mid index is used to keep 0 and 1 on the left side
         * and keep moving 2 to the extreme right end as possible */
        /* high : points to the index where the next 2 number should be moved */
        /* If num at mid idx is 0, then swap the numbers with position at low index and
           increment low and mid. */
        if (nums[mid] == 0) {
            swap(&nums[low],&nums[mid]);
            low++;
            mid++;
        }
        /* In this case, just increment by 1 as there is no need to move this point */
        else if (nums[mid] == 1) {
           mid++;
        } else {
            /* Number is 2 so move this to the high index and decrement high index */
            swap(&nums[mid],&nums[high]);
            high--;
        }
    }
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

    sortColors(num_p, argc - 1);
    for (idx = 0; idx < (argc - 1); idx++) {
      printf("%d ", num_p[idx]);
    }
    printf("\n");
    free(num_p);
    return 0;
}


