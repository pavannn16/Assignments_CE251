package One;


class Demo1 extends Thread//Demo class extends Thread class
{
    public void run()//Defining method run()
    {
        System.out.println("Hello World!!!");//Printing Hello World
    }
}

public class QuestionOneA {

    public static void main(String[] args) {
        Demo1 d=new Demo1();//Creating Thread d
        d.start();//Executing the thread
        System.out.println("Hello World from main Thread");
        System.out.println("21CE018:Pavan Chauhan");

    }


}




