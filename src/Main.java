import java.util.Scanner;

public class Main {

    //these are the four different value arrays that will be appended to the pin that is used by to algorithm to calculate the runtime
    private static String[] values4 = {"lazy","0000","1111","2222","3333","4444","5555","6666","7777","8888","9999"};
    private static String[] values3 = {"lazy","000","111","222","333","444","555","666","777","888","999"};
    private static String[] values2 = {"lazy","00","11","22","33","44","55","66","77","88","99"};
    private static String[] values1 = {"lazy","0","1","2","3","4","5","6","7","8","9"};


    public static void main(String[] args) {

        //this is the pincode that the timing attack algorithm will crack
        String correctPin = "";

        Scanner scanner = new Scanner(System.in);
        //ask the user to set a PIN that the algorithm will crack
        System.out.print("Please enter a 4 digit PIN, the timing-attack algorithm will crack it : ");
        correctPin = scanner.next();

        TimingAttackAlgorithm timingAttackAlgorithm = new TimingAttackAlgorithm(new CalcDuration(correctPin));


        //add the value arrays to an 2D array so that the crackPin method can be called with a nice clean for loop.
        String[][] values = {values4, values3, values2, values1};
        for (int i = 0; i < 4; i++){
            timingAttackAlgorithm.crackPin(values[i], i);
        }
    }
}

