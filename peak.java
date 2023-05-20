class peak{
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                return i-1;
            }
        }
        return nums.length-1;
    }
}
