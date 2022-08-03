package ku.cs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class ProjectController {
    @FXML  public void registerHandleButton (ActionEvent actionEvent){
        try {
            FXRouter.goTo("Register");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า Register ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

}
