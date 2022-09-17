package Four;
import javax.sound.sampled.SourceDataLine;
interface test{
    int fun(int a,int b);
}
class pr4 implements test{
    public int fun(int a,int b)
    {
        return a*b;
    }
}
public class QuestionFour {
    public static void main(String[] args) {
        pr4 obj = new pr4();
        System.out.println(obj.fun(1,2));
        System.out.println(obj.fun(3,4));
    }

}
