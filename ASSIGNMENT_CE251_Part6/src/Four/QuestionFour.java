package Four;


class TestPriority extends Thread//TestPriority class extends Thread class
{
    public void run()
    {
        System.out.println("Running Thread is: "+Thread.currentThread().getName());//Printing Current Thread Name
        System.out.println("Priority of Running Thread is: "+Thread.currentThread().getPriority());//Printing the Priority of the current Thread
    }


}


public class QuestionFour
{
    public static void main(String[] args)
    {
        TestPriority t1=new TestPriority();//Creating a Thread t1
        TestPriority t2=new TestPriority();//Creating a Thread t2
        TestPriority t3=new TestPriority();//Creating a Thread t3
        t1.setPriority(3);//Setting Priority for all the Threads
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(7);
        t1.start();//Executing Thread t1
        t2.start();//Executing Thread t2
        t3.start();//Executing Thread t2
        System.out.println("21CE018:Pavan Chauhan");


    }
}


