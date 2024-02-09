package Additional;
import org.junit.Test;
public class RepeatedCharTest {
    @Test
    public void testRepeatedChar(){
        String input1="Munazza";
        String expected1="az";
        expected1.equals(input1);
        String input2="Munazza Niazi";
        String expected2="zain";
        expected2.equals(input2);
    }


    @Test
    public void testNoRepeatedChar(){
        String input1="Munaz";
        String expected1="";
        expected1.equals(input1);
    }



    @Test
    public void testNoChar(){
        String input1="";
        String expected1="";
        expected1.equals(input1);



        String input2="         ";
        String expected2="";
        expected2.equals(input2);

    }



}
