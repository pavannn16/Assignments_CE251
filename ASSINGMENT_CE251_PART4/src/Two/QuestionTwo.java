package Two;

public class QuestionTwo {
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside function fun(). ");
        throw new IllegalAccessException("test");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Caught in Catch with Exception : " + e);
        }
    }
}
