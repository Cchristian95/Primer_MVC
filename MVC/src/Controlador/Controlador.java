
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
 
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("MVC multiplicar");
        //para que abra al centro de la pantalla
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        //trae la informacion de la cajas txt
        model.setNum1(Integer.parseInt(view.txtNum1.getText()));
        model.setNum2(Integer.parseInt(view.txtNum2.getText()));
        model.multiplicar();
        view.txtTotal.setText(String.valueOf(model.getResult()));
    }
    
    
    
    
}
