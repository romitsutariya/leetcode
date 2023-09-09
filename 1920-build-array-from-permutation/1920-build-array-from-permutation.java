class Solution {
    public int[] buildArray(int[] nums) {
        int[] output=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            output[i]=nums[temp];
        }
        return output;
    }
}