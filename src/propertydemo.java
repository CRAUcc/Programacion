import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
 
class Billes {
 
    // Define a variable to store the property
    private  DoubleProperty amountDue = new SimpleDoubleProperty();
 
    // Define a getter for the property's value
    public  double getAmountDue(){return amountDue.get();}
 
    // Define a setter for the property's value
    public  void setAmountDue(double value){amountDue.set(value);}
 
     // Define a getter for the property itself
    public DoubleProperty amountDueProperty() {return amountDue;}
 
}

public class propertydemo {
 
    public static void main(String[] args) {
 
      Billes electricBill = new Billes();
 
       electricBill.amountDueProperty().addListener(new ChangeListener(){
        @Override public void changed(ObservableValue o,Object oldVal, 
                 Object newVal){
             System.out.println("Ha cambiado Electric bill");
        }
      });
     
      electricBill.setAmountDue(100.00);
     
    }
}