package oops.inheritance;

public class SingleLevel {
    public static void main(String[] args) {
        PersonalLoan personalLoan = new PersonalLoan();
        System.out.println(personalLoan.loanId);
        System.out.println(personalLoan.accountHolderName);
        System.out.println(personalLoan.amount);
        System.out.println(personalLoan.duration);
        System.out.println(personalLoan.rateOfInterest);
        System.out.println("calling m1 method");
        personalLoan.m1();
    }
}
