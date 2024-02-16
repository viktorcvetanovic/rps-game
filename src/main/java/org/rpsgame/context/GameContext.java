package org.rpsgame.context;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.rpsgame.model.Duel;
import org.rpsgame.model.Player;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
public class GameContext {

    private static GameContext gameContext;
    private List<Player> currentPlayers = new ArrayList<>();
    private List<Duel> history = new ArrayList<>();

    public void addPlayer(Player player){
        currentPlayers.add(player);
    }

    public void addHistory(Duel duel){
        history.add(duel);
    }

    public static GameContext getInstance(){
        if(gameContext == null){
            gameContext = new GameContext();
        }
        return gameContext;
    }
}
