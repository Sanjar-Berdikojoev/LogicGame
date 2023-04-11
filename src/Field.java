import java.util.ArrayList;

public class Field {
    static int id = 0;
    static int size = 0;
    static Tower tower = new Tower("red", 3, id++);
    static ArrayList<Cell> cells = new ArrayList<>();
    static ArrayList<Tower> redTowers = new ArrayList<>();
    static ArrayList<Tower> blueTowers = new ArrayList<>();
    static ArrayList<Tower> greenTowers = new ArrayList<>();
    static ArrayList<Tower> yellowTowers = new ArrayList<>();

    final static int minHeight = 1;
    final static int maxHeight = 8;

//    public static Tower selectTower(){
//
//    }
    public static int setNewTowerHeight(int height){
        if(height <= minHeight)
            return 0;
        return (height - 1);
    }
    public static int decreaseTowerHeight(int height){
        if(height <= minHeight)
            return height;
        return (height - (height - 1));
    }

    public static int addPointToTower(int height, int points){  //Add Features
        if(height >= maxHeight || points == 0)
            return 0;
        height++;
        points--;
        return height;
    }

    public static int addMaxPointToTower(int height, int points){  //Add Features
        if(height >= maxHeight)
            return 0;
        for (int i = 0; i < points; i++) {
            if (height < maxHeight)
                height++;
            else {
                points -= (i + 1);
                break;
            }
        }
        return height;
    }

    public static Tower createTower(){
        String color = Player.getCurrentPlayer();
        int height = setNewTowerHeight(tower.getHeight());
        return new Tower(color, height, id++); //Fix
    }

    public static void addTowerToList(){
        if(createTower().color.equals("red"))
            redTowers.add(createTower());
        else if(createTower().color.equals("blue"))
            blueTowers.add(createTower());
        else if (createTower().color.equals("green"))
            greenTowers.add(createTower());
        else if (createTower().color.equals(("yellow"))) {
            yellowTowers.add(createTower());
        }
    }
}
