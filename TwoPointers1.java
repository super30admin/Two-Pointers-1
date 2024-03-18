//Container with most water
//Time Complexity O(N) and Space Complexity O(1)
class Solution {
    public int maxArea(int[] height) {

        int Maxarea=0;
        int i=0;
        int k=height.length-1;
        while(i<k){
            int L = Math.min(height[i],height[k]);
            int H = k-i;
            int area = L*H;
            if(area>Maxarea){
                Maxarea=area;
            }
            if(height[i]<=height[k]){
                i++;
            }else{
                k--;
            }
        }

        return Maxarea;
        
    }
}

//3sum
//time complexity O(n2) and Space Complexity O(N)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sorting the array
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        //iterating the outside loop
        for(int i=0;i<n-2;i++){
            
            //checking for duplicates
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            int l=i+1;
            int h= n-1;
            //iterating the inside loop
            while(l<h){
                
                int currSum = nums[i]+nums[l] + nums[h];
                if(currSum==0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    l++;
                    h--;

                    while(l<h && nums[l]==nums[l-1]){
                        l++;
                    }

                    while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }else if(currSum<0){
                    l++;
                
                }else{
                    h--;
                }
                

            }

    
        }

        return result;
    }
}



//Sort colors
//Time Complexity O(N) and space complexity O(1)
class Solution {
    public void sortColors(int[] nums) {

        int i=0;
        int j=0;
        int k= nums.length-1;


        while(i<=k){
            if(nums[i]==0){
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;

            }else if(nums[i]==2){
                int temp= nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k--;
            }else{
                i++;
            }
        }
        
    }
}
