public class P4Q2 {
static String [] imiona = {"Ola", "Hildegarda", "Iwona", "Maria", "Karolina"};
    public static int factorial(int n){
        int res = 1;
        for(int i=2; i<=n; i++){
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }
}
