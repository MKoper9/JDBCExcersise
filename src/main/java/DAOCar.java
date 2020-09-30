import java.sql.*;

public class DAOCar {

    DBProperties properties = new DBProperties();

    private final String addCar = "Insert Into cars VALUES (?,?,?)"; //nazwa, segment, benzyna/diesel
    private final String selectCarById = "SELECT * FROM cars WHERE id = ?";
    private final String deleteCarById = "DELETE FROM cars WHERE id =?";
    private final String findById = "SELECT * FROM cars WHERE id =?";

    public void findById(int id) {
        Connection connection = null;
        PreparedStatement preStm = null;

        try {
            connection = DriverManager.getConnection(properties.getUrl(), properties.getUser(), properties.getPassword());
            preStm = connection.prepareStatement(selectCarById);

            preStm.setInt(1, id);
            ResultSet resultSet = preStm.executeQuery();

            while (resultSet.next()) {
                id = resultSet.getInt("car_id");
                String name = resultSet.getString("name");
                String segment = resultSet.getString("segment");
                String fuel = resultSet.getString("fuel");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preStm.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
