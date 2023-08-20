import java.util.Scanner;

public class main {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Total Bill Amount : ");
        double totalAmount = input.nextDouble();
        PaymentStratergy creditCard = new CreditCardPayment("123456789","user1",123);
        System.out.println("Enter the Total Points amount you have");
        double userPoints = input.nextDouble();
        PaymentStratergy points = new PointsMethod(userPoints);

        System.out.println("Enter the amount you want to pay using Credit Credit card");
        double amountThroughCreditCard = input.nextDouble();
        creditCard.pay(amountThroughCreditCard);

        double balance = totalAmount-amountThroughCreditCard;
        if(balance>0){
            points.pay(balance);
        }
    }
}
