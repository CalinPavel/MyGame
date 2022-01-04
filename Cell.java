public class Cell {

    //coordonatele pe Ox s, i Oy ˆın hart˘
    int xCoordinate , yCoordinate;

    //num ce defines, te tipul celulei
    enum type{};

    //CellElement currentCell = new CellElement();

    int checked;
}

//CellElement este o interfata implementata de catre Enemy si Shop.
interface CellElement{

    public int toCharacter();

}
