package org.example;

import java.util.Random;

public class Quidditch {
    public void getBalls(){
        for (int i = 1; i <= 3; i++) {
            System.out.print("//Запущен мяч под названием: ");
            if (i == 1) {
                System.out.print("Quaffle");
            } else if (i == 2) {
                System.out.print("Bludger");
            } else {
                System.out.println("Golden Snitch");
            }
        }
    }
    public void playGame() {
        Random random = new Random();
        boolean isNot = true;
        while (isNot){
            int control = random.nextInt(100);
            if (control == 13){
                System.out.println("Снитч пойман.");
                isNot = false;
            } else {
                System.out.println(" ! ");
            }
        }
    }

}
