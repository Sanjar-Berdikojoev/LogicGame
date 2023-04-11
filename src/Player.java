public class Player {
    private final static String[] players = {"red", "blue", "green", "yellow"};
    public static int[] playersPoints = {0, 0, 0, 0};
    private static int currentPlayerIndex = 0;
    private static int currentPlayerPoints = 0;
    public static int numberOfPlayers = 4;
    private static int turnCounter = 0;
    private static int circleCounter = 0;

    public static void nextTurn() {
        currentPlayerIndex = (currentPlayerIndex + 1) % (players.length);
        turnCounter++;
        circleCounter = turnCounter % numberOfPlayers;
    }

    public static String getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public static void addPointsToPlayers() {
        if(turnCounter % numberOfPlayers == 0 && circleCounter % 2 != 0){
            playersPoints[0] += Field.redTowers.size();
            playersPoints[1] += Field.blueTowers.size();
            playersPoints[2] += Field.greenTowers.size();
            playersPoints[3] += Field.yellowTowers.size();
        }
    }
}



//            for (int i = 0; i < players.length; i++) {
//                playersPoints[i] = Field.redTowers.size();
//            }