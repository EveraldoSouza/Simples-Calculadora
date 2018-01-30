package br.com.projcalc.calcular;

import br.com.projcalc.entidades.Atributoscalc;
import javax.swing.JOptionPane;

    public class DCalcular {
        public boolean Adicao(Atributoscalc calc){
            
            double Total = calc.getValor1() + calc.getValor2();
            JOptionPane.showMessageDialog(null, "Resultado "+ calc.getValor1() +" + "+ calc.getValor2() +" = "+ Total);
            return true;
        }
        public boolean Subtracao(Atributoscalc calc){
            
            double Total = calc.getValor1() - calc.getValor2();
            JOptionPane.showMessageDialog(null, "Resultado "+ calc.getValor1() +" - "+ calc.getValor2() +" = "+ Total);
            return true;
        }
        public boolean Multiplicacao(Atributoscalc calc){
            
            double Total = calc.getValor1() * calc.getValor2();
            JOptionPane.showMessageDialog(null, "Resultado "+ calc.getValor1() +" * "+ calc.getValor2() +" = "+ Total);
            return true;
        }
        public boolean Divisao(Atributoscalc calc){
            if(calc.getValor2() != 0){
                double Total = calc.getValor1() / calc.getValor2();
                JOptionPane.showMessageDialog(null, "Resultado "+ calc.getValor1() +" / "+ calc.getValor2() +" = "+ Total);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Divisão por ZERO");
            }
            return false;
        }
    }
