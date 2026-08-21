/*La empresa Parking Now esta implementando un nuevo servicio de parqueo por lo cual, necesita implementar una 
solución basada en las caractéristicas dadas por la administración.

Se tiene un espacio para 16 celdas las cuales estan disponibles para mensualidad u hora fracción.

Para los registros requeridos, se necesitan almacenar:
-Placa.
-Tipo de Vehículo (camioneta/Sedan).
-Cédula propietario.
-Nombre propietario.
-Valor hora.
-Tiene mensualidad (si/no).
-Valor total pagar.

Para las camionetas con mensualidad se tiene un % de descuento del 10.
Para sedan el 7%.
Para camioneta hora/fracción el 5%.
Para sedan hora/fracción el 3%.

Se requiere un informe ordenado tipo y mensualidad.  */
 */

public class ObjVehiculo {
    private String Placa;
    private String TipoVehiculo;
    private String Cedula;
    private String Nombre;
    private double ValorHora;
    private boolean Mensualidad;
    private double TotalPagar;
    private double Descuento;
    
    public ObjVehiculo() {
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        TipoVehiculo = tipoVehiculo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double valorHora) {
        ValorHora = valorHora;
    }

    public boolean isMensualidad() {
        return Mensualidad;
    }

    public void setMensualidad(boolean mensualidad) {
        Mensualidad = mensualidad;
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        TotalPagar = totalPagar;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }

}
