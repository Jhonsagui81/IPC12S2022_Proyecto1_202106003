package proyecto1;

import java.time.LocalDateTime;

public class Cuentas {
    // atributos
    private int idCuenta;
    private double SaldoCuenta;
    Historial  operacion [] = new Historial[20]; 
    int ContadorTransacciones;
    
    
    //constructores
    

    public Cuentas() {
        
    }

    public Cuentas(int idCuenta) {
        this.idCuenta = (idCuenta+1);
        this.ContadorTransacciones = 0;
    }
    //METODOS
    
    public void AsociarOperacion(int idHistorial, LocalDateTime fechaHoraActuales, String Descripcion, double MontoDebitado, double MontoAcreditado, double saldoActual){
        if(ContadorTransacciones < operacion.length){
            operacion[ContadorTransacciones] = new Historial(idHistorial, fechaHoraActuales, Descripcion, MontoDebitado, MontoAcreditado, saldoActual);
            ContadorTransacciones++;
        }
    }
    
    public void retirarSaldo(double SaldoCuenta){
        this.SaldoCuenta -= SaldoCuenta;
    }
    
    //get y set
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getSaldoCuenta() {
        return SaldoCuenta;
    }
    
    public void setSaldoCuenta(double SaldoCuenta) {
        this.SaldoCuenta += SaldoCuenta;
    }
}
