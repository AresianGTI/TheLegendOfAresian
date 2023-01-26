package action;

import game.Game;

public class ErrorHandler extends ActionHandler {

	public ErrorHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        
        return "Kommando existiert nicht...";
    }

    @Override
    public boolean commandMatches(String command) {
        return true;
    }
    
}
