package ejercicio2507;
import javax.swing.JOptionPane;

            //Idea - Hacer un metodo menu al cual se regrese
public class Ejercicio2507 {

    public static void main(String[] args) {
        boolean valor=false;
            //Despliegue de menu, se utliza variable tipo int porque solo se requiere un numero al usuario
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese únicamente el numero correspondiente a"
                + " la opcion que desea\n1. ¿Qué es Java?\n2. Variables-operadores\n3. Condicionales\n"
                + "4. Ciclos\n5. Arreglos\n6. Funciones-procedimientos","menu"));
        System.out.println("User selection #"+op); // Desde consola visualiza lo que se ingresa; sólo por propositos de control. 
            //A traves de un concidional se evalua lo que el usuario ha pedido y se despliqega la informacion
        switch(op){
            //Solo muestra informacion
            case 1: JOptionPane.showMessageDialog(null,"Java es un IDE. Por sus siglas en inglés Integrated Development Environment,"
                    + " que traducido significa Entorno de Desarrollo Integrado."); break;
            //Pide informacion para una variable String
            case 2: String palabra=JOptionPane.showInputDialog(null, "Ingresa una palabra para que sea desplegada en consola:");
                    System.out.println(palabra);
                    JOptionPane.showMessageDialog(null, "Asi se guarda la variable"); 
                    break;
            //Working on it...
            case 3: int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Si el numero que ingresas es mayor que 10, te lo diré","dilo"));
                    if(num>10) {
                        JOptionPane.showMessageDialog(null, "Tu numero "+num+" es mayor que 10");
                        valor=true;
                    }
                    else JOptionPane.showMessageDialog(null,"Tu numero "+num+" es menor que 10"); break;
                    //if(valor==true)System.out.println("El valor fue mayor que 10");
            //Trabaja un ciclo for que cuente hasta un numero x, no mayor a 5 que digite el usuario
            case 4: int cic;
                do{
                cic=Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un numero menor que 6 para contar"));
            }while(cic>6); //Me aseguro que ingrese un numero que necesito
                for(int i=1;i<cic+1;i++)JOptionPane.showMessageDialog(null, "Vamos por el numero "+i+" de la cuenta");
                    break;
            case 5: break;
            case 6: break;
        }
    }   
}