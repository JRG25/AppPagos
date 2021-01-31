package pe.ds.pagoapp.dto;

public class PagoDto {
    
    //datos
    private int horasTrabajadas;
    private double pagoxHora;
    private int cantidadHijos;
    //datos d e salida
    private double salario;
    private double asignacion;
    private double bono;
    private double ingresos;
    private double renta;
    private double salarioNeto;

    public PagoDto() {
    }

    public PagoDto(int horasTrabajadas, double pagoxHora, int cantidadHijos) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoxHora = pagoxHora;
        this.cantidadHijos = cantidadHijos;
    }

    public PagoDto(int horasTrabajadas, double pagoxHora, int cantidadHijos, double salario, double asignacion, double bono, double ingresos, double renta, double salarioNeto) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoxHora = pagoxHora;
        this.cantidadHijos = cantidadHijos;
        this.salario = salario;
        this.asignacion = asignacion;
        this.bono = bono;
        this.ingresos = ingresos;
        this.renta = renta;
        this.salarioNeto = salarioNeto;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoxHora() {
        return pagoxHora;
    }

    public void setPagoxHora(double pagoxHora) {
        this.pagoxHora = pagoxHora;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(double asignacion) {
        this.asignacion = asignacion;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
}
