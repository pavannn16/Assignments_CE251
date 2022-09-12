package Three;

public class QuestionThree {
    public static void main(String[] args) {
        System.out.println("Name:Pavan Chauhan");
        System.out.println("ID:21CE018");
        try {
            System.out.println("1st Try Block");
            System.out.println(10/0);
            int[] arr= new int[4];
            int i = arr[4];
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("In Finally Block");
        }
    }
}
