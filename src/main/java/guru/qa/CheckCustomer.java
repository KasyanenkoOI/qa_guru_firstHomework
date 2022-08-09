package guru.qa;

public class CheckCustomer {
    public static void main(String[] args){
        Customer firstCustomer = new Customer("Ivan", "Ivanov", 1500, 5000);

        firstCustomer.checkLvlCashback();
        firstCustomer.checkCashback();
        firstCustomer.checkSumNextLvl();



    }


}
