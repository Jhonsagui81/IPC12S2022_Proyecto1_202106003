package proyecto1;

import javax.swing.JOptionPane;

public class Clientes {

    //Atributos 
    private int DPI;
    private String Apellido;
    private String nombre;
    Cuentas[] cuentaAsociada = {new Cuentas(), new Cuentas(), new Cuentas(), new Cuentas(), new Cuentas()};
    private int contadorCuentas;

    //constructor vacio
    public Clientes() {

    }

    //constructor 
    public Clientes(int DPI, String Apellido, String nombre) {
        this.DPI = DPI;
        this.Apellido = Apellido;
        this.nombre = nombre;
        this.contadorCuentas = 0;
    }

    //METODOS PARA CLIENTES
    public void AsociarCuenta(int id) {
        if (contadorCuentas < cuentaAsociada.length) {
            cuentaAsociada[contadorCuentas] = new Cuentas(id);
            JOptionPane.showMessageDialog(null, "Cuenta asociada exitosamente.");
            contadorCuentas++;
        } else {
            JOptionPane.showMessageDialog(null, "Este cliente llego al limite de cuentas asociadad.");
        }
    }

    //get and set
    public int getContadorCuentas() {
        return contadorCuentas;
    }

    public void setContadorCuentas(int contadorCuentas) {
        this.contadorCuentas = contadorCuentas;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuentas[] getCuentaAsociada() {
        return cuentaAsociada;
    }

    public void setCuentaAsociada(Cuentas[] cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }

}
