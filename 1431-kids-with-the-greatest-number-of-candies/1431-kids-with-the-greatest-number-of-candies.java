class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList=new ArrayList<>();
        int gretest=0;
        for(int i:candies){
            if(i>gretest)
                gretest=i;
        }
        
        for(int i:candies){
            if((i+extraCandies)>=gretest)
                resultList.add(true);
            else
                resultList.add(false);
        }
        return resultList;
    }
}