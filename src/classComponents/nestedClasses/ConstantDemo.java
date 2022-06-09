package classComponents.nestedClasses;

public class ConstantDemo {
    public static void main(String[] args) {
        System.out.println("Oracle pass "+ Constants.Oracle.Prod.password);
        System.out.println("Oracle Dev username "+ Constants.Oracle.Dev.username);
        System.out.println("MySql Username "+ Constants.MySql.password);

        class LocalInnerClass{
            int variable = 30;
            void local(){
                System.out.println("Local inner class non-static method");
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        System.out.println(localInnerClass.variable);
        localInnerClass.local();
    }
}
