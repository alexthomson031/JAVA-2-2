public class Main {
    public static void main(String[] args) {
        int s  = 1000; // Счет на телефоне
        System.out.println("Счет на телефоне до пополнения " + s);
        int sp = 5000; // Cумма пополнения
        System.out.println("Cумма пополнения " + sp);
        if ( sp >= 1000 ){
            float b = (float) (sp * 0.01); // Сумма бонусов
            System.out.println( "Сумма бонусов при пополнении " + b);
            int fs = (int) (s + sp + b); // Сумма на счете, вместе с бонусами
            System.out.println("Итоговая сумма на счете с бонусами " + fs);
        } else {
            float b = (float) (sp * 0); // Сумма бонусов
            System.out.println( "Сумма бонусов при пополнении " + b);
            int fs = (int) (s + sp + b); // Сумма на счете, вместе с бонусами
            System.out.println("Итоговая сумма на счете с бонусами " + fs);
        }





        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
