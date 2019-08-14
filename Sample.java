// Time Complexity :O[N^3]
// Space Complexity : O[1]
// Did this code successfully run on Leetcode : Didn't try on Leetcode
// Any problem you faced while coding this : Trying to find the optimum solution, provided the brute force solution
// Your code here along with comments explaining your approach
class num{ 
static void Triplets(int[] arr, int n) 
{ 
    boolean found = true; 
    for (int i=0; i<n-2; i++) 
    { 
        for (int j=i+1; j<n-1; j++) 
        { 
            for (int k=j+1; k<n; k++) 
            { 
                if (arr[i]+arr[j]+arr[k] == 0) 
                { 
                    System.out.print(arr[i]); 
                    System.out.print(" "); 
                    System.out.print(arr[j]); 
                    System.out.print(" "); 
                    System.out.print(arr[k]); 
                    System.out.print("\n"); 
                    found = true; 
                } 
            } 
        } 
    } 
  
    if (found == false) 
        System.out.println("No triplets exist "); 
  
} 