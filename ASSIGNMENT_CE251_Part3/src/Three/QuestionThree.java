package Three;
interface p{
    final int p=100;
    void show1();
}
interface p1 extends p{
    final int p1=200;
    void show2();
}
interface p2 extends p{
    final int p2=300;
    void show3();
}
interface p12 extends p1,p2{
    final int p12=400;
    void show4();
}
class pr3 implements p12 {
    @Override
    public void show1() {
        System.out.println(p);
    }
    @Override
    public void show2() {
        System.out.println(p1);
    }
    @Override
    public void show3() {
        System.out.println(p2);
    }
    @Override
    public void show4() {
        System.out.println(p12);
    }
}
public class QuestionThree {
    public static void main(String[] args) {
        pr3 obj=new pr3();
        obj.show1();
        obj.show2();
        obj.show3();
        obj.show4();
    }
}
