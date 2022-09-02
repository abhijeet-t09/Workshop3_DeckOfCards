package com.bridgelabz;
import java.util.Scanner;

public class Players {
    public int noOfPlayers(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter No. of Players: ");
        int noOfPlayer = scanner.nextInt();

        if(noOfPlayer>1 && noOfPlayer<5)
            return noOfPlayer;
        else
            return 0;
    }
}
