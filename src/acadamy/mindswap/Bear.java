package acadamy.mindswap;

import static acadamy.mindswap.Print.LOVE_YOU;

public class Bear {

    //private static final int INITIAL_BATTERY =
    public int battery = 5;


    public Bear(int battery) {
    this.battery=battery;
    }

    public boolean talk() {
        if (battery > 0) {
            Print.message(LOVE_YOU);
            --battery;
            return true;
        } else Print.message("No battery!");
        return false;
    }


    public void decreasingBattery(){

        if(battery > 0){
            //talk();
            --battery;

        }  //else System.out.println("No battery!");
    }
}
