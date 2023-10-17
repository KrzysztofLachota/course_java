public class P4Q8 {
    public static int singleRoll(){
        int result = (int) (Math.random() * 6);
        return (result+1);
    }
    public static int monopolyRoll(){
        int res1 = singleRoll();
        int res2 = singleRoll();
        int sum = res1+res2;
        int limit = 3;
        String msg = "1 roll - sum=";
        while (res1 == res2) {
            if(--limit == 0) return(-1);
            res1 = singleRoll();
            res2 = singleRoll();
            sum += res1+res2;
            msg = 4-limit+" rolls - sum=";
        }
        msg += sum;
        System.out.println(msg);
        return(sum);
    }
    public static void main(String[] args) {
        int res=0;
        int secLimit=0;
        while(res>=0 && ++secLimit<=10000) {
            monopolyRoll();
        }
    }

}
