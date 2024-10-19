package procesadorDeTextos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlFuente {

    private JMenu fuente;
    private LaminaProcesador lamina;

    public ControlFuente(LaminaProcesador lamina) {
        
    	this.lamina = lamina;
        fuente = new JMenu("Fuente");

        // Agregar varias fuentes populares
        configuraMenuFuente("Arial");
        configuraMenuFuente("Courier");
        configuraMenuFuente("Verdana");
        configuraMenuFuente("Times New Roman");
        configuraMenuFuente("Georgia");
        configuraMenuFuente("Monospaced");
        configuraMenuFuente("Serif");
        configuraMenuFuente("SansSerif");
        
    }

    public JMenu getMenuFuente() {
        
    	return fuente;
    	
    }

    private void configuraMenuFuente(String nombre) {
        
    	JMenuItem elem_menu = new JMenuItem(nombre);
        fuente.add(elem_menu);

        elem_menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lamina.setTipoLetraActual(nombre);
                lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
            }
        });
        
    }
    
}