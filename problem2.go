// Time Complexity : O(n2)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
func threeSum(nums []int) [][]int {
    if len(nums) == 0{
            return [][]int{}
    }
    
    sort.Ints(nums)
    
    var left int
    var right int
    
    result := [][]int{}
    
    for i:=0;i<len(nums);i++{
        if nums[i] > 0{
            break
        }
        
        if i>0 && nums[i] == nums[i-1]{
            continue
        }
        
        left = i+1
        right = len(nums)-1
        
        for left < right{
            sum := nums[i] + nums[left] + nums[right]    
            if sum < 0{
                left+=1
            }else if sum > 0{
                right-=1
            }else{
                result = append(result,[]int{nums[i],nums[left],nums[right]})
                left+=1
                right-=1
                
                for left < right && nums[left] == nums[left-1]{
                    left+=1
                }
            
                for left < right && nums[right] == nums[right+1]{
                    right-=1
                }
            }
            
           
        }
        
    }
    
    return result
    
}
