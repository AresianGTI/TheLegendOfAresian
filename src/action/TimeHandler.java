package action;

import java.text.SimpleDateFormat;
import java.util.Date;

import game.Game;

/**
 * TimeHandler
 */
public class TimeHandler extends PhraseActionHandler {

    private SimpleDateFormat dateFormat;
    private SimpleDateFormat timeFormat;

    public TimeHandler(Game game) {
        super(game);
        this.timeFormat = new SimpleDateFormat("H:m");
        this.dateFormat = new SimpleDateFormat("d.M.y");
    }

    @Override
    protected String[] getPhrases() {
        return new String[]{"/time"};
    }

    @Override
    public String handle() {
        Date date = new Date();
        return "Es ist der " + this.dateFormat.format(date) + ". Uhrzeit: " + this.timeFormat.format(date);
    }

    
}