public class DAOCar {

    DBProperties properties = new DBProperties();

    private final String addCar = "Insert Into car VALUES (?,?,?)"; //nazwa, segment, benzyna/diesel
    private final String selectCarById = "SELECT * FROM car WHERE id = ?";
    private final String  deleteCarById= "DELETE FROM car WHERE id =?";
}
