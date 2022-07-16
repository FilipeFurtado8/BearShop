package acadamy.mindswap;


public class CrankyBear extends Bear {

    public CrankyBear(int battery) {
        super(battery);

    }


    public void startSinging() {
        //talk();
        int initialBattery = 6;
        if(battery > (initialBattery/2)) {
            talk();


        }
            if (battery <= (initialBattery / 2)) {

                System.out.println("All by myyyyyself!");
                decreasingBattery();


            }

            /*if(battery < (initialBattery/2)){
                loseAbilityToTalk();
                System.out.println("");
            }
            if(battery == 0){
                System.out.println("no battery");*/

            }
    }










