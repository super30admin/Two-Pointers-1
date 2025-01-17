##### Sort Colors ######

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Initally missed on the case where we swap but need to check the current


# Sort the array such that zero elements are at the left, two elements are on the right end and the one elemnets are in the middle

def sort_colors(colors):
    if not colors:
        return
            
    l = 0
    r = len(colors)-1
    i= 0
    while i <= r:
        if colors[i] == 0:
            colors[i], colors[l] = colors[l], colors[i]
            l+=1
            i+=1
        elif colors[i] == 2:
            colors[i], colors[r] = colors[r], colors[i]
            r-=1
        else:
            i+=1

