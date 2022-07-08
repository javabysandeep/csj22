package exceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(10/0);

        String str = null;
        System.out.println(str.length());

        int[] array = {1,2,3};
        System.out.println(array[3]);

        Dummy dummy = new Dummy();
       /* System.out.println(dummy.instancevar);//NoSuchFieldException
        System.out.println(dummy.dummyValue);//IllegalAccessException
        dummy.m1();//IllegalAccessException
        dummy.m2();//NoSuchMethodException*/


        //CyberSuccess cyberSuccess = new CyberSuccess();//ClassNotFoundException

       // I1 i1 = new I1();//InstantiationException

        //AC ac = new AC();//InstantiationException
    }
}
class Dummy{
    private int dummyValue=100;
    private void m1(){}
}
interface  I1{}
abstract class AC{}