package One;

class Demo2 implements Runnable//Demo1 class implements Runnable Interface
{
    public void run()//Defining method run()
    {
        System.out.println("Hello World using Runnable Interface");//Printing Hello World
    }

}

public class QuestionOneB
{
    public static void main(String[] args) {
        Thread obj=new Thread(new Demo2());//Creating Thread obj
        obj.start();//Executing the Thread
        System.out.println("Hello World from main Thread");
        System.out.println("21CE018:Pavan Chauhan");

    }
}

