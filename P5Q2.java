import java.util.Scanner;

/**
 * Excercise showing how to get user input from the stdin
 * Application generates random number from the range 1 to 100 and then user gets 7 chances to guess this number
 */


public class P5Q2 {

    public static void main(String[] args) {
        int maxLiczbaProb = 7;
        int randomNumber = (int) (Math.random() * 100) + 1;
        String result = "";
        int ktoraProba=1;

        System.out.println("System wygenerował liczbę całkowitą z zakresu od 1 do 100. Spróbuj ją odgadnąć. Masz 7 szans");
        Scanner scanner = new Scanner(System.in);

        for (int numerProby=1; numerProby <= maxLiczbaProb; numerProby++){
            System.out.println("Twoja "+ numerProby + " próba : ");
            int guess = scanner.nextInt();
            if(guess == randomNumber) {
                System.out.println("Brawo - chodziło właśnie o liczbę " + guess + ". Trafiłeś za " + numerProby + " razem.");
                break;
            }
            if(guess > randomNumber) result = " jest za duża";
            else result = " jest za mała";
            System.out.println("Niestety, liczba " + guess + result);
            ktoraProba = numerProby;

            }
        scanner.close();
        if(ktoraProba == maxLiczbaProb) System.out.println("Niestety - mimo " + maxLiczbaProb + " prób - nie udało Ci się odgadnąć szukanej liczby. Chodziło o liczbę " + randomNumber);
    }
    
}
