
package com.devteam.restricciones;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Anthony
 * @version 1.0, 26/05/15
 * 
 * La clase LetrasODigitos ha sido creada con el fin de restringir 
 * la escritura de caracteres(letras) o dígitos en un JTextField.
 * 
 */
public class LetrasODigitos{

    private JTextField jtfLetra;

    public LetrasODigitos(JTextField jtfLetra) {
        this.jtfLetra = jtfLetra;
    }
        
    public static void soloLetras(JTextField jtfLetra){
        jtfLetra.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent ke_event){
                char charLetra = ke_event.getKeyChar();
                if(Character.isDigit(charLetra)){
                    Toolkit.getDefaultToolkit().beep();
                    ke_event.consume();
                }
            }
        });
    }
    
    public static void soloDigitos(JTextField jtfLetra){
        jtfLetra.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent ke_evento){
                char charLetra = ke_evento.getKeyChar();
                if(Character.isLetter(charLetra) || Character.isSpaceChar(charLetra)){
                    Toolkit.getDefaultToolkit().beep();
                    ke_evento.consume();
                }
            }
        });
    }    
    
}
