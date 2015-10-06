package Login;
import javafx.fxml.FXMLLoader;

public class LoginController {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginInterface.fxml"));
	LoginController controller = new LoginController();
	loader.setController(controller);
	Parent root = (Parent) loader.load();
}
