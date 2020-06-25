public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Indian Bank");
        bank.addBranch("IC IC");

        bank.addCustomer("IC IC","Easa",100.00);
        bank.addCustomer("IC IC","Abrar", 120.00);
        bank.addCustomer("IC IC","Ansari",200.00);

        bank.addBranch("IOB");
        bank.addCustomer("IOB","MSL",200.0);

        bank.addCustomerTransaction("IC IC","Easa",20);
        bank.addCustomerTransaction("IC IC","Easa",50);
        bank.addCustomerTransaction("IC IC","Ansari",100);

        bank.listCustomers("IC IC",true);
        //bank.listCustomers("IOB", true);

    }
}
