package ASM.asm3.editSV;

import ASM.asm3.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import java.io.*;
import java.util.ArrayList;

public class Controller {
    public void update() {
    }
    public void studentList(){
    }
    public void home() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../home/home.fxml"));
        ASM.asm3.Main.mainStage.setScene(new Scene(root, 600, 400));
        Main.mainStage.show();
    }
}
