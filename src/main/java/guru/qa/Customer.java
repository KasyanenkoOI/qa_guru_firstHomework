package guru.qa;

import java.sql.SQLOutput;

public class Customer {
    String firstName;
    String lastName;
    double sumCurrent; // сумма текущей покупки
    double sumOverall; // сумма покупок за весь период
    int lvlCashback;
    double allSum;
    public Customer(String firstName, String lastName, double sumCurrent, double sumOverall) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sumCurrent = sumCurrent;
        this.sumOverall = sumOverall;

    }
    //Вывод текущего уровня лояльности
    public void checkLvlCashback() {
        allSum = sumCurrent + sumOverall;
        String nameLvlCashback = null;
        if (allSum < 5000.00) {
            lvlCashback = 1;
            nameLvlCashback = "Бронза";
        } else if (allSum >= 5000 & allSum < 15000){
            lvlCashback = 2;
            nameLvlCashback = "Серебро";
        } else if (allSum >= 15000.00 ){
            lvlCashback = 3;
            nameLvlCashback = "Золото";
        }
        System.out.println(lastName + " " + firstName + ", ваш текущий уровень лояльности: " + nameLvlCashback);

    }

    //  Рассчет суммы кэшбека с текущей покупки
    public void checkCashback(){
        double sumCashback = 0.00;

        if ( lvlCashback == 1 ) {
            sumCashback = sumCurrent * 0.02;
        } else if (lvlCashback == 2) {
            sumCashback = sumCurrent * 0.05;
        } else if (lvlCashback == 3){
            sumCashback = sumCurrent * 0.1;
        }
        System.out.println("За текущую покупку будет начислен кэшбек " + Math.round(sumCashback) + " руб.");
    }

    //  Рассчет суммы для перехода на след. уровень лояльности
    public void checkSumNextLvl(){
        double sumNextLvl;
        allSum = sumCurrent + sumOverall;
        if (allSum < 5000) {
            sumNextLvl= 5000 - allSum;
            System.out.println("Необходимо еще купить на " + Math.ceil(sumNextLvl) + " руб. для перехода на след. уровень лояльности");
        } else if (allSum >= 5000 & allSum < 15000){
            sumNextLvl= 15000 - allSum;
            System.out.println("Необходимо еще купить на " + Math.ceil(sumNextLvl) + " руб. для перехода на след. уровень лояльности");
        } else {
            System.out.println("У вас максимальный уровень лояльности");
        }



    }
}
