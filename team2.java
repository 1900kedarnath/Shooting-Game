package Game1;

public class team2 extends team1 {
    private boolean armour;
    private int strength = 200;

    team2() {
    }

    @Override
    public void energybooster() {
        if (this.strength <= 0) {
            System.out.println("player has died strength cannot increase");
        } else {
            this.strength += 30;
            if (this.strength > 200) {
                this.strength = 200;
                System.out.println("strength cannot increase more than 200");
            }
            System.out.println("current strength" + this.strength);
        }
    }

    @Override
    public void damageByGun1() {
        if (armour) {
            this.strength -= 20;
            if (this.strength <= 0) {
                this.strength = 0;
                System.out.println("player has been died by gun1");
            } else
                System.out.println("player got hit by gun1. its current strength" + this.strength);
        }

        else {
            this.strength -= 30;
            if (this.strength <= 0) {
                this.strength = 0;
                System.out.println("player has been died by gun1");
            } else
                System.out.println("player got hit by gun1. its current strength" + this.strength);
        }
    }

    @Override
    public void damageByGun2() {
        if (armour) {
            this.strength -= 40;
            if (this.strength <= 0) {
                this.strength = 0;
                System.out.println("Player killed by gun2");
            } else {
                System.out.println("Player got hit by gun2 . its strength reduced by 40");
                System.out.println("Current strength is " + this.strength);
            }
        }

        else {
            this.strength -= 60;
            if (this.strength <= 0) {
                this.strength = 0;
                System.out.println("Player killed by gun2");
            } else {
                System.out.println("Player got hit by gun2 . its strength reduced by 60");
                System.out.println("Current strength is " + this.strength);
            }
        }
    }

    public void setarmour(Boolean value) {
        this.armour = value;
    }
}
