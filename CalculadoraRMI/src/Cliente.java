import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {
        int puerto = 8080;
        String servidor = "localhost";
        try {

            Calculadora calc = (Calculadora) Naming.lookup("rmi://" + servidor + ":" + puerto + "/Calculadora");
            while (true) {
                String opt = JOptionPane.showInputDialog(
                    "Calcular\n" +
                        "Suma ---------------- (1)\n" + 
                        "Resta ----------------(2))\n" + 
                        "Multiplicacion ------ (3)\n" + 
                        "Division ------------ (4)\n" +
                        "Cancelar para salir"   
                );
                if (opt == null) {
                    break;
                }
    
                int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa a"));
                
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa b"));
            
                switch (opt) {
                    case "1":
                        JOptionPane.showMessageDialog(null, a + "+" + b + " = " + calc.sum(a, b));
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null, a + "-" + b + " = " + calc.res(a, b));
                        break;
                    case "3":
                    JOptionPane.showMessageDialog(null, a + "*" + b + " = " + calc.mul(a, b));
                        break;
                    case "4":
                    JOptionPane.showMessageDialog(null, a + "/" + b + " = " + calc.div(a, b));
                    default:
                        break;
                }
            }
        }
        catch (RemoteException | NotBoundException ep) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a; servodpr: \n" + ep);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "La URL esta en formato incorrecto\n" + ex);
        } 
    }
}
