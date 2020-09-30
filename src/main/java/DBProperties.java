import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DBProperties {

    private final String url = "jdbc:mysql://localhost:3306/cars";
    private final String user ="car_user";
    private final String password = "Marik1234";
}
