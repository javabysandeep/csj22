package oops.inheritance;

public class Loan {
    private int customerLoadId;
    int loanId;
    String accountHolderName;
    int amount;
    int rateOfInterest;
    int duration;

    void calculateEmi() {
        System.out.println("Loan acount emi calc");
    }

}
