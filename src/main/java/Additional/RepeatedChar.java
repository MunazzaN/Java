package Additional;
import java.util.Arrays;
import java.util.HashSet;

public class RepeatedChar {
    public String findRepeatedChar(String string){
        string=string.toLowerCase();
        char[] charArray=string.toCharArray();
        HashSet<Character> result=new HashSet<>();
        for(char c : charArray){
            if(!result.add(c))
                result.add(c);
        }
        return result.toString();
    }

}
