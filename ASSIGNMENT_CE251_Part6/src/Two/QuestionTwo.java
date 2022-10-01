package Two;

import java.util.stream.IntStream;
import java.util.*;
class TestEven extends Thread//TestEven class extends Thread class
{
    int arr[]=new int[15];//Intializing an array arr
    TestEven(int arr1[])
    {
        this.arr=arr1;
    }
    public void run()//Creating a Thread t1
    {
        for(int i=0;i<15;i=i+1)//Determining if the element is even
        {
            if(arr[i]%2==0)
            {
                System.out.println("This is an Even Element: "+arr[i]);
            }
        }
    }
}
class TestOdd extends Thread//TestOdd class extends Thread class
{
    int arr[]=new int[15];//Intializing an array arr
    TestOdd(int arr1[])
    {
        this.arr=arr1;
    }
    public void run()//Creating a Thread t1
    {
        for (int i = 0; i < 15; i = i + 1)//Determining if the element is odd
        {
            if(arr[i]%2!=0)
            {
                System.out.println("This is an Odd Element: "+arr[i]);
            }
        }


    }
}
public class QuestionTwo
{
    public static void main(String[] args)
    {
        int[]  randomIntsArray = IntStream.generate(() -> new Random().nextInt(15)).limit(100).toArray();//Generating a random Integer Array of size 15 and limiit 100
        TestEven t1=new TestEven(randomIntsArray);//Creating a Thread t1
        TestOdd t2=new TestOdd(randomIntsArray);//Creating a Thread t2
        t1.start();//Executing Thread t1
        t2.start();//Executing Thread t2
        System.out.println("21CE018-Pavan");


    }
}


