/**
 * @author Roberto-Network
 */
//Mismo funcionamiento que el 5
package Ejercicio7;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio7 extends Frame {
    int contador = 0;
    public static void main(String[] args) {
        Ejercicio7 a =  new Ejercicio7();
    }
    public Ejercicio7() {
        this.setSize(400,80);
        this.setTitle("ejercicio7");
        Panel panel = new Panel(new GridLayout(1,4));
        this.add(panel);
        setResizable(false);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        TextArea text = new TextArea("\n"+"0",1,10,TextArea.SCROLLBARS_NONE);
        text.setEditable(false);
        Button cont = new Button("Contador1");
        Button cont2 = new Button("Contador2");
        cont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                contador ++;
                text.setText("\n"+String.valueOf(contador));
            }
        });
        cont2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                contador ++;
                text.setText("\n"+String.valueOf(contador));
            }
        });
        panel.add(new Label("Contador:"));
        panel.add(text);
        panel.add(cont);
        panel.add(cont2);
    }
    
}
