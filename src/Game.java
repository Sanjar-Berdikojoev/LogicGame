public class Game {
    public void onBuildNewTowerButtonClick(){
        Field.createTower();
        Field.addTowerToList();
    }

    public void onSkipButtonClick(){
        Player.nextTurn();
    }
}
