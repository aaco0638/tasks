package calculatorgame;

public class CalculatorGame {

    public static void main(String[] args){
        Player one = new Player ("john", 18);
        HighScore win = new HighScore (one.name(), 100);
        System.out.println(win.name() + " " + win.score()); // win.name() is calling highscore and the name from one.

    }
}

//record Player (String name, int age) {}
//record HighScore (String name, int score) {}