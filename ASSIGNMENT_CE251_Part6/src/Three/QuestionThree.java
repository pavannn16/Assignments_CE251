package Three;


class Test extends Thread//Test class extends Thread class
{
    int i=0;
    public void run()//Creating a Thread t1
    {
        try//try block
        {
            Thread.sleep(1000);//Calling sleep() method
            System.out.println("Value of i after sleep() method is executed: "+(i+1));
        }
        catch(InterruptedException e)//catch block
        {
            System.out.println("Interrupted Exception");
        }
    }
}
public class QuestionThree
{
    public static void main(String[] args)
    {
        Test t=new Test();//Creating a Thread t
        t.start();//Executing Thread t
        System.out.println("In main method");
        System.out.println("21CE018:Pavan Chauhan");

    }
}



