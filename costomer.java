package challange2;

public class costomer {

    public static void main(String[] args) {
        bankAccount account = new bankAccount("001", "kartik gupta ");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);

    }

}
