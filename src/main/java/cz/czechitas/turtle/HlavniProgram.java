package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    private void nakresliCtverec(Turtle zelva, double delkaStrany) {

        for (int i = 0; i < 4; i++) {
            zelva.move(delkaStrany);
            zelva.turnRight(90);
        }
    }

    private void nakresliKruh(Turtle zelva, double polomer, Color barva) {

        zelva.setPenColor(barva);

        for (int i = 0; i < 24; i++) {

            zelva.move((2 * 3.14 * polomer) / 24);
            zelva.turnRight(16);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle zelva, double delkaStrany, Color barva) {

        zelva.setPenColor(barva);

        double uhel = 360.0 / 3;

        for (int i = 0; i < 3; i++) {
            zelva.move(delkaStrany);
            zelva.turnRight(uhel);
        }
    }

    private void nakresliObdelnik(Turtle zelva, double delkaStranyA, double delkaStranyB, Color barva) {

        zelva.setPenColor(barva);

        for (int i = 0; i < 2; i++) {
            zelva.move(delkaStranyA);
            zelva.turnRight(90);
            zelva.move(delkaStranyB);
            zelva.turnRight(90);
        }
    }

    private void nakresliZmrzlinu(Turtle zelva, double poziceX, double poziceY) {

        zelva.setLocation(poziceX, poziceY);
        zelva.turnRight(186);
        nakresliKruh(zelva, 80, Color.magenta);
        zelva.setLocation(poziceX, poziceY + 20);
        nakresliRovnostrannyTrojuhelnik(zelva, 148, Color.orange);
        zelva.setLocation(poziceX, poziceY);
        zelva.turnLeft(200);
    }

    private void nakresliSnehulaka(Turtle zelva, double poziceX, double poziceY) {

        zelva.setLocation(poziceX, poziceY);
        nakresliKruh(zelva, 70, Color.blue);
        zelva.setLocation(poziceX - 35, poziceY + 135);
        nakresliKruh(zelva, 120, Color.blue);
        zelva.setLocation(poziceX - 95, poziceY + 158);
        nakresliKruh(zelva, 30, Color.blue);
        zelva.setLocation(poziceX + 200, poziceY + 150);
        nakresliKruh(zelva, 30, Color.blue);
        zelva.setLocation(poziceX + 90, poziceY + 300);
        nakresliKruh(zelva, 160, Color.blue);
    }

    private void nakresliMasinku(Turtle zelva, double poziceX, double poziceY) {

        zelva.setLocation(poziceX, poziceY);
        zelva.turnRight(50);
        nakresliObdelnik(zelva, 300, 200, Color.green);
        zelva.setLocation(950, 600);
        nakresliKruh(zelva, 105, Color.black);
        zelva.setLocation(750, 450);
        zelva.turnLeft(24);
        nakresliObdelnik(zelva, 150, 300, Color.green);
        zelva.setLocation(650, 600);
        zelva.turnLeft(90);
        nakresliKruh(zelva, 55, Color.black);
        zelva.setLocation(550, 602);
        nakresliKruh(zelva, 55, Color.black);
        zelva.setLocation(450, 500);
        zelva.turnRight(42);
        nakresliRovnostrannyTrojuhelnik(zelva, 150, Color.gray);
    }

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setPenWidth(8);

        nakresliZmrzlinu(zofka, 200, 130);

        nakresliSnehulaka(zofka, 1200, 100);

        nakresliMasinku(zofka, 950, 300);
    }
}

