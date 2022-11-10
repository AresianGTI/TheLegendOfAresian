package action;

import game.Game;

public abstract class PhraseActionHandler  extends ActionHandler{

    

    public PhraseActionHandler(Game game) {
        super(game);
    }

    @Override
    public String handle() {
        return "PhraseActionHandler called!";
    }

    @Override
    public boolean matches(String command) {
        String[] phrases = this.getPhrases();
        for (String phrase : phrases) {
            if (phrase.equals(command)){
                return true;
            }
        }
        return false;
    }
    
    protected abstract String[] getPhrases(); //Alle PhraseActionhandler müssen 
}
