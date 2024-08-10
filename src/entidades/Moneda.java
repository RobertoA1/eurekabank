package entidades;

public class Moneda {
    
    private String codigo = null;
    private String descripcion = null;
    private MontoMaximo montoMax = null;
    private CargoMantenimiento cargoMantenimiento = null;
    private CostoMovimiento costoMovimiento = null;
    private InteresMensual interesMensual = null;
    private int estado = 1;

    public Moneda() {
    }

    public Moneda(String codigo, String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MontoMaximo getMontoMax() {
        return montoMax;
    }

    public void setMontoMax(MontoMaximo montoMax) {
        this.montoMax = montoMax;
    }

    public CargoMantenimiento getCargoMantenimiento() {
        return cargoMantenimiento;
    }

    public void setCargoMantenimiento(CargoMantenimiento cargoMantenimiento) {
        this.cargoMantenimiento = cargoMantenimiento;
    }

    public CostoMovimiento getCostoMovimiento() {
        return costoMovimiento;
    }

    public void setCostoMovimiento(CostoMovimiento costoMovimiento) {
        this.costoMovimiento = costoMovimiento;
    }

    public InteresMensual getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(InteresMensual interesMensual) {
        this.interesMensual = interesMensual;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    

}
