import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountChars {

    public void dotCounter()throws FileNotFoundException {
        Scanner input = new Scanner( new File( "text.txt" ) );
        int count = 0;
        char someChar = ',';

        while (input.hasNextLine()) {
            String answer = input.nextLine();
            answer = answer.toLowerCase();

            for (int i=0; i < answer.length(); i++) {
                if (answer.charAt(i) == someChar) {
                    count++;
                }
            }


        }

        System.out.println(", - " + count);
    }
    public void quoteCounter()throws FileNotFoundException {
        Scanner input = new Scanner( new File( "text.txt" ) );
        int count = 0;
        char someChar = '.';

        while (input.hasNextLine()) {
            String answer = input.nextLine();
            answer = answer.toLowerCase();

            for (int i=0; i < answer.length(); i++) {
                if (answer.charAt(i) == someChar) {
                    count++;
                }
            }


        }

        System.out.println(". - " + count);
    }
    public void HCounter()throws FileNotFoundException {
        Scanner input = new Scanner( new File( "text.txt" ) );
        int count = 0;
        char someChar = 'h';

        while (input.hasNextLine()) {
            String answer = input.nextLine();
            answer = answer.toLowerCase();

            for (int i=0; i < answer.length(); i++) {
                if (answer.charAt(i) == someChar) {
                    count++;
                }
            }


        }

        System.out.println("h - " + count);
    }



}
