package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_2 {
    // los atributos
    private String  fechaInicial;
    private String  nombreCiudad;
    private String  constructora;
    private String  nombreLider;
    private Integer codigoTipo;
    private Integer estrato;

    // constructores 
    public Requerimiento_2() {
    }

    

    public Requerimiento_2(String fechaInicial, String nombreCiudad, String constructora, String nombreLider, Integer codigoTipo, Integer estrato) {
        this.fechaInicial = fechaInicial;
        this.nombreCiudad = nombreCiudad;
        this.constructora = constructora;
        this.nombreLider  = nombreLider;
        this.codigoTipo   = codigoTipo;
        this.estrato      = estrato;
    }



    public String getFechaInicial() {
        return fechaInicial;
    }



    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }



    public String getNombreCiudad() {
        return nombreCiudad;
    }



    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }



    public String getConstructora() {
        return constructora;
    }



    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }



    public String getNombreLider() {
        return nombreLider;
    }



    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }



    public Integer getCodigoTipo() {
        return codigoTipo;
    }



    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }



    public Integer getEstrato() {
        return estrato;
    }



    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    

}
