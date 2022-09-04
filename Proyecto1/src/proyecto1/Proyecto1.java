package proyecto1;

import javax.swing.JOptionPane;

public class Proyecto1 {

    static int ContadorCuentas = 0; // Para  Cuentas
    static int ContadorOperaciones = 0; // Para Historial
    private static int contador; //para guardar clientes en distintas posiciones de array
    static int contador1 = 0; //tiene la cantidad de personas registradas
    
    private static Clientes clientes[] = new Clientes[5];

    public static void main(String[] args) {
        //creando arreglo de personas
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Clientes();
            //creara metodo para guardar 
        }
        contador = 0;
        
//         Crear y llamar la ventana de inicio
        HomePage ventanaInicio = new HomePage(clientes);
        ventanaInicio.setVisible(true);
    }

    //Mettodo para guardar clientes
    public static void guardar(String nombre, String apellido, int dpi) {
        try {
            //asignacion de datos a los clientes
            clientes[contador].setNombre(nombre);
            clientes[contador].setApellido(apellido);
            clientes[contador].setDPI(dpi);

            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
            contador++;
            contador1++; //pendiente revision 

        } catch (Exception ex) {
            //Saldra esto cuando ya existan 5 clientes y desea agregar otro
            JOptionPane.showMessageDialog(null, "NO SE PUEDE AGREGAR MAS CLIENTES");
        }
    }

    //metodo para verificar si dpi es duplicado
    public static boolean dpiDuplicado(int dpi) {
        boolean duplicado = false;
        for (int i = 0; i < 5; i++) {
            //si alguna de los datos guardados es igual al parametro EL DPI ES REPETIDO
            if (clientes[i].getDPI() == dpi) {
                duplicado = true;
            }
        }
        return duplicado;
    }
}
