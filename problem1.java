public class problem1 {
    public static void sortColors(int[] arr) {
        int red =0; int white = 0; int blue = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) red++;
            if(arr[i]==1) white++;
            if(arr[i]==2) blue++;
        }
        for(int i=0;i<arr.length;i++) {
            if(red>0) {arr[i] = 0;red--;}
        else if(white>0) {arr[i]=1; white--;}
        else{arr[i]=2; blue--;}
    }
    for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
    }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
    }
}