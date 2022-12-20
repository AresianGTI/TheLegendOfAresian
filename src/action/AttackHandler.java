package action;

import game.Game;

public class AttackHandler extends PhraseActionHandler {

    public AttackHandler(Game game) {
        super(game);
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/attack"};
    }

    @Override
    public String handle() {
        return "Angriff";
    }
    
}
