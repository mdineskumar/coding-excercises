package oop;

public interface IFighter {
     String weapon = "";
     static int fighterCount = 0;
     static final int FIGHTER_SKIN = 0;
     //cant have constructors

    void fight();
}

interface IWeaponFighter extends IFighter{
    void shoot();
}

class Piston implements IWeaponFighter{

    @Override
    public void shoot() {

    }

    @Override
    public void fight() {

    }
}

class Game{
    public static void main(String[] args) {
        IFighter fight = new IFighter() {
            @Override
            public void fight() {

            }
        };
    }
}
