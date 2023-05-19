public class Main {
    public static void main(String[] args) {

        int summAccaunt = 200; //начальный счёт
        int summReplenishment = 1_001; //сумма пополнения
        int bonus; //бонусы
        int result; // итоговая сумма

        if (summReplenishment > 1_000) {
            bonus = summReplenishment / 100; //рассчитываете сумму бонуса
        } else {
            bonus = 0;
        }
        result = summReplenishment + summAccaunt + bonus;
        System.out.println("Баланс - " + result);

    }
}