package Vehiculos;

/**
 *
 * @author jhoze
 */
public class Vihiculos {
    private String tipo;
    private String placa;
    private String marca;
    private double peaje;

    public Vihiculos(String tipo, String placa, String marca, double peaje) {
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
        this.peaje = peaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeaje() {
        return peaje;
    }

    public void setPeaje(double peaje) {
        this.peaje = peaje;
    }

    @Override
    public String toString() {
        return "{\n" +"\""+ tipo + "\""+":{\n \"placa\":" + placa + "\","+ "\n \"marca\":"+  marca + "\","+ "\n \"valor\":" + peaje + "\n }"+"\n}";
    }
    
    
}
