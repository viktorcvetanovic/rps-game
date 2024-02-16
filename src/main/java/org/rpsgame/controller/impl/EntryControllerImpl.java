package org.rpsgame.controller.impl;

import org.rpsgame.context.GameContext;
import org.rpsgame.controller.EntryController;
import org.rpsgame.exceptions.PlayerSizeOverflow;
import org.rpsgame.model.Player;

public class EntryControllerImpl implements EntryController {

    private final GameContext gameContext = GameContext.getInstance();

    @Override
    public void registerPlayer(Player player) {
        if (gameContext.getCurrentPlayers().size() > 2) {
            throw new PlayerSizeOverflow("Maximum players for one game is 2");
        }
        gameContext.addPlayer(player);
    }
}
