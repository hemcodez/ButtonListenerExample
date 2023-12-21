import java.awt.event.*;
import javax.swing.*;
public class ButtonListenerExample {

    public static void main(String[] args) {

        //Create the JFrame
        JFrame f=new JFrame("Button Example");

        //Create a new text field & set the size & position of it
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 350,20);

        //Create a new button & set the size & position of it
        JButton b=new JButton("Click Here");
        b.setBounds(50,100,95,30);

        //Add an action listener to the button
        //The listener "listens" for a button click and performs
        //an action when it hears the user click the button.
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Set the text of the label when the button is clicked
                tf.setText("Welcome to Summit Academy OIC!");
            } //end method
        }); //end listener

        //Add the button & the textfield to the JFrame
        f.add(b);
        f.add(tf);

        //Set the size, set layout to none, and make the JFrame visible.
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    } //end main method
} //end class}
