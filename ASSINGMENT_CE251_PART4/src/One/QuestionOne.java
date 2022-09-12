package One;

public class QuestionOne {
    public static void main(String[] args) {
        System.out.println("Name:Pavan Chauhan");
        System.out.println("ID:21CE018");
        try {
            System.out.println("1st Try Block");
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
        try {
            System.out.println("2nd Try Block");
            int[] arr= new int[4];
            int i = arr[4];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("3rd Try Block");
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("4th Try Block");
            throw new IllegalAccessException("demo");
        }
        catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
