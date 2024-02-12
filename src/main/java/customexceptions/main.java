package customexceptions;
public class main {

    BankAccount bankAccount=new BankAccount(1000);

    public String CallSuccessWithdrawals(){

        //Successful withdrawal
        try {
            BankAccount.withdraw(500);
            return "Successful Withdrawal";
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            return e.getMessage();
        }
    }


    public String CallInsufficientFundsException() {
        try {
            BankAccount.withdraw(1500);
            return "Successful Withdrawal";
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            return e.getMessage();

        }
    }






    public String CallInvalidWithdrawalException(){
        try {
            BankAccount.withdraw(-500);
            return "Successful Withdrawal";

        } catch (InsufficientFundsException | InvalidWithdrawalException  e) {
            return e.getMessage();
        }
    }

}
