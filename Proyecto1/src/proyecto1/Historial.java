package proyecto1;

import java.time.LocalDateTime;

public class Historial {
    private int idHistorial;
    private LocalDateTime fechaHoraActuales;
    private String Descripcion;
    private double MontoDebitado;
    private double MontoAcreditado;
    private double saldoActual;
   

    //Atributos
    public Historial(int idHistorial, LocalDateTime fechaHoraActuales, String Descripcion, double MontoDebitado, double MontoAcreditado, double saldoActual) {
        this.idHistorial = (idHistorial+1);
        this.fechaHoraActuales = fechaHoraActuales;
        this.Descripcion = Descripcion;
        this.MontoDebitado = MontoDebitado;
        this.MontoAcreditado = MontoAcreditado;
        this.saldoActual = saldoActual;
    }

    //Constructores
    Historial(int idHistorial) {
        this.idHistorial = (idHistorial + 1);
    }

    /**
     * @return the idHistorial
     */
    public int getIdHistorial() {
        return idHistorial;
    }

    /**
     * @param idHistorial the idHistorial to set
     */
    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    /**
     * @return the fechaHoraActuales
     */
    public LocalDateTime getFechaHoraActuales() {
        return fechaHoraActuales;
    }

    /**
     * @param fechaHoraActuales the fechaHoraActuales to set
     */
    public void setFechaHoraActuales(LocalDateTime fechaHoraActuales) {
        this.fechaHoraActuales = fechaHoraActuales;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the MontoDebitado
     */
    public double getMontoDebitado() {
        return MontoDebitado;
    }

    /**
     * @param MontoDebitado the MontoDebitado to set
     */
    public void setMontoDebitado(double MontoDebitado) {
        this.MontoDebitado = MontoDebitado;
    }

    /**
     * @return the MontoAcreditado
     */
    public double getMontoAcreditado() {
        return MontoAcreditado;
    }

    /**
     * @param MontoAcreditado the MontoAcreditado to set
     */
    public void setMontoAcreditado(double MontoAcreditado) {
        this.MontoAcreditado = MontoAcreditado;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    



    
}
