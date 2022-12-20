package battle;

import java.util.Random;

import enums.Gender;
import game.Game;

public abstract class BattleHandler {
    
    protected Game game;
    private Random enemyCount;
    private int minEnemyCount = 1;
    private int maxEnemyCount = 4;

    public BattleHandler(Game game){
        this.game = game;
    }

    private void spornEnemies(){
        int count = enemyCount.nextInt((maxEnemyCount - minEnemyCount + 1) + minEnemyCount);
        // for(int i=0;i++;i>=count){
        //     generateRandomEnemy();
        // }
    }

    // private boolean checkEnemyStatus() {

    // }

    private void generateRandomEnemy(){

    }

}
