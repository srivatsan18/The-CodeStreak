import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class PointsMethod implements PaymentStratergy{
    double points;
    double balancePoints;

    public  PointsMethod(double points){
        this.points = points;
        System.out.println("Points payment method added");
    }

    @Override
    public void pay(double amount) {
        if(points>amount){
            System.out.println("Amount Remaining to Pay is : " + amount);
            System.out.println("Paying through Points "+ amount);
            balancePoints = points - amount;
            System.out.println("Remaining points : " + balancePoints);
        }
        else {
            System.out.println("Cannot complete the payment");
            log.println(
                    "Payment failure found in points :"+ paymentFailures+1
            );
        }

    }
}
