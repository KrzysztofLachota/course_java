public class P4Q4 {

    public static int yearsTilOneMillion(double initialBalance) {
        int years = 0;
        double border = 1000000;
        double balance = initialBalance;
        while (balance < border) {
            balance *= 1.05;
            years++;
        }
        return years;
    }

    public static void main(String[] args) {
        int years = yearsTilOneMillion(10000);
        System.out.println(years);
    }
}
