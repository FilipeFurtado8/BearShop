package acadamy.mindswap;

import java.util.Random;

public class DrunkBear extends Bear {


    public DrunkBear(int battery) {
        super(battery);
    }

    public void snoring() {
        Random random = new Random();

        boolean probabilityToTalk = random.nextInt(1, 101) <= 20;
        if (battery >= 0) {

            if (probabilityToTalk) {

                System.out.println("Snore ZzZzZzZz!");
                decreasingBattery();
                return;



            }  else talk();


        }

    }

}
