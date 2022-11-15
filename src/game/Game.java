package game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import action.ActionHandler;
import action.ErrorHandler;
import action.ExitHandler;
import action.TimeHandler;
import world.Location;
import world.World;

public class Game {
    
    private BufferedReader input;
    private PrintStream output; //If you want to output not only to the console but elsewhere
    private List<ActionHandler> actionHandler;
    private World world;
    private boolean endgame;

    public Game() {
        this.input = new BufferedReader(new InputStreamReader(System.in));
        this.output = System.out;
        // this. actionHandler = new ActionHandler[]{};
        this.actionHandler = new ArrayList<>();
        this.endgame = false;

        this.loadActionHandlers();

        this.world = new World(new Location("Verlorene Wälder", "Du bist am Anfang eines Waldes, hinter dir der Weg, den du herbenutzt hast."));
    }


    public void run() throws IOException { //Input Output Exception is possible

        String command = "";

        while(!endgame){

            this.output.println("\n-------------------\n" + this.world.getCurrentSituation());

            //Eingabe
            this.output.print("> ");
            command = this.input.readLine(); 

            //Verarbeitung
            String outputString =  this.nextRound(command);

            //Ausgabe
            this.output.println(outputString);
            // this.output.println();
        }
    }

    public String nextRound(String command){
        ActionHandler pointedHandler = null;
        for (ActionHandler handler : this.actionHandler){
            if(handler.matches(command)){
                pointedHandler = handler;
                break;
            }
        }
        if(pointedHandler == null)
            pointedHandler = new ErrorHandler(this);

        return pointedHandler.handle();
    }

    public void setEndgame(){
        this.endgame = true;
    }

    private void loadActionHandlers(){
        this.actionHandler.add(new ExitHandler(this));
        this.actionHandler.add(new TimeHandler(this));
    }

}
