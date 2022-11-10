package action;

import game.Game;

public abstract class ActionHandler {

    protected Game game;

    
    public ActionHandler(Game game){
        this.game = game;
    }

    public abstract String handle();
    public abstract boolean matches(String command);
    
}
