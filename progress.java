public class progress {
    //variables
    private int game_progress;
    private int difficulty;
    private boolean buff;
//constructor
    progress(){
        this.game_progress = 0;
        this.difficulty = 1;
        this.buff = false;
    }
//setters and getters
    public void setGP(int gp){
        this.game_progress = gp;
    }
    
    public void setD(int d){
        this.difficulty = d;
    }

    public void setB(boolean b){
        this.buff = b;
    }

    public int getGP(){
        return game_progress;
    
    }
    public int getD(){
        return difficulty;
    }

    public boolean getB(){
        return buff;
    }
    //ends the game
    public void endGame(player p){
        if (p.getT() <= 0 || p.getHP() <=0 || p.getH() <= 0 || p.getS() <= 0){
            System.out.println("Game Over");
        }
    }
    
}
