public class P4Q5 {


    public static void printInReverse(String[] stringArray) {
        int Counter = stringArray.length-1;
        for (int i=Counter; i>=0; i--) {
            System.out.println(stringArray[i]+" ");
        }
        return;
    }

    public static void main(String[] args) {
        String [] WeekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        printInReverse(WeekDays);
    }
}

