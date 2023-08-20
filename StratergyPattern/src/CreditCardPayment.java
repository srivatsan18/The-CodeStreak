import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class CreditCardPayment implements PaymentStratergy{
    String cardNumber;
    String cardHolderName;
    int cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName,int cvv){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv= cvv;
        System.out.println("Credit card Payment added");
    }

    @Override
    public void pay(double amount) {
        if(amount!=0){
            System.out.println("Amount Remaining to Pay is : " + amount);
            System.out.println("Paying through credit card "+ cardNumber);
        }
        else {
            System.out.println("All Dues are paid!!");
            log.println("Trying to pay for 0!! Invalid operation");
        }
    }
}
