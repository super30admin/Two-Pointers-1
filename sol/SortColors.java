package sol;

public class SortColors {
public void sortColors(int[] nums) {
        
        int red=0;
        int white=0;
        int blue=0;
        
        for( int i=0;i<nums.length;i++){
            
            if(nums[i]==0){red++;}
            if(nums[i]==1){ white++;}
            if(nums[i]==2){blue++;}
        }
        
        int p=0;
        
        while ( red>0){
            
            nums[p]=0;
            p++;
            red--;
        }
        while(white>0){
            
            nums[p]=1;
            p++;
            white--;
        }
        while(blue>0){
            nums[p]=2;
            p++;
            blue--;
            
            
        }
        
        
    }
}
