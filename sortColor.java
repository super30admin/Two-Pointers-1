// Time Complexity : O(n) n - length of array
// Space Complexity : O(1) - constant space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//We are going to fix the zero at the beginning and 2s at the end of the array. 
//We use three pointers: cur - cur element, p1 - index of last zero + 1, p2 - index of last 2 - 1.
//If the cur == 2, swap it with p2 and decrement p2. If cur == 0, swap with p1 and increment both p1 and cur.
//If cur == 1, just increment cur. 


public class sortColor {
    
    public static void sortcolor(int[] arr){
        if(arr == null || arr.length == 0) return;
        int curr = 0, p1 = 0, p2 = arr.length-1;
        int tmp;
        while(curr <= p2){
            if(arr[curr] == 2){
                tmp = arr[curr];
                arr[curr] = arr[p2];
                arr[p2] = tmp;
                p2--;
            }else if(arr[curr] == 0){
                tmp = arr[curr];
                arr[curr] = arr[p1];
                arr[p1] = tmp;
                p1++;
                curr++;
            }else curr++;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,0,1,2,0,0,2};
        sortcolor(arr);

        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
