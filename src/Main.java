public class Main {

    public void onStartGameButtonCLick(){
        for (int i = 0; i < Field.size; i++) {
            Field.cells.add(new Cell(true, i));
        }
    }
    public void onSize400ButtonClick(){
        Field.size = 400;
    }
    public void onSize800ButtonClick(){
        Field.size = 800;
    }
    public void onSize1200ButtonClick(){
        Field.size = 1200;
    }
    public void onTwoPlayersButtonClick(){
        Player.numberOfPlayers = 2;
    }

    public void onThreePlayersButtonClick(){
        Player.numberOfPlayers = 3;
    }
    public void onFourPlayersButtonClick(){
        Player.numberOfPlayers = 4;
    }
    public static void main(String[] args) {

    }
}