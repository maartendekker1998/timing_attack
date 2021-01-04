import java.util.concurrent.TimeUnit;

public class MemoryCompare{

    public boolean compare(String inputPin, String correctPin){

        boolean pinCorrect = true;

        for (int i = 0; i < 4;){
            if(inputPin.charAt(i) != correctPin.charAt(i)){
                pinCorrect = false;
                break;
            }
            else{
                try {
                    TimeUnit.NANOSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
        return pinCorrect;
    }
}


//                try {
//                        TimeUnit.NANOSECONDS.sleep(1);
//                        } catch (InterruptedException e) {
//                        e.printStackTrace();
//                        }
