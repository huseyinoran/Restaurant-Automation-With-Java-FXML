package javafxapplication6;
import com.sun.accessibility.internal.resources.accessibility;
import java.net.URL;
import java.security.cert.PKIXRevocationChecker;
import java.util.Observer;
import javafx.fxml.FXMLLoader;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javafxapplication6.*;
public class FXMLDocumentController implements Initializable {   
    @FXML    public ToggleButton togglemasa1,togglemasa2,togglemasa3,togglemasa4,togglemasa5,togglemasa6,toggleanayemek,toggleicecek,toggletatli,togglesalata,togglearayemek, j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12;
    @FXML    public Button buttonsiparisal,buttonsiparisgoruntule,hesaplama,geri,sil,hesapal,kasa,buttonsiparisgoster;
    @FXML    public Spinner<Integer> adetsayac;
    @FXML    private Pane gorev,cesit1,cesit2,masadurum;
    @FXML    private Label sonuc,denemehesap,toplam1,toplam2,toplam3,toplam4,toplam5,toplam6;
    @FXML    public TableView<hesap1> masa1table = new TableView<hesap1>();
    @FXML    private TableView<hesap1> masa2table = new TableView<hesap1>();
    @FXML    private TableView<hesap1> masa3table = new TableView<hesap1>();
    @FXML    private TableView<hesap1> masa4table = new TableView<hesap1>();
    @FXML    private TableView<hesap1> masa5table = new TableView<hesap1>();
    @FXML    private TableView<hesap1> masa6table = new TableView<hesap1>();
    @FXML    private Tab tab1,tab2,tab3,tab4,tab5,tab6;
    //-----------------------------MASA-1----------------------------------------//
    TableColumn turcol1 = new TableColumn<hesap1, String>("Tür");
    TableColumn isimcol1 = new TableColumn<hesap1, String>("İsim");
    TableColumn fiyatcol1 = new TableColumn<hesap1, Double>("Fiyat");
    TableColumn adetcol1 = new TableColumn<hesap1, Integer>("Adet");
    TableColumn hesapcol1 = new TableColumn<hesap1, Double>("Hesap");
    //-----------------------------MASA-2----------------------------------------//
    TableColumn turcol2 = new TableColumn<hesap1, String>("Tür");
    TableColumn isimcol2 = new TableColumn<hesap1, String>("İsim");
    TableColumn fiyatcol2 = new TableColumn<hesap1, Double>("Fiyat");
    TableColumn adetcol2 = new TableColumn<hesap1, Integer>("Adet");
    TableColumn hesapcol2 = new TableColumn<hesap1, Double>("Hesap");
    //-----------------------------MASA-3----------------------------------------//
    TableColumn turcol3 = new TableColumn<hesap1, String>("Tür");
    TableColumn isimcol3 = new TableColumn<hesap1, String>("İsim");
    TableColumn fiyatcol3 = new TableColumn<hesap1, Double>("Fiyat");
    TableColumn adetcol3 = new TableColumn<hesap1, Integer>("Adet");
    TableColumn hesapcol3 = new TableColumn<hesap1, Double>("Hesap");
    //-----------------------------MASA-4----------------------------------------//
    TableColumn turcol4 = new TableColumn<hesap1, String>("Tür");
    TableColumn isimcol4 = new TableColumn<hesap1, String>("İsim");
    TableColumn fiyatcol4 = new TableColumn<hesap1, Double>("Fiyat");
    TableColumn adetcol4 = new TableColumn<hesap1, Integer>("Adet");
    TableColumn hesapcol4 = new TableColumn<hesap1, Double>("Hesap");
    //-----------------------------MASA-5----------------------------------------//
    TableColumn turcol5 = new TableColumn<hesap1, String>("Tür");
    TableColumn isimcol5 = new TableColumn<hesap1, String>("İsim");
    TableColumn fiyatcol5 = new TableColumn<hesap1, Double>("Fiyat");
    TableColumn adetcol5 = new TableColumn<hesap1, Integer>("Adet");
    TableColumn hesapcol5 = new TableColumn<hesap1, Double>("Hesap");
    //-----------------------------MASA-6----------------------------------------//
    TableColumn turcol6 = new TableColumn<hesap1, String>("Tür");
    TableColumn isimcol6 = new TableColumn<hesap1, String>("İsim");
    TableColumn fiyatcol6 = new TableColumn<hesap1, Double>("Fiyat");
    TableColumn adetcol6 = new TableColumn<hesap1, Integer>("Adet");
    TableColumn hesapcol6 = new TableColumn<hesap1, Double>("Hesap");
    ObservableList<hesap1> data1 = FXCollections.observableArrayList();  
    ObservableList<hesap1> data2 = FXCollections.observableArrayList();
    ObservableList<hesap1> data3 = FXCollections.observableArrayList();
    ObservableList<hesap1> data4 = FXCollections.observableArrayList();
    ObservableList<hesap1> data5 = FXCollections.observableArrayList();
    ObservableList<hesap1> data6 = FXCollections.observableArrayList();
    public  int masadegisken =0;
    Object newValue = 0;
    public String tür,türcagir,yemekcagir;
    public double gunceldeger,tut=0;
    public int a;
    String m1;
    fiyatlar f = new fiyatlar();
public SpinnerValueFactory<Integer> spinnervalue = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0,1);
    public FXMLDocumentController() {
    }
    public void initialize(URL url, ResourceBundle rb) {
        tab1.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if(tab1.isSelected() == true)
                  toplamhesap();
            }
        });
        tab2.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if(tab2.isSelected() == true)
                    toplamhesap();
            }
        });
        tab3.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if(tab3.isSelected() == true)
                    toplamhesap();
            }
        });
        tab4.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if(tab4.isSelected() == true)
                    toplamhesap();
            }
        });
        tab5.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if(tab5.isSelected() == true)
                    toplamhesap();
            }
        });
        tab6.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if(tab6.isSelected() == true)
                    toplamhesap();
            }
        });
        this.adetsayac.setValueFactory(spinnervalue);
        //-----------------------------MASA-1----------------------------------------//
        turcol1.setCellValueFactory(new PropertyValueFactory<>("tur"));
        isimcol1.setCellValueFactory(new PropertyValueFactory<>("isim"));        
        fiyatcol1.setCellValueFactory(new PropertyValueFactory<>("fiyat"));        
        adetcol1.setCellValueFactory(new PropertyValueFactory<>("adet"));
        hesapcol1.setCellValueFactory(new PropertyValueFactory<>("hesap"));
        masa1table.getColumns().addAll(turcol1,isimcol1,adetcol1,fiyatcol1,hesapcol1);
        //-----------------------------MASA-2----------------------------------------//
        turcol2.setCellValueFactory(new PropertyValueFactory<>("tur"));
        isimcol2.setCellValueFactory(new PropertyValueFactory<>("isim"));        
        fiyatcol2.setCellValueFactory(new PropertyValueFactory<>("fiyat"));        
        adetcol2.setCellValueFactory(new PropertyValueFactory<>("adet"));
        hesapcol2.setCellValueFactory(new PropertyValueFactory<>("hesap"));
        masa2table.getColumns().addAll(turcol2,isimcol2,adetcol2,fiyatcol2,hesapcol2);
        //-----------------------------MASA-3----------------------------------------//
        turcol3.setCellValueFactory(new PropertyValueFactory<>("tur"));
        isimcol3.setCellValueFactory(new PropertyValueFactory<>("isim"));        
        fiyatcol3.setCellValueFactory(new PropertyValueFactory<>("fiyat"));        
        adetcol3.setCellValueFactory(new PropertyValueFactory<>("adet"));
        hesapcol3.setCellValueFactory(new PropertyValueFactory<>("hesap"));
        masa3table.getColumns().addAll(turcol3,isimcol3,adetcol3,fiyatcol3,hesapcol3);
        //-----------------------------MASA-4----------------------------------------//
        turcol4.setCellValueFactory(new PropertyValueFactory<>("tur"));
        isimcol4.setCellValueFactory(new PropertyValueFactory<>("isim"));        
        fiyatcol4.setCellValueFactory(new PropertyValueFactory<>("fiyat"));        
        adetcol4.setCellValueFactory(new PropertyValueFactory<>("adet"));
        hesapcol4.setCellValueFactory(new PropertyValueFactory<>("hesap"));
        masa4table.getColumns().addAll(turcol4,isimcol4,adetcol4,fiyatcol4,hesapcol4);
        //-----------------------------MASA-5----------------------------------------//
        turcol5.setCellValueFactory(new PropertyValueFactory<>("tur"));
        isimcol5.setCellValueFactory(new PropertyValueFactory<>("isim"));        
        fiyatcol5.setCellValueFactory(new PropertyValueFactory<>("fiyat"));        
        adetcol5.setCellValueFactory(new PropertyValueFactory<>("adet"));
        hesapcol5.setCellValueFactory(new PropertyValueFactory<>("hesap"));
        masa5table.getColumns().addAll(turcol5,isimcol5,adetcol5,fiyatcol5,hesapcol5);
        //-----------------------------MASA-6----------------------------------------//
        turcol6.setCellValueFactory(new PropertyValueFactory<>("tur"));
        isimcol6.setCellValueFactory(new PropertyValueFactory<>("isim"));        
        fiyatcol6.setCellValueFactory(new PropertyValueFactory<>("fiyat"));        
        adetcol6.setCellValueFactory(new PropertyValueFactory<>("adet"));
        hesapcol6.setCellValueFactory(new PropertyValueFactory<>("hesap"));
        masa6table.getColumns().addAll(turcol6,isimcol6,adetcol6,fiyatcol6,hesapcol6);    
        } 
    @FXML
    public void masa_1(ActionEvent event) {
       masa1table.setEditable(true);
       masadegisken = 1;
       seciligoster2(togglemasa1);
       seciligoster3(togglemasa1);
       masa1table.isEditable();
    }   
    public void masa_2(ActionEvent event) {
        masa2table.setEditable(true);
        masadegisken = 2;
        seciligoster2(togglemasa2);
        seciligoster3(togglemasa2);
    }  
    public void masa_3(ActionEvent event) {
       masadegisken = 3; 
       seciligoster2(togglemasa3);
       seciligoster3(togglemasa3);
    }   
    public void masa_4(ActionEvent event)
    {
       masadegisken = 4;
       seciligoster2(togglemasa4);
       seciligoster3(togglemasa4);
    }
    public void masa_5(ActionEvent event)
    {
       masadegisken = 5;
       seciligoster2(togglemasa5);
       seciligoster3(togglemasa5);
    }
    public void masa_6(ActionEvent event)
    {
       masadegisken = 6;
       seciligoster2(togglemasa6);
       seciligoster3(togglemasa6);
    }
    public void labelgorunum(Label a)
    {
        toplam1.setVisible(false);
        toplam2.setVisible(false);
        toplam3.setVisible(false);
        toplam4.setVisible(false);
        toplam5.setVisible(false);
        toplam6.setVisible(false);
        a.setVisible(true);
    }
    public void siparis_al (ActionEvent event)
    {      
       gorev.setVisible(false);
       cesit1.setVisible(true);
    }
    public void siparis_goruntule (ActionEvent event)
    {
       gorev.setVisible(false);
       masadurum.setVisible(true);    
       cesit1.setVisible(false);
       cesit2.setVisible(false);  
       toplamhesap();
   }
    public void geri_ (ActionEvent event)
    {
       gorev.setVisible(false);
       cesit1.setVisible(false);
       cesit2.setVisible(false);
       masadurum.setVisible(false);
       togglemasa1.setSelected(false);
       togglemasa2.setSelected(false);
       togglemasa3.setSelected(false);
       togglemasa4.setSelected(false);
       togglemasa5.setSelected(false);
       togglemasa6.setSelected(false);
       
    }
    public void geri2_ (ActionEvent event)
    {
       gorev.setVisible(true);
       cesit1.setVisible(false);
       cesit2.setVisible(false);
       masadurum.setVisible(false);
       toggleanayemek.setSelected(false);
       toggleicecek.setSelected(false);
       togglesalata.setSelected(false);
       togglearayemek.setSelected(false);
       toggletatli.setSelected(false);
    }
    public void ana_yemek (ActionEvent event)
    {
        a=0;
        tür = "anayemek";
        seciligoster(toggleanayemek);
        seciligoster2(toggleanayemek);
    }
    public void icecek_ (ActionEvent event)
    {
        a=0;
        tür = "icecek";
        seciligoster(toggleicecek);
        seciligoster2(toggleicecek);
    }
    public void salata_ (ActionEvent event)
    {
        tür = "salata";
        seciligoster(togglesalata);
        seciligoster2(togglesalata);
    }
    public void tatli_ (ActionEvent event)
    {
        tür = "tatli";
        seciligoster(toggletatli);
        seciligoster2(toggletatli);
    }
    public void ara_yemek (ActionEvent event)
    {
        tür = "arayemek";
        seciligoster(togglearayemek);
        seciligoster2(togglearayemek);
    }
    public void seciligoster3(ToggleButton c)
    {
       togglemasa1.setSelected(false);
       togglemasa2.setSelected(false);
       togglemasa3.setSelected(false);
       togglemasa4.setSelected(false);
       togglemasa5.setSelected(false);       
       togglemasa6.setSelected(false);
       gorev.setVisible(true);
       cesit1.setVisible(false);
       cesit2.setVisible(false);    
       spinnervalue.setValue(1);
       c.setSelected(true);
    }
    public void seciligoster2(ToggleButton b)
    {
        togglearayemek.setSelected(false);
        toggleanayemek.setSelected(false);
        toggleicecek.setSelected(false);
        togglesalata.setSelected(false);
        toggletatli.setSelected(false);
        cesit2.setVisible(true);
        b.setSelected(true);
        masadurum.setVisible(false);
        if(togglearayemek.isSelected() == true)
        {
        j1.setText("Patates Graten");
        j2.setText("Patatesli Ispanak Graten");
        j3.setText("Yoğurtlu Kıymalı Patates Mantısı");
        j4.setText("Pastırmalı Humus");
        j5.setText("Unlu Patlıcan Kızartaması");
        j6.setText("Sucuklu Paçanga Böreği");
        j7.setText("Patatesli Sigara Böreği");
        j8.setText("Kırmızı Köz Biber Kızartması");
        j9.setText("Bamya Kızartması");
        j10.setText("Avcı Böreği");
        j11.setText("Mantar Graten");
        j12.setText("Sıcak Ot");
        }
        if(toggletatli.isSelected() == true)
        {        
        j1.setText("Tiramisu");
        j2.setText("Revani");
        j3.setText("Sakızlı Muhallebi");
        j4.setText("Ağlayan Pasta");
        j5.setText("Mozaik Pasta");
        j6.setText("Köstebek Pasta");
        j7.setText("Kalburabastı");
        j8.setText("Fırın Sütlaç");
        j9.setText("Waffle");
        j10.setText("Çikolatalı Suffle");
        j11.setText("Kazandibi");
        j12.setText("Muzlu Rulo Pasta");
        }
        if(togglesalata.isSelected() == true)
        {
        j1.setText("Pirinç Salatası");
        j2.setText("Yoğurtlu Biber Kavurması");
        j3.setText("Yoğurtlu Nohut Salatası");
        j4.setText("Köz Patlıcanlı Havuç Salatası");
        j5.setText("Yoğurtlu Patates Ezmesi");
        j6.setText("Şalgamlı Kuskus Salatası");
        j7.setText("Patlıcanlı Sos");
        j8.setText("Garnitürlü Patates Salatası");
        j9.setText("Garnitürlü Makarna Salatası");
        j10.setText("Hibeş");
        j11.setText("Tahinli Havuç Ezmesi");
        j12.setText("Mütebbel");
        }
        if(toggleicecek.isSelected()==true)
        {
        j1.setText("Günün Kahvesi");
        j2.setText("Latte");
        j3.setText("Espresso");
        j4.setText("Breve");
        j5.setText("Americano");
        j6.setText("Iced Americano");
        j7.setText("Iced Latte");
        j8.setText("Iced Tea");
        j9.setText("Vanilla Cooler");
        j10.setText("Coffe Cooler");
        j11.setText("Demleme Türk Çayı");
        j12.setText("Türk Kahvesi");
        }
        if(toggleanayemek.isSelected() == true)
        { 
        j1.setText("Fırında Soslu Ballı Kanat");
        j2.setText("Tavada Patlıcan");
        j3.setText("Yoğurtlu Sultan Kebabı");
        j4.setText("Köfteli Mantar");
        j5.setText("Fırında Kaşarlı Karnabahar");
        j6.setText("Arnavut Ciğeri");
        j7.setText("Yeşilçam Köftesi");
        j8.setText("Sırın,Siron(Ziron)");
        j9.setText("Fırında Kıymalı Patates Püresi");
        j10.setText("Fırında Soslu Tavuk But");
        j11.setText("Patates Püreli Etli Karnıyarık");
        j12.setText("Ispanaklı Köfte");
        }
    }
    public void seciligoster(ToggleButton a)
    {
        j1.setSelected(false);
        j2.setSelected(false);
        j3.setSelected(false);
        j4.setSelected(false);
        j5.setSelected(false);
        j6.setSelected(false);
        j7.setSelected(false);
        j8.setSelected(false);
        j9.setSelected(false);
        j10.setSelected(false);
        j11.setSelected(false);
        j12.setSelected(false);
        spinnervalue.setValue(1);
        a.setSelected(true);
    }
    //////j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12 Buradaki butonların hepsi ""seciligoster"" fonksiyonuna gider....
    public void j1_ (ActionEvent event)
    {
       seciligoster(j1);
    }
    public void j2_ (ActionEvent event)
    {
       seciligoster(j2);
    }
    public void j3_(ActionEvent event)
    {
       seciligoster(j3);
    }
    public void j4_ (ActionEvent event)
    {
       seciligoster(j4);
    }
    public void j5_ (ActionEvent event)
    {
       seciligoster(j5);
    }
    public void j6_ (ActionEvent event)
    {
       seciligoster(j6);
    }
    public void j7_ (ActionEvent event)
    {
       seciligoster(j7);
    }
    public void j8_ (ActionEvent event)
    {
       seciligoster(j8);
    }
    public void j9_ (ActionEvent event)
    {
       seciligoster(j9);
    }
    public void j10_ (ActionEvent event)
    {
       seciligoster(j10);
    }
    public void j11_ (ActionEvent event)
    {
       seciligoster(j11);
    }
    public void j12_ (ActionEvent event)
    {
       seciligoster(j12);
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    public void toggletur(ToggleButton i1)
    {
        türcagir = i1.getText();        
    }
    public void togglesiparis(ToggleButton i2)
    {
        yemekcagir = i2.getText();
    }
    
    public void sil_(ActionEvent event)
    {
        if(tab1.isSelected() == true)
        masa1table.getItems().removeAll(masa1table.getSelectionModel().getSelectedItem());
        else if(tab2.isSelected() == true)
        masa2table.getItems().removeAll(masa2table.getSelectionModel().getSelectedItem());
        else if(tab3.isSelected() == true)
        masa3table.getItems().removeAll(masa3table.getSelectionModel().getSelectedItem());
        else if(tab4.isSelected() == true)
        masa4table.getItems().removeAll(masa4table.getSelectionModel().getSelectedItem());
        else if(tab5.isSelected() == true)
        masa5table.getItems().removeAll(masa5table.getSelectionModel().getSelectedItem());
        else if(tab6.isSelected() == true)
        masa6table.getItems().removeAll(masa6table.getSelectionModel().getSelectedItem());        
        toplamhesap();
    }
    public void islem()
    {
        a = adetsayac.getValue();  
        if(tür == "anayemek")
        {
             toggletur(toggleanayemek);
         if(j1.isSelected() == true )
        {
            togglesiparis(j1);
            f.anayemekhesap = f.anayemekhesap + (f.bkanat * adetsayac.getValue());
            gunceldeger = f.bkanat;
        }
             if(j2.isSelected() == true)
        {
            togglesiparis(j2);
            f.anayemekhesap = f.anayemekhesap + (f.tpatlican * adetsayac.getValue()); 
            gunceldeger = f.tpatlican;
        }
             if(j3.isSelected() == true)
        {
            togglesiparis(j3);
            f.anayemekhesap = f.anayemekhesap + (f.yogurtlusultankebabi * adetsayac.getValue());           
            gunceldeger = f.yogurtlusultankebabi;
        }
              if(j4.isSelected() == true)
        {
            togglesiparis(j4);
            f.anayemekhesap = f.anayemekhesap + (f.koftelimantar * adetsayac.getValue());         
            gunceldeger = f.koftelimantar;                    
        }
             if(j5.isSelected() == true)
        {
            togglesiparis(j5);
            f.anayemekhesap = f.anayemekhesap +(f.kasarlikarnabahar * adetsayac.getValue());         
            gunceldeger = f.kasarlikarnabahar;
        }
             if(j6.isSelected() == true)
        {
            togglesiparis(j6);
            f.anayemekhesap = f.anayemekhesap + (f.arnavutcigeri * adetsayac.getValue());           
            gunceldeger = f.arnavutcigeri;
        }
             if(j7.isSelected() == true)
        {
            togglesiparis(j7);
            f.anayemekhesap = f.anayemekhesap + (f.yesilcamkoftesi * adetsayac.getValue());
            gunceldeger = f.yesilcamkoftesi;
        }
             if(j8.isSelected() == true)
        {
            togglesiparis(j8);
            f.anayemekhesap = f.anayemekhesap + (f.ziron * adetsayac.getValue());          
            gunceldeger = f.ziron;
        }
             if(j9.isSelected() == true)
        {
            togglesiparis(j9);
            f.anayemekhesap = f.anayemekhesap + (f.firindakiymalipatates * adetsayac.getValue());          
            gunceldeger = f.firindakiymalipatates;
        }
             if(j10.isSelected() == true)
        {
            togglesiparis(j10);
            f.anayemekhesap = f.anayemekhesap + (f.soslutavukbut * adetsayac.getValue());                
            gunceldeger = f.soslutavukbut;
        }
             if(j11.isSelected() == true)
        {
            togglesiparis(j11);
            f.anayemekhesap = f.anayemekhesap + (f.etlikarniyarik * adetsayac.getValue());          
            gunceldeger = f.etlikarniyarik;
        }
             if(j12.isSelected() == true)
        {
            togglesiparis(j2);
            f.anayemekhesap = f.anayemekhesap + (f.ispanakliköfte * adetsayac.getValue());            
            gunceldeger = f.ispanakliköfte;
        }        
        }
        if(tür == "icecek")
        {
            toggletur(toggleicecek);
            if(j1.isSelected() == true)
            {
                togglesiparis(j1);
                f.icecekhesap = f.icecekhesap + (f.gununkahvesi * adetsayac.getValue());                
                gunceldeger = f.gununkahvesi;
            }
            if(j2.isSelected() == true)
            {
                togglesiparis(j2);
                f.icecekhesap = f.icecekhesap + (f.latte * adetsayac.getValue());
                gunceldeger = f.latte;
            }
            if(j3.isSelected() == true)
            {
                togglesiparis(j3);
                f.icecekhesap  = f.icecekhesap + (f.Espresso * adetsayac.getValue());
                gunceldeger = f.Espresso;
            }
            if(j4.isSelected() == true)
            {
                togglesiparis(j4);
                f.icecekhesap = f.icecekhesap + (f.breve * adetsayac.getValue());
                gunceldeger = f.breve;
            }
            if(j5.isSelected() == true)
            {
                togglesiparis(j5);
                f.icecekhesap = f.icecekhesap + (f.americano * adetsayac.getValue());
                gunceldeger = f.americano;
            }   
            if(j6.isSelected() == true)
            {
                togglesiparis(j6);
                f.icecekhesap = f.icecekhesap + (f.icedamericano * adetsayac.getValue());
                gunceldeger = f.icedamericano;
            }
            if(j7.isSelected() == true)
            {
                togglesiparis(j7);
                f.icecekhesap = f.icecekhesap + (f.icedlatte * adetsayac.getValue());
                gunceldeger = f.icedlatte;
            }
            if(j8.isSelected() == true)
            {
                togglesiparis(j8);
                f.icecekhesap = f.icecekhesap + (f.icedtea * adetsayac.getValue());
                gunceldeger = f.icedtea;
            }
            if(j9.isSelected() == true)
            {
                togglesiparis(j9);
                f.icecekhesap = f.icecekhesap + (f.vanillacooler * adetsayac.getValue());
                gunceldeger = f.vanillacooler;
            }
            if(j10.isSelected() == true)
            {
                togglesiparis(j10);
                f.icecekhesap  = f.icecekhesap + (f.coffecooler * adetsayac.getValue());
                gunceldeger = f.coffecooler;
            }
            if(j11.isSelected() == true)
            {
                togglesiparis(j11);
                f.icecekhesap = f.icecekhesap + (f.turkcay * adetsayac.getValue());
                gunceldeger = f.turkcay;
            }
            if(j12.isSelected() == true)
            {
                togglesiparis(j12);
                f.icecekhesap = f.icecekhesap + (f.turkkahvesi * adetsayac.getValue());
                gunceldeger = f.turkkahvesi;
            }    
        }
        if(tür == "salata")
        {
            toggletur(togglesalata);
            if(j1.isSelected() == true)
            {
                togglesiparis(j1);
                f.salatahesap = f.salatahesap + (f.pirincsalatasi * adetsayac.getValue());
                gunceldeger = f.pirincsalatasi;
            }
            if(j2.isSelected() == true)
            {
                togglesiparis(j2);
                f.salatahesap = f.salatahesap + (f.ygrtlubiberkavurmasi * adetsayac.getValue());
                gunceldeger = f.ygrtlubiberkavurmasi;
            }
            if(j3.isSelected() == true)
            {
                togglesiparis(j3);
                f.salatahesap = f.salatahesap + (f.ygrtlunohutsalatasi * adetsayac.getValue());
                gunceldeger = f.ygrtlunohutsalatasi;
            }
            if(j4.isSelected() == true)
            {
                togglesiparis(j4);
                f.salatahesap = f.salatahesap + (f.közpatlicansalatasi * adetsayac.getValue());
                gunceldeger = f.közpatlicansalatasi;
            }
            if(j5.isSelected() == true)
            {
                togglesiparis(j5);
                f.salatahesap = f.salatahesap + (f.ygrtlupatatesezmesi * adetsayac.getValue());
                gunceldeger = f.ygrtlupatatesezmesi;
            }
            if(j6.isSelected() == true)
            {
                togglesiparis(j6);
                f.salatahesap = f.salatahesap + (f.salgamlikuskus * adetsayac.getValue());
                gunceldeger = f.salgamlikuskus;
            }
            if(j7.isSelected() == true)
            {
                togglesiparis(j7);
                f.salatahesap = f.salatahesap + (f.patlicanlisos * adetsayac.getValue());
                gunceldeger = f.patlicanlisos;
            }
            if(j8.isSelected() == true)
            {
                togglesiparis(j8);
                f.salatahesap = f.salatahesap + (f.garnitürpatates * adetsayac.getValue());
                gunceldeger = f.garnitürpatates;
            }
            if(j9.isSelected() == true)
            {
                togglesiparis(j9);
                f.salatahesap = f.salatahesap + (f.garnitürmakarna * adetsayac.getValue());
                gunceldeger = f.garnitürmakarna;
            }
            if(j10.isSelected() == true)
            {
                togglesiparis(j10);
                f.salatahesap = f.salatahesap + (f.hibes * adetsayac.getValue());
                gunceldeger = f.hibes;
            }
            if(j11.isSelected() == true)
            {
                togglesiparis(j11);
                f.salatahesap = f.salatahesap + (f.tahinliezme * adetsayac.getValue());
                gunceldeger = f.tahinliezme;
            }
            if(j12.isSelected() == true)
            {
                togglesiparis(j12);
                f.salatahesap = f.salatahesap + (f.mütebbel * adetsayac.getValue());
                gunceldeger = f.mütebbel;
            }
        }
        if(tür == "tatli")
        {
            toggletur(toggletatli);
            if(j1.isSelected() == true)
            {
                togglesiparis(j1);
                f.tatlihesap = f.tatlihesap + (f.tiramisu + adetsayac.getValue());
                gunceldeger = f.tiramisu;
            }
            if(j2.isSelected() == true)
            {
                togglesiparis(j2);
                f.tatlihesap = f.tatlihesap + (f.revani + adetsayac.getValue());
                gunceldeger = f.revani;
            }
            if(j3.isSelected() == true)
            {
                togglesiparis(j3);
                f.tatlihesap = f.tatlihesap + (f.sakizlimuhallebi + adetsayac.getValue());
                gunceldeger = f.sakizlimuhallebi;
            }
            if(j4.isSelected() == true)
            {
                togglesiparis(j4);
                f.tatlihesap = f.tatlihesap + (f.aglayanpasta + adetsayac.getValue());
                gunceldeger = f.aglayanpasta;
            }
            if(j5.isSelected() == true)
            {
                togglesiparis(j5);
                f.tatlihesap = f.tatlihesap + (f.mozaikpasta + adetsayac.getValue());
                gunceldeger = f.mozaikpasta;
            }
            if(j6.isSelected() == true)
            {
                togglesiparis(j6);
                f.tatlihesap = f.tatlihesap + (f.kostebekpasta + adetsayac.getValue());
                gunceldeger = f.kostebekpasta;
            }
            if(j7.isSelected() == true)
            {
                togglesiparis(j7);
                f.tatlihesap = f.tatlihesap + (f.kalburabasti + adetsayac.getValue());
                gunceldeger= f.kalburabasti;
            }
            if(j8.isSelected() == true)
            {
                togglesiparis(j8);
                f.tatlihesap = f.tatlihesap + (f.firinsutlac + adetsayac.getValue());
                gunceldeger = f.firinsutlac;
            }
            if(j9.isSelected() == true)
            {
                togglesiparis(j9);
                f.tatlihesap = f.tatlihesap + (f.waffle + adetsayac.getValue());
                gunceldeger = f.waffle;
            }
            if(j10.isSelected() == true)
            {
                togglesiparis(j10);
                f.tatlihesap = f.tatlihesap + (f.suffle + adetsayac.getValue());
                gunceldeger = f.suffle;
            }
            if(j11.isSelected() == true)
            {
                togglesiparis(j11);
                f.tatlihesap = f.tatlihesap + (f.kazandibi + adetsayac.getValue());
                gunceldeger = f.kazandibi;
            }
            if(j12.isSelected() == true)
            {
                togglesiparis(j2);
                f.tatlihesap = f.tatlihesap + (f.rulopasta + adetsayac.getValue());
                gunceldeger = f.rulopasta;
            }
        }
        if(tür == "arayemek")
        {
            toggletur(togglearayemek);
            if(j1.isSelected() == true)
            {
                togglesiparis(j1);
                 f.arayemekhesap = f.arayemekhesap + (f.sucukluomlet * adetsayac.getValue());  
                 gunceldeger = f.sucukluomlet;
            }
            if(j2.isSelected() == true)
            {
                togglesiparis(j2);
                f.arayemekhesap = f.arayemekhesap + (f.kasarliomlet * adetsayac.getValue());
                gunceldeger = f.kasarliomlet;
            }
            if(j3.isSelected() == true)
            {
                togglesiparis(j3);
                f.arayemekhesap = f.arayemekhesap + (f.sadeomlet * adetsayac.getValue());
                gunceldeger = f.sadeomlet;
            }
            if(j4.isSelected() == true)
            {
                togglesiparis(j4);
                f.arayemekhesap = f.arayemekhesap + (f.karisiktost * adetsayac.getValue());
                gunceldeger = f.karisiktost;
            }
            if(j5.isSelected() == true)
            {
                togglesiparis(j5);
                f.arayemekhesap = f.arayemekhesap + (f.gozleme * adetsayac.getValue());
                gunceldeger = f.gozleme;
            }
            if(j6.isSelected() == true)
            {
                togglesiparis(j6);
                f.arayemekhesap = f.arayemekhesap + (f.sademenemen * adetsayac.getValue());
                gunceldeger = f.sademenemen;
            }
            if(j7.isSelected() == true)
            {
                togglesiparis(j7);
                f.arayemekhesap = f.arayemekhesap + (f.sucuklumenemen * adetsayac.getValue());
                gunceldeger = f.sucuklumenemen;
            }
            if(j8.isSelected() == true)
            {
                togglesiparis(j8);
                f.arayemekhesap = f.arayemekhesap + (f.karisikmenemen * adetsayac.getValue());
                gunceldeger = f.karisikmenemen;
            }
            if(j9.isSelected() == true)
            {
                togglesiparis(j9);
                f.arayemekhesap = f.arayemekhesap + (f.cheeseburger * adetsayac.getValue());
                gunceldeger = f.cheeseburger;
            }
            if(j10.isSelected() == true)
            {
                togglesiparis(j10);
                f.arayemekhesap = f.arayemekhesap + (f.hamburger * adetsayac.getValue());
                gunceldeger = f.hamburger;
            }
            if(j11.isSelected() == true)
            {
                togglesiparis(j11);
                f.arayemekhesap = f.arayemekhesap + (f.tavukburger * adetsayac.getValue());
                gunceldeger = f.tavukburger;
            }
            if(j12.isSelected() == true)
            {
                togglesiparis(j12);                
                f.arayemekhesap = f.arayemekhesap + (f.kumrusandwich * adetsayac.getValue());
                gunceldeger = f.kumrusandwich;                        
            }
        }
    }
    public void toplamhesap()
    {
        if(tab1.isSelected() == true)
        {f.toplamhesap1 =0;
             int i = 0,boyut=masa1table.getItems().size();
         double atama;
                    for(i = 0; i < boyut;i++)
                {
                    String atama2 = masa1table.getColumns().get(4).getCellObservableValue(i).getValue().toString();
                    atama = Double.valueOf(atama2);
                    f.toplamhesap1 = f.toplamhesap1 + atama;
                }
                     m1 = String.valueOf(f.toplamhesap1);
                      toplam1.setText(m1 + " TL");
        }
        if(tab2.isSelected() == true)
        {f.toplamhesap1=0;
             int i = 0,boyut=masa2table.getItems().size();
         double atama;
                    for(i = 0; i < boyut;i++)
                {
                    String atama2 = masa2table.getColumns().get(4).getCellObservableValue(i).getValue().toString();
                    atama = Double.valueOf(atama2);
                    f.toplamhesap1 = f.toplamhesap1 + atama;
                }
                     m1= String.valueOf(f.toplamhesap1);
                      toplam1.setText(m1 + " TL");
        }
        if(tab3.isSelected() == true)
        {f.toplamhesap1=0;
             int i = 0,boyut=masa3table.getItems().size();
             double atama;
                    for(i = 0; i < boyut;i++)
                {
                    String atama2 = masa3table.getColumns().get(4).getCellObservableValue(i).getValue().toString();
                    atama = Double.valueOf(atama2);
                    f.toplamhesap1 = f.toplamhesap1 + atama;
                }
                     m1= String.valueOf(f.toplamhesap1);
                      toplam1.setText(m1 + " TL");
        }
        if(tab4.isSelected() == true)
        {f.toplamhesap1=0;
             int i = 0,boyut=masa4table.getItems().size();
         double atama;
                    for(i = 0; i < boyut;i++)
                {
                    String atama2 = masa4table.getColumns().get(4).getCellObservableValue(i).getValue().toString();
                    atama = Double.valueOf(atama2);
                    f.toplamhesap1 = f.toplamhesap1 + atama;
                }
                     m1= String.valueOf(f.toplamhesap1);
                      toplam1.setText(m1 + " TL");
        }
        if(tab5.isSelected() == true)
        {f.toplamhesap1=0;
             int i = 0,boyut=masa5table.getItems().size();
         double atama;
                    for(i = 0; i < boyut;i++)
                {
                    String atama2 = masa5table.getColumns().get(4).getCellObservableValue(i).getValue().toString();
                    atama = Double.valueOf(atama2);
                    f.toplamhesap1 = f.toplamhesap1 + atama;
                }
                     m1= String.valueOf(f.toplamhesap1);
                     toplam1.setText(m1 + " TL");
        }
        if(tab6.isSelected() == true)
        {f.toplamhesap1=0;
             int i = 0,boyut=masa6table.getItems().size();
         double atama;
                    for(i = 0; i < boyut;i++)
                {
                    String atama2 = masa6table.getColumns().get(4).getCellObservableValue(i).getValue().toString();
                    atama = Double.valueOf(atama2);
                    f.toplamhesap1 = f.toplamhesap1 + atama;
                }
                     m1= String.valueOf(f.toplamhesap1 );
                     toplam1.setText(m1 + " TL");
        }
    }
    public void hesapal_ (ActionEvent event)
    {
        if(f.toplamhesap1 != 0)
        JOptionPane.showMessageDialog(null,"Yine Bekleriz :) ");
        f.anakasa += f.toplamhesap1;
        if(tab1.isSelected() == true)
        masa1table.getItems().clear();
        else if(tab2.isSelected() == true)
        masa2table.getItems().clear();
        else if(tab3.isSelected() == true)
        masa3table.getItems().clear();
        else if(tab4.isSelected() == true)
        masa4table.getItems().clear();
        else if(tab5.isSelected() == true)
        masa5table.getItems().clear();
        else if(tab6.isSelected() == true)
        masa6table.getItems().clear();        
        toplamhesap();
    }
    public void kasa_(ActionEvent event)
    {
        JOptionPane.showMessageDialog(null,"Kasadaki Miktar " +f.anakasa + " TL");
    }
    public void hesapla_ (ActionEvent event)
    {
        if(masadegisken == 1)
        {
            islem();  
            data1.add(new hesap1(türcagir,yemekcagir, a,gunceldeger,gunceldeger*a));
            masa1table.setItems(data1); 
        }
        if(masadegisken == 2)
        {
            islem();
            data2.add(new hesap1(türcagir,yemekcagir, a,gunceldeger,gunceldeger*a));
            masa2table.setItems(data2);
        }
        if(masadegisken == 3)
        {
            islem();
            data3.add(new hesap1(türcagir,yemekcagir, a,gunceldeger,gunceldeger*a));
            masa3table.setItems(data3);
        }
        if(masadegisken == 4)
        {
            islem();
            data4.add(new hesap1(türcagir,yemekcagir, a,gunceldeger,gunceldeger*a));
            masa4table.setItems(data4);
        }
        if(masadegisken == 5)
        {
            islem();
            data5.add(new hesap1(türcagir,yemekcagir, a,gunceldeger,gunceldeger*a));
            masa5table.setItems(data5);
        }
        if(masadegisken == 6)
        {
            islem();
            data6.add(new hesap1(türcagir,yemekcagir, a,gunceldeger,gunceldeger*a));
            masa6table.setItems(data6);
        }
        f.anayemekhesap = 0;
        f.icecekhesap = 0;
        f.arayemekhesap = 0;
        f.tatlihesap = 0;
        f.salatahesap = 0;
    }
}
