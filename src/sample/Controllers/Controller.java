package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private JFXListView<String> tableList;

    @FXML
    private JFXButton saveBtn;

    private void nodeListViewElement(){
        ObservableList<String> list = FXCollections.observableArrayList("Python","Java","Java","Java","Java","Java","Java","Java","Java",
                "Java","Java","Java","Java","Java","Java","Java");
        tableList.setItems(list);
    }

    @FXML
    private void saveBtnAction(Event event){
        Stage stage = (Stage) saveBtn.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nodeListViewElement();
    }
}
