public class ProxyBankAccount implements BankAccount{
    private RealBankAccount realBankAccount;
    String userNameProxy;

    public ProxyBankAccount(String username){
        this.userNameProxy = username;
    }

    @Override
    public void showAccountDetails(String user) {
        if(realBankAccount== null){
            realBankAccount = new RealBankAccount(user);
            System.out.println(user+" Creating account  for the First time");
        }
        realBankAccount.showAccountDetails(user);
    }
}
