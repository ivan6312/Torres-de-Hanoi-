package Logica;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Clase que representa una torre en el juego de torres de Hanoi 
 * @author Dagoberto Ivan Arroyo Obando.
 */
public class Torre extends JPanel {

    /**
     * Constructor de la clase torre
     */
    public Torre() {
        this.setLayout(null);
    }

    /**
     * Metodo que dibuja la torre en el panel
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLACK);
        
        //base
        g.fillRect(10, 270, 200,5);
        
        //asta
        g.fillRect(110, 30, 5, 240);
        
    }
}
