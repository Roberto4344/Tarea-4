/**
 * @author Roberto-Network
 */
//Para que funcione hay que minimizar y seclecionar nuevamente la ventana
package Ejercicio5;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio5 extends Frame {
    int contador = 0;

    public static void main(String[] args) {
        Ejercicio5 a =  new Ejercicio5();
    }
    public Ejercicio5() {
        this.setSize(300,80);
        this.setTitle("ejercicio5");
        Panel panel = new Panel(new GridLayout(1,3));
        this.add(panel);
        setResizable(false); //Para que no se pueda reescalar la ventada
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        TextArea text = new TextArea("\n"+ "0",1,10,TextArea.SCROLLBARS_NONE);
        text.setEditable(false);
        Button cont = new Button("Cuenta");
        
        cont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                contador ++;
                text.setText("\n"+String.valueOf(contador));
            }
        });
        panel.add(new Label("Contador:"));
        panel.add(text);
        panel.add(cont);
    }
    
}
