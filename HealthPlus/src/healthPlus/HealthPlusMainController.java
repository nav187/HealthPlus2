/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package healthPlus;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Navneet
 */
public class HealthPlusMainController implements Initializable {
    @FXML
    private Button nav_home;
    @FXML
    private Button nav_patient;
    @FXML
    private Button nav_reports;
    @FXML
    private Button nav_admin;
    @FXML
    private Button nav_logout;
    @FXML
    private Button nav_usermenu;
    @FXML
    private AnchorPane home;
    @FXML
    private AnchorPane searchPatient;
    @FXML
    private TextField search_last;
    @FXML
    private TableView search_results;
    @FXML
    private TextField search_first;
    @FXML
    private Button search_button;
    @FXML
    private TextField search_healthcover;
    @FXML
    private ChoiceBox<?> search_diagnosis;
    @FXML
    private RadioButton search_male;
    @FXML
    private ToggleGroup search_gender;
    @FXML
    private RadioButton search_female;
    @FXML
    private Button search_add;
    @FXML
    private AnchorPane viewPatient;
    @FXML
    private TextField view_first;
    @FXML
    private TextField view_last;
    @FXML
    private TextField view_dob;
    @FXML
    private RadioButton view_female;
    @FXML
    private ToggleGroup view_gender;
    @FXML
    private RadioButton view_male;
    @FXML
    private TextField view_phone;
    @FXML
    private TextField view_address;
    @FXML
    private TextField view_city;
    @FXML
    private TextField view_state;
    @FXML
    private TextField view_postcode;
    @FXML
    private TextField view_country;
    @FXML
    private TextField view_email;
    @FXML
    private TextField view_ephone;
    @FXML
    private TextField view_elast;
    @FXML
    private TextField view_efirst;
    @FXML
    private TextField view_erelationship;
    @FXML
    private TextField view_referraldoc;
    @FXML
    private TextField view_practiceaddress;
    @FXML
    private TextField view_practice;
    @FXML
    private TextField view_referralcountry;
    @FXML
    private TextField view_referralpostcode;
    @FXML
    private TextField view_referralstate;
    @FXML
    private TextField view_city1;
    @FXML
    private Button view_savebutton;
    @FXML
    private Button search_add12;
    @FXML
    private Label view_editbutton;
    @FXML
    private TextArea view_medicalhis;
    @FXML
    private TextField view_height;
    @FXML
    private TableView<?> view_allergies;
    @FXML
    private ChoiceBox<?> view_diagnosis;
    @FXML
    private TextArea view_diagnosiscomment;
    @FXML
    private TextField view_weight;
    @FXML
    private TextArea view_familyhis;
    @FXML
    private Button search_add121;
    @FXML
    private Label view_editbutton1;
    @FXML
    private Button view_savebutton1;
    @FXML
    private TableView<?> view_upcomingappt;
    @FXML
    private TableView<?> view_appthis;
    @FXML
    private TextField view_apptdate;
    @FXML
    private TextField view_appttime;
    @FXML
    private TextArea view_apptnotes;
    @FXML
    private TableView<?> view_records;
    @FXML
    private Button view_preview;
    @FXML
    private Button view_upload;
    @FXML
    private Button view_download;
    @FXML
    private TextField view_healthfund;
    @FXML
    private TableView<?> view_billing;
    @FXML
    private TextField view_totaloutstanding;
    @FXML
    private Button view_addbilling;
    @FXML
    private RadioButton view_inactive;
    @FXML
    private ToggleGroup view_status;
    @FXML
    private RadioButton view_active;
    @FXML
    private AnchorPane addPatient;
    @FXML
    private TextField add_first;
    @FXML
    private TextField add_last;
    @FXML
    private TextField add_dob;
    @FXML
    private RadioButton add_female;
    @FXML
    private ToggleGroup add_gender;
    @FXML
    private RadioButton add_male;
    @FXML
    private TextField add_phone;
    @FXML
    private TextField add_address;
    @FXML
    private TextField add_city;
    @FXML
    private TextField add_state;
    @FXML
    private TextField add_postcode;
    @FXML
    private TextField add_country;
    @FXML
    private TextField add_email;
    @FXML
    private TextField add_ephone;
    @FXML
    private TextField add_elast;
    @FXML
    private TextField add_efirst;
    @FXML
    private TextField add_erelationship;
    @FXML
    private TextField add_referraldoc;
    @FXML
    private TextField add_refaddress;
    @FXML
    private TextField add_refpractice;
    @FXML
    private TextField add_refcountry;
    @FXML
    private TextField add_refpostcode;
    @FXML
    private TextField add_refstate;
    @FXML
    private TextField add_refcity;
    @FXML
    private TextField add_weight;
    @FXML
    private TextField add_height;
    @FXML
    private TableView add_allergies;
    @FXML
    private TextArea add_medhis;
    @FXML
    private TextField add_healthfund;
    @FXML
    private Button add_save;
    @FXML
    private Button add_cancel;
    @FXML
    private TextArea add_famhis;
    @FXML
    private Button search_go;
    
    private Connection conn;

    ObservableList<ObservableList> table; 
    @FXML
    private TextField search2;
    private SimpleDateFormat formatter;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSearch(ActionEvent event) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            conn = DbConn.connect();
            String sql = "SELECT pr_patient.patient_id, pr_patient.first_name, pr_patient.last_name, pr_patient.gender, pr_patient.date_of_birth, "
                    + "pr_medical.health_cover FROM PR_PATIENT INNER JOIN pr_medical ON pr_patient.patient_id=pr_medical.patient_id where first_name "
                    + "LIKE '%"+search2.getText()+"%' OR last_name LIKE '%"+search2.getText()+"%' or gender LIKE '%"+search2.getText()+"%' or "
                    + "health_cover LIKE '%"+search2.getText()+"%' or pr_patient.patient_id LIKE '%"+search2.getText()+"%'";

