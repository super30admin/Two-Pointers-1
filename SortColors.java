class SortColors {

    public static void main(String args[]){
        int[] inputArray = new int[]{2,0,2,1,1,0};
        int lowPointer = 0;
        int midPointer = 0;
        int highPointer = inputArray.length -1;

        while(midPointer < highPointer){
            if(inputArray[midPointer] == 2){
                swap(inputArray, midPointer, highPointer);
                highPointer--;

            }else if(inputArray[midPointer] == 0){
                swap(inputArray, midPointer, lowPointer);
                lowPointer++;
                midPointer++;
            }else{
                midPointer++;
            }
           
        }

        for (int i : inputArray) {
            System.out.println(i);
            
           }

    }

    public  static void swap(int[] inputArray, int sourcePointer, int targetPointer){
        int sourceValue = inputArray[sourcePointer];
        inputArray[sourcePointer] = inputArray[targetPointer];
        inputArray[targetPointer] = sourceValue;
    }

}