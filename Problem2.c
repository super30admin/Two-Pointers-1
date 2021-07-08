/* Problem Statement:
Verified on leetcode

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

 *
 * Time Complexity : O(n^2) 
 * Space Complexity : O(1)
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>



/* 0,1,2 */
#define TOTAL_PAIR_NUM 3
#define REALLOC_SIZE 50

/* Quick Sort Compare function*/
int compare (const void * num1, const void * num2)
{
  return ( *(int*)num1 - *(int*)num2 );
}

/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** threeSum(int* nums, int numsSize, int* returnSize, int** returnColumnSizes){
    int **final_arr = NULL;
    int *col_arr = NULL;
    int idx = 0;
    int left_idx = 0, right_idx = 0, target_num = 0;
    int alloc_size = 0;
    
    /* Init and validate */
    *returnSize = 0;
    if (!numsSize) {
        return NULL;
    }
    /* allocate memory for the arrays */
    if ((numsSize) >= 1) {
        col_arr = (int *)malloc(sizeof(int) * (numsSize));
        
        if (!(col_arr)) {
            printf("Memory allocation failed for columnsize arr\n");
            return NULL;
        }
        final_arr = (int **)malloc(sizeof(int *) *  ((numsSize)));

        if (!(final_arr)) {
            printf("Memory allocation failed for final arr\n");
            return NULL;
        }       
    }
    /* save allocation size */
    alloc_size = numsSize;

    /* Sort O(n logn) complexity */
    qsort(nums,numsSize, sizeof(int), compare);

    /* Go for numbers till index - 2 as we are comparing 3 numbers */
    for (idx = 0; idx < (numsSize - 2); idx++) {
        
        /* If the number is repeating, then skip those duplicates */
        if (idx > 0 && nums[idx] == nums[idx - 1]) {
            continue;            
        }

        /* Take idx as target, make a copy of it in -ve form then use other 2 indexes
         * ie left_idx and right_idx to find the other 2 numbers of the pair */
        left_idx = idx + 1;
        right_idx = numsSize - 1;
        target_num = -nums[idx];

        /* condition for while loop */
        while (left_idx < right_idx) {
            /* If target is same as addition of left and right idx */
            if (nums[left_idx] + nums[right_idx] == target_num) {
                /* reallocation logic as memory is maintained by us. */
                if ((*returnSize + 1) >= alloc_size) {
                    alloc_size = alloc_size + REALLOC_SIZE;
                    final_arr = (int **)realloc(final_arr, sizeof(int *) * alloc_size);
                    col_arr = (int *)realloc(col_arr, sizeof(int) * alloc_size);

                }
                /* allocate for storing the result array */
                final_arr[(*returnSize)] = (int *)malloc(sizeof(int) * TOTAL_PAIR_NUM);
                if (!final_arr) {
                    printf("Failed memory allocation for idx : %d\n", (*returnSize));
                    return final_arr;
                }

                final_arr[(*returnSize)][0] = nums[left_idx];
                final_arr[(*returnSize)][1] = nums[right_idx];
                final_arr[(*returnSize)][2] = nums[idx];
                /* sort the result array */
                qsort(final_arr[*returnSize],TOTAL_PAIR_NUM, sizeof(int), compare);
                
                /* update col size array */
                col_arr[(*returnSize)++] = TOTAL_PAIR_NUM;

                /* Move indexes to appropriate places */
                left_idx++;
                right_idx--;
                /* Skip consecutive duplicate elements for both left and right side if any */
                while ((left_idx < right_idx) && (nums[left_idx] == nums[left_idx - 1])) {
                    left_idx++;
                }

                while ((right_idx > left_idx) && (nums[right_idx] == nums[right_idx + 1]))
                    right_idx--;                
            }
            else {
                /* If our numbers are less than target it means to make it 0, we need to add
                  more positive number so move left index towards right side */
                /* If our numbers are more than target it means to make it 0, we need to subtract
                  negative number so move right index towards left side */
                if (nums[left_idx] + nums[right_idx] < target_num) {
                    left_idx++;
                } else {
                    right_idx--;
                }
            }
        }
    }
    *returnColumnSizes = col_arr;    
    return final_arr;
}



int main(int argc, char *argv[]) {
    int *num_p = NULL;
    int idx = 0, idx1 = 0;
    int returnSize = 0;
    int *returnColSize = NULL;
    int **final_arr = NULL;

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

    final_arr = threeSum(num_p, argc - 1, &returnSize, &returnColSize);

    /*
    ./a.out -1 0 1 2 -1 -4
      Input size array : 6
      Result length: 2
       [ -1 -1 2 ]
        [ -1 0 1 ]

    */
    if (final_arr) {
        printf("Result length: %d\n", returnSize);
     for (idx = 0; idx < returnSize; idx++) {
        printf("[ ");
        for (idx1 = 0; idx1 < returnColSize[idx];idx1++) {
            printf("%d ", final_arr[idx][idx1]);

        }
        free(final_arr[idx]);
        printf("]\n");
     }
     free(final_arr);
     free(returnColSize);        
    }

    printf("\n");
    free(num_p);

    return 0;
}


