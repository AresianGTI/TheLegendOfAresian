package action;

import game.Game;

public class ExitHandler extends PhraseActionHandler {

    public ExitHandler(Game game) {
        super(game);
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/exit"};
    }

    @Override //Override beschreibst, dass diese Methode die Methode von der Mutter-Klasse überschreibt
    public String handle() {
        this.game.setEndgame();
        return "Programm wird beendet!";
    }


    
}
