public class P0Q8 {

    public static int singleRoll(){
        int result = (int) (Math.random() * 6);
        return (result+1);
    }
    public static int monopolyRoll(){
        int res1 = singleRoll();
        int res2 = singleRoll();
        int sum = res1+res2;
        if (res1 == res2) {
            res1 = singleRoll();
            res2 = singleRoll();
            sum += res1+res2;
        }
        System.out.println(sum);
        return(sum);
    }
    public static void main(String[] args) {
        //System.out.println("Hello world !");
        monopolyRoll();
    }
}
