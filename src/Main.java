public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount = 2000;
        int amountRubles = 100;

        int bonus;
        int grandTotal;

        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / amountRubles);
            grandTotal = initialAccount + replenishmentAmount + bonus;
        } else {
            bonus = 0;
            grandTotal = initialAccount + replenishmentAmount;
        }

        System.out.println("Итоговый счет: " + grandTotal);
        System.out.println("Бонусов: " + bonus);
    }
}
