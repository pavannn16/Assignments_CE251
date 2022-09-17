package Seven;
interface A
{
    public void Details();
    default void Address()
    {
        System.out.println("Address :-\n'Haridarshan App.', Block No.-604,\nHari Om Nagar,\nZanzarda Road,\nJunagadh - 362001.");
    }
}
public class pr7 implements A {
    public void Details() {
        System.out.println("Details:-");
        System.out.println("Name : Pavan Chauhan");
        System.out.println("ID No. : 21CE018");
        System.out.println("College name : CSPIT");
        System.out.println("Branch : Computer Engineering");
        System.out.println("Current Sem. : 3");
    }

    public class pr7_main {
        public static void main(String[] args) {
            pr7 p1 = new pr7();
            p1.Details();
            p1.Address();
        }
    }
}
