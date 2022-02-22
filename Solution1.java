/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/
class Solution {
    public void sortColors(int[] arr) {
        int b = 0;
        int l = 0;
        int r = arr.length - 1;
        
        while(b <= r){
            if(arr[b] == 2){
                int temp = arr[b];
                arr[b] = arr[r];
                arr[r] = temp;
                
                r--;
            }else if(arr[b] == 0){
                int temp = arr[l];
                arr[l] = arr[b];
                arr[b] = temp;
                
                l++;
                b++;
            }else{
                b++;
            }
        }
    }
}
