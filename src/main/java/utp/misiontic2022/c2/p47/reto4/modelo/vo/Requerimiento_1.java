package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_1 {
    // atributos 
    private String  fechaCompra;
    private Integer codCompra;
    private String  nombreProveedor;
    private String  pagado;

    public Requerimiento_1(){
   
    }
    // en este constructor se igualan los atributos 
    // a los que entran por parametrousando this punto
    public Requerimiento_1(String fechaCompra, Integer codCompra, String nombreProveedor, String pagado ){
        this.fechaCompra = fechaCompra;
        this.codCompra   = codCompra;
        this.nombreProveedor = nombreProveedor;
        this.pagado = pagado;

    }
    // en esta parte creamos los get y los set por cada parametro
    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public Integer getCodCompra() {
        return codCompra;
    }
    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public String getPagado() {
        return pagado;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
    





}
