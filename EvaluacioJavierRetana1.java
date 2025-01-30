/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluaciojavierretana1;

import javax.swing.JOptionPane;

/**
 *
 * @author jareg
 */
public class EvaluacioJavierRetana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String salarioMensual = "";
        double salarioMensualdouble;
        double salarioMensualMontodeSEM;
        double salarioMensualMontodeIVM;
        
        salarioMensual = JOptionPane.showInputDialog("Digite su salario Mensual");

        salarioMensualdouble = Double.parseDouble(salarioMensual);

        salarioMensualMontodeSEM = salarioMensualdouble * 0.0925;
        salarioMensualMontodeIVM = salarioMensualdouble * 0.0508;

        string Deuda = "";

        Deuda = salarioMensualMontodeSEM + salarioMensualMontodeIVM
        
        JOptionPane.showMessageDialog(null, "El monto a pagar es de: " + Deuda + "\n");
                
        

    }
    
}
