package oops.inheritance;

public class PersonalLoan extends Loan{
    void m1(){
        System.out.println(loanId);
        System.out.println(accountHolderName);
        System.out.println(amount);
        System.out.println(duration);
        System.out.println(rateOfInterest);
    }
}
