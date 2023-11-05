// Time Complexity :  O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  Yes
// Any problem you faced while coding this :  No


// Place pointer a,c such that there are only 0's to left of a and only 2's to right of c
// b is the running pointer starting from b until c.



class Solution{
    void swap(int[] arr, int i, int j){
        int temp= arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public void sortColors(int[] arr){
        int a=0, c=arr.length-1;
        int b=a;
        while(b<=c){
            if(arr[b]==0){
                swap(arr,a,b);
                // since we know 0 has gone from b to a we can increment a.
                a++;
                b++;
            }
            else if(arr[b]==2){
                swap(arr,b,c);
                // We know that 2 has gone from b to c, decrement c.
                // Since we r not aware of the element that has come from c to b,
                // we need to check for b before changing b position
                c--;
            }
            else{
                // if [b] is 1 then directly increment it.
                b++;
            }
        }
    }
}