package action;

import game.Game;

public abstract class PhraseActionHandler  extends ActionHandler{

    

    public PhraseActionHandler(Game game) {
        super(game);
    }

    protected abstract String[] getPhrases(); //Alle PhraseActionhandler müssen 

    @Override
    public String handle() {
        return "PhraseActionHandler called!";
    }

    @Override
    public boolean commandMatches(String command) {
        String[] phrases = this.getPhrases();
        for (String phrase : phrases) {
            if (phrase.equals(command)){
                return true;
            }
        }
        return false;
    }
    
}
