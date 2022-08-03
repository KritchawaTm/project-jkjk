package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class RegisterController {


    @FXML public void handleBackButton(ActionEvent actionEvent){
        try {
            FXRouter.goTo("project");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า project ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

}
