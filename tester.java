public class tester {
    public static void main(String[] args) {
        //testing file

        //NOTE - I HAVE MADE SOME CHANGES TO THE BASE AFTER THE UML WAS MADE! EVERYTHING SHOULD BEHERE BUT MIGHT HAVE EITHER BEEN MOVED AROUND OR RENAMED.
        reward r1 = new reward("health", 1);
        reward r2 = new reward("healt", 1);
        reward r3 = new reward("heal", 1);
        game_events game = new game_events("enemies", "fight", "run", "hide", r1, r2, r3);
        player Jackson = new player();
        progress pb = new progress();


        System.out.println(game.getE1());
        System.out.println(Jackson.getHP());
        System.out.println(pb.getGP());
        Jackson.setH(0);
        pb.endGame(Jackson);
    }
}
