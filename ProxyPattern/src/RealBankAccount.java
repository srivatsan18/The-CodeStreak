import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class RealBankAccount implements  BankAccount{

    String userName;

    public RealBankAccount (String userName){
        this.userName = userName;
    }

    @Override
    public void showAccountDetails(String user) {
        if(user.equals(userName)){
            System.out.println("Showing the Bank Account Details of "+ userName);
        } else {
            System.out.println("Wrong credintials!!!");
            log.println("Wrong user credintials!! Records not found");
        }
    }
}
