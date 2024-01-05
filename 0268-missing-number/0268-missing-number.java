class Solution {
    public int missingNumber(int[] nums) {
      for(int j=0;j<nums.length+1;j++){
          int index=-1;
          for(int i=0;i<nums.length;i++){
              if(nums[i]==j){
                  index=i;
                  break;
              }
          }
          if(index==-1){
              return j;
          }
      }
        return -1;
    }
}