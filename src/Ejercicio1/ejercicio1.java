
/** 
 * @author Roberto-Network
 */


package Ejercicio1;

import java.awt.*;
import java.awt.event.*;
public class ejercicio1 extends Frame{
    public static void main(String[] args) throws Exception {
        ejercicio1 a = new ejercicio1();
    }

    public ejercicio1() {
        this.setSize(600,600);
        this.setTitle("ejercicio1");
        Panel panel = new Panel(new GridLayout(4,4));
        this.add(panel);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        for (int i = 1; i < 21; i++) {
            if (i == 1) {
                Panel pan1 = new Panel(new GridLayout(2,2));
                panel.add(pan1);
                pan1.add(new Button("A"));
                pan1.add(new Button("B"));
                pan1.add(new Button("C"));
                pan1.add(new Button("D"));
            } else if (i == 5 || i == 10 || i == 15 || i == 20) {
                Panel pan2 = new Panel(new GridLayout(1,2));
                panel.add(pan2);
                pan2.add(new Button("A"));
                pan2.add(new Button("B"));
            } else if (i == 7 || i == 13) {
                Panel pan3 = new Panel(new GridLayout(3,1));
                panel.add(pan3);
                pan3.add(new Button("A"));
                pan3.add(new Button("B"));
                pan3.add(new Button("C"));
            } else if (i == 19) {
                Panel pan4 = new Panel(new BorderLayout());
                panel.add(pan4);
                pan4.add(new Button("A"),BorderLayout.NORTH);
                pan4.add(new Button("B"),BorderLayout.WEST);
                pan4.add(new Button("C"),BorderLayout.CENTER);
                pan4.add(new Button("D"),BorderLayout.EAST);
                pan4.add(new Button("E"),BorderLayout.SOUTH);
            } else {
                panel.add(new Button("" + i));
            }
            
        }
        this.setVisible(true);
    }
}
