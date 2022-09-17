package Two;
import java.util.*;

interface IPrinter
{
    default void P_Show()
    {
        System.out.println("Default Method Called from IPrinter");
    }
}
interface IScanner
{
    default void S_Show()
    {
        System.out.println("Default Method Called from IScanner");
    }
}
class Concrete implements IPrinter,IScanner
{

}
public class QuestionTwo {
    public static void main(String[] args) {
        Vector V = new Vector();
        Concrete C1 = new Concrete();
        Concrete C2 = new Concrete();
        Concrete C3 = new Concrete();
        Concrete C4 = new Concrete();
        Concrete C5 = new Concrete();
        Concrete CC[] = new Concrete[5];
        V.add(C1);
        V.add(C2);
        V.add(C3);
        V.add(C4);
        V.add(C5);
        for(int i=0;i<5;i++) {
            CC[i] = (Concrete) V.get(i);
            //System.out.println(CC[i]);
        }
       for(int i=0;i<5;i++)
        {
            CC[i].P_Show();
            CC[i].S_Show();
        }
    }
}
