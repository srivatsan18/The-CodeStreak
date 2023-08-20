public class main {
    public static void main(String [] args){
        BankAccount bankAccount1 = new ProxyBankAccount("User1");
        BankAccount bankAccount2 = new ProxyBankAccount("User2");

        bankAccount1.showAccountDetails("User1");
        bankAccount2.showAccountDetails("User2");
        bankAccount1.showAccountDetails("User1");
        bankAccount2.showAccountDetails("USEr3");
    }
}
