class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []output=new int[n*2];
        
        for(int i=0;i<n;i++){
            output[i]=output[n+i]=nums[i];

        }
        return output;
    }
}