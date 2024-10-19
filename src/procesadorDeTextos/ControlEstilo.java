package procesadorDeTextos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlEstilo {

    private JMenu estilo;
    private JCheckBox negrita, cursiva;
    private LaminaProcesador lamina;

    public ControlEstilo(LaminaProcesador lamina) {
        
    	this.lamina = lamina;
        estilo = new JMenu("Estilo");

        // Negrita y cursiva
        negrita = new JCheckBox("Negrita");
        cursiva = new JCheckBox("Cursiva");

        negrita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarEstilo();
            }
        });

        cursiva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarEstilo();
            }
        });

        estilo.add(negrita);
        estilo.add(cursiva);
    }

    public JMenu getMenuEstilo() {
        
    	return estilo;
    	
    }

    private void actualizarEstilo() {
        
    	int estilo_actual = Font.PLAIN;
        if (negrita.isSelected()) estilo_actual |= Font.BOLD;
        if (cursiva.isSelected()) estilo_actual |= Font.ITALIC;

        lamina.setEstiloLetraActual(estilo_actual);
        lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
        
    }
    
}