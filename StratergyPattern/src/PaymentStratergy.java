public interface PaymentStratergy {

    void pay(double amount);
    long paymentFailures =0;
}
