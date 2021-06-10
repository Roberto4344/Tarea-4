/**
 *  @author Roberto-Network
 */

package Ejercicio3;

import java.awt.*;
import java.awt.event.*;
public class ejercicio3 extends Frame{
    public static void main(String[] args) {
        ejercicio3 a =  new ejercicio3();
    }
    public ejercicio3() {
        this.setSize(600,300);
        this.setTitle("ejercicio3");
        Panel panel = new Panel(new GridLayout(2,1));
        this.add(panel);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        Label cambio = new Label("Aqui se mostrará el boton seleccinado");
        cambio.setAlignment(Label.CENTER);
        panel.add(cambio);
        Panel panbut = new Panel(new FlowLayout());
        Button number1 = new Button("Number1");
        number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambio.setText("Numer1");
            }
        });
        Button number2 = new Button("Number2");
        number2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambio.setText("Number2");
            }
        });
        panbut.add(number1);
        panbut.add(number2);
        panel.add(panbut);
    }
}
