package org.rpsgame.scene;

import org.rpsgame.controller.EntryController;
import org.rpsgame.controller.impl.EntryControllerImpl;
import org.rpsgame.model.Player;

import java.util.Scanner;

public class EntryScene implements Scene {
    private final EntryController entryController = new EntryControllerImpl();

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void load() {
        System.out.println("Register player one");
        entryController.registerPlayer(enterPlayer());
        System.out.println("Register player two");
        entryController.registerPlayer(enterPlayer());
        System.out.println("If you are ready to start type START");
        if(scanner.nextLine().equals("START")){
            new GameScene().load();
        }
    }


    private Player enterPlayer() {
        Player player = new Player();
        System.out.println("Enter player name: ");
        player.setName(scanner.nextLine());
        System.out.println("Player with name " + player.getName() + " is created");
        return player;
    }
}
