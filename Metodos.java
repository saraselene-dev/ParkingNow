import java.util.Scanner;

public class Metodos {

    public ObjVehiculo[][] LlenarParqueadero(ObjVehiculo[][] m, Scanner sc) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                ObjVehiculo o = new ObjVehiculo();

                System.out.println("Ingrese placa: ");
                o.setPlaca(sc.next());

                System.out.println("Tipo de vehiculo: (1. Camioneta / 2. Sedan) ");
                o.setTipoVehiculo(sc.nextInt());

                System.out.println("Cedula del conductor: ");
                o.setCedula(sc.next());

                System.out.println("Nombre: ");
                o.setNombre(sc.next());

                System.out.println("Valor hora: ");
                o.setValorHora(sc.nextDouble());

                System.out.println("Mensualidad: (SI/NO) ");
                o.setMensualidad(sc.next());

                m[i][j] = o;

            }
        }
        return m;
    }

}
