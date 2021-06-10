/**
 * @author Roberto-Network
 */

package Ejercicio2;

import java.awt.*;
import java.awt.event.*;
public class ejercicio2 extends Frame {
    public static void main(String[] args) {
        ejercicio2 a = new ejercicio2();
    }
    public ejercicio2() {
        this.setSize(600,500);
        this.setTitle("ejercicio2");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        Panel panel = new Panel(new GridLayout(1,2));
        this.add(panel);
        Panel pantalla = new Panel(new GridLayout(6,1));
        panel.add(pantalla);
        Panel pan1 = new Panel(new GridLayout(2,2));
        pantalla.add(pan1);
        pan1.add(new Label("Nombre:"));
        pan1.add(new TextField());
        pan1.add(new Label("Movil:"));
        pan1.add(new TextField());
        Panel pan2 = new Panel(new GridLayout(1,3));
        pantalla.add(pan2);
        pan2.add(new Label("Genero:"));
        pan2.add(new Checkbox("Hombre"));
        pan2.add(new Checkbox("Mujer"));
        Panel pan3 = new Panel(new GridLayout(1,4));
        pantalla.add(pan3);
        pan3.add(new Label("DOB"));
        Choice dias= new Choice();
        for (int i = 1; i < 32; i++) {
            dias.add("" + i);
        }
        Choice meses= new Choice();
        for (int i = 1; i < 13; i++) {
            meses.add("" + i);
        }
        Choice años= new Choice();
        for (int i = 1900; i < 2021; i++) {
            años.add("" + i);
        }
        pan3.add(dias);
        pan3.add(meses);
        pan3.add(años);
        Panel pan4 = new Panel(new GridLayout(1,2));
        pantalla.add(pan4);
        pan4.add(new Label("Direccion"));
        pan4.add(new TextField());
        Panel pan5 = new Panel(new GridLayout(1,1));
        pantalla.add(pan5);
        pan5.add(new Checkbox("Acepto los terminos y condiciones"));
        Panel pan6 = new Panel(new GridLayout(1,2));
        pantalla.add(pan6);
        pan6.add(new Button("Enviar"));
        pan6.add(new Button("Limpiar"));
        panel.add(new TextArea("",100,100,TextArea.SCROLLBARS_NONE));
        this.setVisible(true);
    }
}
