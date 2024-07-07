public class player {
    //variables
    private int health;
    private int sanity;
    private int hunger;
    private int thirst;
//constructor
    player(){
        this.health = 100;
        this.sanity = 100;
        this.hunger = 100;
        this.thirst = 100;
    }
//setters and getters
    public void setHP(int hp){
        this.health = hp;
    }
    public void setS(int s){
        this.sanity = s;
    }
    public void setH(int h){
        this.hunger = h;
    }
    public void setT(int t){
        this.thirst = t;
    }

    public int getHP(){
        return health;
    }
    public int getS(){
        return sanity;
    }
    public int getH(){
        return hunger;
    }
    public int getT(){
        return thirst;
    }
}
