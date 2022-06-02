package Game1;

public class team1 {

    private String name;
    private String gun;
    private int strength = 200;

    team1() {
    }

    public void energybooster() {
        if (this.strength <= 0) {
            this.strength = 0;
            System.out.println("player has died strength cannot inhance");
        } else {
            this.strength += 15;
            if (this.strength > 200) {
                this.strength = 200;
                System.out.println("strength cannot increase more than 200");
                System.out.println("current strength" + this.strength);
            }
        }
    }

    public void damageByGun1() {
        this.strength -= 30;
        if (this.strength <= 0) {
            this.strength = 0;
            System.out.println("Player killed by gun1");
        } else {
            System.out.println("Player got hit by gun1 . its strength reduced by 30");
            System.out.println("Current strength is " + this.strength);
        }
    }

    public void damageByGun2() {
        this.strength -= 60;
        if (this.strength <= 0) {
            this.strength = 0;
            System.out.println("Player killed by gun2");
        }

        else {
            System.out.println("Player got hit by gun2 . its strength reduced by 60");
            System.out.println("Current strength is " + this.strength);
        }
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setgun(String gun) {
        this.gun = gun;
    }

    public String getgun() {
        return this.gun;
    }

    public void setstrength(int strength) {
        this.strength = strength;
    }

    public int getstrength() {
        return strength;
    }

}
