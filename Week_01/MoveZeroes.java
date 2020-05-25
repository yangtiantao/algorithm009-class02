class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[++index]=nums[i];
                if(i!=index){
                    nums[i]=0;
                }
            }
        }
    }
}