package Six;
package Mypack;
public class pr6
{
    int num;
    public pr6(int num)
    {
        this.num = num;
    }
    @Override
    public String toString() {
        return "pr6 [num=" + num + "]";
    }
}

package Mypack;
public class pr6_1
{
    int num2;
    public pr6_1(int num2) { this.num2 = num2;}
    @Override
    public String toString() {
        return "pr6_2 [num2=" + num2 + "]";
    }
}

import Mypack.pr6;
        import Mypack.pr6_1;
public class QuestionSix
{
    public static void main(String[] args)
    {
        pr6 m1 = new pr6(80);
        pr6_1 m2 = new pr6_1(100);
        System.out.println(m1);
        System.out.println(m2);
    }
}
