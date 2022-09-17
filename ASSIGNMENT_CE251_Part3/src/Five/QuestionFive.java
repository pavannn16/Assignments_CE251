package Five;
package Mypack;
public class QuestionFive
{
    public void method(){
        System.out.println("Method from class Demo from Mypack             package");
    }
}

import Mypack.pr5;
public class pr5_main {
    public static void main(String[] args) {
        pr5 obj = new pr5();
        obj.method();
    }
}
