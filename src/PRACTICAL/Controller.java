package PRACTICAL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TableView<Contact> tbView;
    public TableColumn<Contact,String> tbName;
    public TableColumn<Contact,String> tbPhone;
    ObservableList<Contact> ct = FXCollections.observableArrayList();
    ObservableList<Contact> ctSearch = FXCollections.observableArrayList();
    public TextField Name;
    public TextField Phone;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbName.setCellValueFactory(new PropertyValueFactory<Contact,String>("Name"));
        tbPhone.setCellValueFactory(new PropertyValueFactory<Contact,String>("Phone"));
    }
    public void add(){
        String n = Name.getText();
        String p = Phone.getText();
        if(!n.isEmpty() && !p.isEmpty()){
            Contact c = new Contact(n,p);
            ct.add(c);
            tbView.setItems(ct);
        }
    }
    public void search(){

    }
    public void exit(){

    }
}