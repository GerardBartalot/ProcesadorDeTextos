package procesadorDeTextos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlTamano {

    private JMenu tamano;
    private LaminaProcesador lamina;

    public ControlTamano(LaminaProcesador lamina) {
        
    	this.lamina = lamina;
        tamano = new JMenu("Tamaño");

        // RadioButtons para el tamaño de letra
        ButtonGroup tamanoGrupo = new ButtonGroup();
        JRadioButton diez = new JRadioButton("10");
        JRadioButton doce = new JRadioButton("12");
        JRadioButton catorce = new JRadioButton("14");
        JRadioButton dieciseis = new JRadioButton("16");
        JRadioButton dieciocho = new JRadioButton("18");
        JRadioButton veinte = new JRadioButton("20");

        // ActionListeners para los tamaños
        diez.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lamina.setTamañoLetraActual(10);
                lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
            }
        });

        doce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lamina.setTamañoLetraActual(12);
                lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
            }
        });

        catorce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lamina.setTamañoLetraActual(14);
                lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
            }
        });

        dieciseis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lamina.setTamañoLetraActual(16);
                lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
            }
        });

        dieciocho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lamina.setTamañoLetraActual(18);
                lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
            }
        });

        veinte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lamina.setTamañoLetraActual(20);
                lamina.actualizarEstiloTexto(lamina.getTipoLetraActual(), lamina.getEstiloLetraActual(), lamina.getTamañoLetraActual());
            }
        });

        // Añadir los botones al grupo de botones
        tamanoGrupo.add(diez);
        tamanoGrupo.add(doce);
        tamanoGrupo.add(catorce);
        tamanoGrupo.add(dieciseis);
        tamanoGrupo.add(dieciocho);
        tamanoGrupo.add(veinte);

        // Añadir los botones al menú de tamaño
        tamano.add(diez);
        tamano.add(doce);
        tamano.add(catorce);
        tamano.add(dieciseis);
        tamano.add(dieciocho);
        tamano.add(veinte);
        
    }

    public JMenu getMenuTamaño() {
        
    	return tamano;
    	
    }
    
}