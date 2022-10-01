package Five;


class Wait extends Thread//wait class extends Thread class
{
    int sal=0;//Initializing the salary to 0
    public void run()
    {

        synchronized (this)//synchronized block
        {
            for(int i=0;i<12;i=i+1)//Incrementing salary for each month
            {
                sal=sal+10000;
            }
            this.notify();   //Waking up the user Thread or main Thread
        }

    }

}
public class QuestionFive
{
    public static void main(String[] args) {
        Wait w=new Wait();//Creating a Thread w
        Wait w1=new Wait();//Creating a Thread w1
        Wait w2=new Wait();//Creating a Thread w2
        w.setPriority(3);//Setting Priority for all the Threads
        w1.setPriority(Thread.NORM_PRIORITY);
        w2.setPriority(7);
        w.start();//Executing Thread w
        w1.start();//Executing Thread w1
        w2.start();//Executing Thread w2
        try//try block
        {
            synchronized (w) {
                w.wait(1000);//putting the main thread in waiting state for 1s
            }
            synchronized (w1)
            {
                w1.wait(2000);//putting the main thread in waiting state for 2s
            }
            System.out.println("Total Salary of first employee="+w.sal);//Printing salaries of all employees
            System.out.println("Total Salary of second employee="+w1.sal);
            System.out.println("Total Salary of third employee="+w2.sal);
            System.out.println("21CE018:Pavan Chauhan");
        }
        catch(InterruptedException e)//catch block
        {
            System.out.println(e);
        }
    }
}


