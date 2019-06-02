package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class Controller {

    public Button actionButton;
    public Label displayText;
    public TextField actionText;
    public VBox figmentInfoArea;

    private String command;

    public void initialize(){

    }

    public void enterCommand(ActionEvent actionEvent) {
        readText();
    }
    private void readText() {
        command = actionText.getText();
        System.out.println(command);
    }

}
