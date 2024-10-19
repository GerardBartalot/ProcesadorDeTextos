package procesadorDeTextos;

import javax.swing.*;

public class ProcesadorTextos extends JFrame {

    private static final long serialVersionUID = 1163141512749148249L;

    public ProcesadorTextos() {
        
    	setBounds(300, 300, 600, 400);
        LaminaProcesador milamina = new LaminaProcesador();
        add(milamina);
        setVisible(true);
        
    }
    
}