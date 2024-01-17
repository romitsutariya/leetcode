class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length+1;
      int total=n*(n-1)/2;
      int total_sum=0;
      for(Integer num:nums){
          total_sum+=num;
      }    
      return total-total_sum;  
    }
}