package history;

import history.Humans.Alice;
import history.Humans.Baby;
import history.Humans.Duchess;
import history.Humans.Human;
import history.Utensils.Poker;
import history.Utensils.Utensils;

import static history.Items.*;

public class Main {

    public static void main(String[] args) {
	    Human duchess = new Duchess();
        Human baby = new Baby();
        Human alice = new Alice();
        System.out.println(duchess.hit(poker));
        System.out.println(baby.hit(scoop));
        System.out.println(alice.hit(tong));
        System.out.println(cup.getAction());
        System.out.println(pan.getAction());
        System.out.println(plate.getAction());
        System.out.println(duchess.getState());
        System.out.println(baby.getState());
        System.out.println(alice.getState());
    }
}