            ResultSet rs = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
            ObservableList<Object> data = FXCollections.observableArrayList();

            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });

                search_results.getColumns().addAll(col);
            }

            while (rs.next()) {

                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {

                    row.add(rs.getString(i));
                }
                System.out.println(row);
                data.add(row);
            }
            search_results.setItems(data);
            rs.close();
            
            search_results.getItems().clear();
            search_results.getColumns().clear();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @FXML
    private void handleSearch2(ActionEvent event) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            /*final ToggleGroup group = new ToggleGroup();
            search_female.setToggleGroup(group);
            search_male.setToggleGroup(group);
            search_female.setUserData("Female");
            search_male.setUserData("Male");

            group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
                public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                    if (group.getSelectedToggle() != null) {
                        getClass().getResourceAsStream(group.getSelectedToggle().getUserData().toString());
                        System.out.println(getClass().getResourceAsStream(group.getSelectedToggle().getUserData().toString()));
                    }
                }
            });*/
            conn = DbConn.connect();
            String sql = "SELECT pr_patient.patient_id, pr_patient.first_name, pr_patient.last_name, pr_patient.gender, pr_patient.date_of_birth, "
                    + "pr_medical.health_cover FROM PR_PATIENT INNER JOIN pr_medical ON pr_patient.patient_id=pr_medical.patient_id "
                    + "where first_name LIKE '%" + search_first.getText() + "%' and last_name LIKE '%" + search_last.getText()
                    + "%' and health_cover LIKE '%" + search_healthcover.getText() + "%'";
            
            // and gender LIKE '%" + search_healthcover.getUserData().toString() + "%'

            ResultSet rs = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
            ObservableList<Object> data = FXCollections.observableArrayList();

            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });

                search_results.getColumns().addAll(col);
            }

            while (rs.next()) {

                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {

                    row.add(rs.getString(i));
                }
                System.out.println(row);
                data.add(row);

            }
            search_results.setItems(data);
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @FXML
    private void handleAdd(ActionEvent event) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException {
        addPatient.setVisible(true);
        searchPatient.setVisible(false);
        
        try {
            conn = DbConn.connect();
            String sql = "INSERT INTO pr_patient (patient_id, first_name, last_name, date_of_birth, gender, phone_number, address, "
                    + "email, city, state, post_code, country, emerg_fname, emerg_lname, emerg_number, emerg_relo) "
                    + "VALUES (seq_patient.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, add_first.getText());
            stmt.setString(2, add_last.getText());
            formatter = new SimpleDateFormat("dd-MMM-yy");
            stmt.setDate(3, (Date) formatter.parse(add_dob.getText()));
            stmt.setString(4, add_gender.getSelectedToggle().getUserData().toString());
            stmt.setInt(5, Integer.parseInt(add_phone.getText()));
            stmt.setString(6, add_address.getText());
            stmt.setString(7, add_email.getText());
            stmt.setString(8, add_city.getText());
            stmt.setString(9, add_state.getText());
            stmt.setString(10, add_postcode.getText());
            stmt.setString(11, add_country.getText());
            stmt.setString(12, add_efirst.getText());
            stmt.setString(13, add_elast.getText());
            stmt.setInt(14, Integer.parseInt(add_ephone.getText()));
            stmt.setString(15, add_erelationship.getText());
            
            stmt.executeUpdate();
            stmt.close();
            
            String sql2 = "INSERT INTO pr_medical (patient_id, medical_id, weight, height, allergies, medical_hist, family_hist, "
                    + "health_cover, allerg_reaction, allerg_treatment) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, add_first.getText());
            stmt2.setString(2, add_last.getText());
            stmt2.setInt(3, Integer.parseInt(add_weight.getText()));
            stmt2.setInt(4, Integer.parseInt(add_height.getText()));
            //stmt2.setString(5, add_allergies.getText());
            stmt2.setString(6, add_medhis.getText());
            stmt2.setString(7, add_famhis.getText());
            stmt2.setString(8, add_healthfund.getText());
            stmt2.setString(9, add_state.getText());
            stmt2.setString(10, add_postcode.getText());
            
            stmt2.executeUpdate();
            stmt2.close();
            
            String sql3 = "INSERT INTO pr_referral (patient_id, ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             
            PreparedStatement stmt3 = conn.prepareStatement(sql3);
            
            stmt3.executeUpdate();
            stmt3.close();
            
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
    }

    @FXML
    private void getSelectedRow(MouseEvent event) {
        search_results.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent t) {
                if(t.getButton().equals(MouseButton.PRIMARY)){
                    if(t.getClickCount() == 2){
                        //TableCell c = (TableCell) t.getSource();
                        ObservableList<TablePosition> cells = search_results.getSelectionModel().getSelectedCells();
                        System.out.println("Double clicked");
                        
                        search_results.getSelectionModel().getSelectedItem().toString();
                        
                        String sql = "SELECT * from pr_patient where first_name";
                    }
                }
                /*if(search_results != null){
                    String str = search_results.getSelectionModel().getSelectedItems().get(0).toString();
                    String str1 = str.substring(1, 6);
                    String str2 = str.substring(1, 5);
                    String str3 = str.substring(1, 4);
                    String str4 = str.substring(1, 3);
                    String str5 = str.substring(1, 2);
                    
                    Pattern p = Pattern.compile("^[0-9]*$");
                    
                    Matcher m1 = p.matcher(str1);
                    Matcher m2 = p.matcher(str2);
                    Matcher m3 = p.matcher(str3);
                    Matcher m4 = p.matcher(str4);
                }*/
            }  
        });
    }
    
}
