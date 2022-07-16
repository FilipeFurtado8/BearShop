package acadamy.mindswap;

public class Shop {

    public SimpleBear simpleBear;
    public CrankyBear crankyBear;
    public DrunkBear drunkBear;
    private static int numberOfBears;

    public Shop() {
        this.numberOfBears = numberOfBears;
    }

    public void producingBears() {

        if (getNumberOfBears() % 2 == 0) {
            SimpleBear simpleBear = new SimpleBear(6);
            this.simpleBear = simpleBear;
            numberOfBears++;
            System.out.println("simpleBear");
        }

        else if (getNumberOfBears() % 5 == 0) {
            CrankyBear crankyBear = new CrankyBear(6);
            this.crankyBear = crankyBear;
            numberOfBears++;
            System.out.println("crankyBear");

        } else {

            DrunkBear drunkBear = new DrunkBear(6);
            this.drunkBear = drunkBear;
            numberOfBears++;
            System.out.println("drunkBear");

        }
    }








    public static int getNumberOfBears() {
        //System.out.println(numberOfBears);
        return numberOfBears;
    }

}
