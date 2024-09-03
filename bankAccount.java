package challange2;

 class bankAccount {
     private String accountNumber;
     private String accountHolderName;
     private double balance;

     public void depositMoney(double money){
         if(money<= 0){
             System.out.println("Invalid deposit");
         }else {
             balance += money;
         }
     }

     public bankAccount(String accountNumber, String accountHolderName) {
         this.accountNumber = accountNumber;
         this.accountHolderName = accountHolderName;

     }

     public double withdrawMoney(double money){
         if( balance >=money) {
             System.out.println("Invalid withdraw");
         }
         else if(balance>= money){
             balance -= money;
         }else{
             money= balance;
             balance=0;
         }
         return  money;
     }
}

