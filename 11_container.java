var maxArea = function(height) {
    let l = 0, r = height.length-1, result=0;

	while(l<r){
		let h = Math.min(height[l], height[r]);
		let area = h*(r-l)
		result = Math.max(area, result)
		if(height[l]< height[r]){
		   l++
		}else{
			r--
		}
	}
	return result
};