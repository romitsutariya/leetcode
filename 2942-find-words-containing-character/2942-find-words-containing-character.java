import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result=new ArrayList();
        int index=-1;
        for(String word : words){
            ++index;
            if(word.indexOf(x)==-1){
                continue;
            }
            result.add(index);
            
        }
        return result;
    }
}