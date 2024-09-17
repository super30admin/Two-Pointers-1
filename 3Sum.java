class 3Sum {
    public List<List<Integer>> threeSum(int[] arr) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
         if(i>0 && arr[i] == arr[i-1]) continue;
          int low = i+1;
          int high = arr.length-1;
          HashSet<String> str = new HashSet<>();
            while(low<high){
                if(arr[i]+arr[low]+arr[high]==0){
                    result.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    while (low < high && arr[low] == arr[low + 1])
						low++;
						while (low < high && arr[high] == arr[high - 1])
							high--;
                    low++;
                    high--;
                }else if(arr[i]+arr[low]+arr[high]<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;
    }
}