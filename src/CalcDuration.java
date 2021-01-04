public class CalcDuration {

    String correctPin;
    MemoryCompare memoryCompare;

    public CalcDuration(String correctPin) {
        this.correctPin = correctPin;
        this.memoryCompare = new MemoryCompare();
    }

    public long calcDuration(String value){

        //get start time
        long startTime = System.nanoTime();
        //run function
        this.memoryCompare.compare(value,  correctPin);
        //get end time
        long endTime = System.nanoTime();

        //calculate duration
        long duration = (endTime - startTime);
        return duration;
    }
}
