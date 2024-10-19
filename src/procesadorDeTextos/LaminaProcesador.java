package procesadorDeTextos;

import javax.swing.*;
import java.awt.*;

public class LaminaProcesador extends JPanel {

    private JTextPane miarea;
    private String tipo_letra_actual = "Arial";
    private int tamaño_letra_actual = 12;
    private int estilo_letra_actual = Font.PLAIN;

    public LaminaProcesador() {
        
    	setLayout(new BorderLayout());

        // Área de texto
        miarea = new JTextPane();
        miarea.setFont(new Font(tipo_letra_actual, estilo_letra_actual, tamaño_letra_actual));
        add(new JScrollPane(miarea), BorderLayout.CENTER);

        // Menú de opciones
        JMenuBar mibarra = new JMenuBar();

        // Controles de fuente, estilo y tamaño
        ControlFuente controlFuente = new ControlFuente(this);
        ControlEstilo controlEstilo = new ControlEstilo(this);
        ControlTamano controlTamaño = new ControlTamano(this);

        // Añadir los menús al menú principal
        mibarra.add(controlFuente.getMenuFuente());
        mibarra.add(controlEstilo.getMenuEstilo());
        mibarra.add(controlTamaño.getMenuTamaño());

        // Panel superior con menú
        JPanel laminamenu = new JPanel();
        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);

        // Botón para elegir el color de fondo
        JButton elegirColorFondo = new JButton("Elegir Color de Fondo");
        elegirColorFondo.addActionListener(e -> {
            Color color = JColorChooser.showDialog(null, "Elige un color de fondo", miarea.getBackground());
            if (color != null) {
                miarea.setBackground(color);
            }
        });
        add(elegirColorFondo, BorderLayout.SOUTH);
        
    }

    // Método para actualizar el estilo del texto
    public void actualizarEstiloTexto(String tipo_letra, int estilo_letra, int tamaño_letra) {
        miarea.setFont(new Font(tipo_letra, estilo_letra, tamaño_letra));
    }

    public String getTipoLetraActual() {
        return tipo_letra_actual;
    }

    public void setTipoLetraActual(String tipo_letra_actual) {
        this.tipo_letra_actual = tipo_letra_actual;
    }

    public int getTamañoLetraActual() {
        return tamaño_letra_actual;
    }

    public void setTamañoLetraActual(int tamaño_letra_actual) {
        this.tamaño_letra_actual = tamaño_letra_actual;
    }

    public int getEstiloLetraActual() {
        return estilo_letra_actual;
    }

    public void setEstiloLetraActual(int estilo_letra_actual) {
        this.estilo_letra_actual = estilo_letra_actual;
    }
    
}