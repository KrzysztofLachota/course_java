/**
 * Guess the Movie program
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
    
public class P5Q4 {
    public static void main(String[] args) {
        boolean debug = false;
        boolean NotYetGuessed = true;
        int liczbaProb = 10;
        String fileName = "movies.txt";
        ArrayList<String> Movies = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String WylosowanyTytul;
        String ZakodowanyTytul="";
        char[] CodedTitle;

        try {
        File fileHandle = new File(fileName);
        Scanner fileContent = new Scanner(fileHandle);
        while (fileContent.hasNextLine()) {
            String bufor = fileContent.nextLine();
            Movies.add(bufor);
            if(debug) System.out.println(bufor);
        }
        fileContent.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Nie znaleziono pliku" + fileName);
            
        }
        int size = Movies.size();
        if(debug) System.out.println("Liczba filmów : " + size);
        int losowy = (int) (Math.random()*size);
        WylosowanyTytul = Movies.get(losowy);
        if(debug) System.out.println("Wyolosowałem film nr " + losowy + " zatytułowany : " + WylosowanyTytul);
        int len = WylosowanyTytul.length();
        System.out.println("Tytuł wylosowanego filmu ma " + len + " znaków");
        for(int i=0; i<len; i++) {
            if(WylosowanyTytul.charAt(i) == ' ') ZakodowanyTytul = ZakodowanyTytul.concat(" ");
            else ZakodowanyTytul = ZakodowanyTytul.concat("_");
        }
        CodedTitle = ZakodowanyTytul.toCharArray();

        System.out.println(CodedTitle);

        while (liczbaProb >0 && NotYetGuessed) {
            System.out.println("Spróbuj zgadnąć jedną z liter znajdujących się w tytule filmu. Masz jeszcze " + liczbaProb + " szans/szanse");
            //System.out.println("Odgadywany tytuł filmu : " + ZakodowanyTytul);
            
            char litera = scanner.next().charAt(0);
            int poz = WylosowanyTytul.indexOf(litera,0);
            if(poz < 0) System.out.println("Niestety, znak " + litera + " nie występuje w tytule filmu. Liczba pozostałych szans : " + --liczbaProb);
            else 
            {   while(poz >=0) 
                {
                    if(debug) System.out.println("Wskazany znak występuje na pozycji : " + WylosowanyTytul.indexOf(litera,0));
                    CodedTitle[poz]=litera;
                    poz = WylosowanyTytul.indexOf(litera, ++poz);
                }
            }

            System.out.print("Odgadywany tytuł filmu : ");
            System.out.println(CodedTitle);
            NotYetGuessed = false;
            for(int i=0; i<len; i++)
                if(CodedTitle[i]=='_') NotYetGuessed = true;
        }

        scanner.close();
        if(NotYetGuessed) System.out.println("Niestety nie zgadłeś. Co za szkoda");
        else System.out.println("No brawo! Odgadłeś tytuł zachowując jeszcze " + liczbaProb + " szanse");
    }
}
