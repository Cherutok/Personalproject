/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Charity Cheruto
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javafx.application.Application;
import  javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Chart extends JFrame {
    //use of a container
    Container container=getContentPane();
    JButton add1=new JButton("Add new user");
    JButton add2= new JButton("cancel");
    
    
    
      
   final static String one="18-25";
    final static String two= "19-25";
    final static String three= "26-30";
    final static String four= "30-95";
    
    public Chart(){
    addComponentsToContainer();
    setLayoutManager();
    setLocationAndSize();
    

    ButtonHandler handler= new ButtonHandler() {
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    add1.addActionListener(handler);
    
    }
    
    public void setLayoutManager(){
    container.setLayout(null);
    }
    public void addComponentsToContainer(){
    container.add(add1);
    container.add(add2);
    }
    
    public void setLocationAndSize(){
    add1.setBounds(50,300,100,30);
    add2.setBounds(200,300,100,30);
    }
    
    public class analyticsbar extends Application {
    @Override public void start(Stage stage){
         Scene scene=new Scene(new Group());
          
         stage.setTitle("Analytics");
         stage.setWidth(500);
         stage.setHeight(500);
         
         ObservableList<PieChart.Data> pieChartData=
                 FXCollections.observableArrayList(
                 new PieChart.Data("Female",20),
                 new PieChart.Data("Male",60));
         final PieChart chart= new PieChart(pieChartData);
         chart.setTitle("Chart showing gender balance");
         
         
     
                
     
    
    final CategoryAxis xAxis= new CategoryAxis();
    final NumberAxis yAxis= new NumberAxis();
    final BarChart<String,Number> bc= new BarChart<String,Number>(xAxis,yAxis);
    bc.setTitle("Chart showing age distribution");
    xAxis.setLabel("Age");
    yAxis.setLabel("Age");
    
    XYChart.Series you= new XYChart.Series();
    you.getData().add(new XYChart.Data(one,10.20));
    you.getData().add(new XYChart.Data(two,30.60));
    you.getData().add(new XYChart.Data(three,50.40));
    you.getData().add(new XYChart.Data(four,50.50));
    
    
    bc.getData().addAll(you);
    stage.setScene(scene);
    stage.show();
    ((Group) scene.getRoot()).getChildren().add(chart);
         stage.setScene(scene);
         stage.show();
         
    }      
    }
         
     
       public static void main(String[] args) {
         JFrame myFrame= new JFrame("Analytics");
         myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         myFrame.setResizable(false);
     
       }
    
    private abstract class ButtonHandler implements ActionListener{
      public void actionPerfomed(ActionEvent event){
      String msg;
      if(add1=123){
      msg="Add new User window";
      JOptionPane.showMessageDialog(null,msg);
      JFrame secondFrame= new JFrame("Add new user");
      secondFrame.setSize(200,100);
      secondFrame.setVisible(true);
      
      }
      }
         
         
          
          
}
    
}
