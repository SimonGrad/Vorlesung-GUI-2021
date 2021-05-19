package de.throsenheim.gui.threading;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class OracleMain implements Initializable {
    @FXML
    private TextField questionInput;
    @FXML
    private Button askButton;
    @FXML
    private Text answerText;

    private OracleModel model = new OracleModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.answerText.textProperty().bind(model.answerProperty());


        askButton.setOnAction((ActionEvent e) -> {
            model.reset();

            new Thread(() -> {
                this.askButton.setDisable(true);

                Boolean result = ask(questionInput.getText());
                updateGui(result);

                this.askButton.setDisable(false);

            }).start();

//            updateGui(result);
        });
    }

    private void updateGui(Boolean result) {
        model.setResult(result);
    }


    private Boolean ask(String question) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }

        return new Random().nextBoolean();
    }
}
