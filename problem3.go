// Time Complexity : o(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

func maxArea(height []int) int {
    if len(height) == 0{
        return 0
    }
    
    left := 0
    right := len(height) -1
    
    max := 0
    
    for left <= right{
        max = maximum(max,minimum(height[left],height[right])*(right-left))
        
        if height[left] < height[right]{
            left+=1
        }else{
            right-=1
        }
    }
    
    return max
}


func minimum(a,b int) int{
    if a < b{
        return a
    }
    
    return b
}

func maximum(a,b int) int{
    if a > b{
        return a
    }
    return b
}
