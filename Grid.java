import java.util.ArrayList;

public class Grid extends ArrayList {

    int length;
    int height;

    String currentPlayer;

    int currentCell;


    // (min) 2 shops + (min) 4 enemy
    public int buildMap(){
        return 1;
    }

    private Grid(){
        return;
    }

    public int goNorth(){
        return 0;
    }

    public int goSouth(){
        return 0;
    }

    public int goWest(){
        return 0;
    }

    public int goEast(){
        return 0;
    }
}
