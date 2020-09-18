
package parcial2020;

import Vehiculos.Automovil;
import Vehiculos.CamionDosEjes;
import Vehiculos.CamionUnEje;
import Vehiculos.Moto;
import Vehiculos.Vihiculos;
import java.util.ArrayList;

/**
 *
 * @author jhoze
 */
public class Parcial2020 {

    public static void main(String[] args) {
        ArrayList<Vihiculos> vehiculos = new ArrayList<Vihiculos>(); 
        vehiculos.add(new Moto("YDT845", "Dervi"));
        vehiculos.add(new CamionUnEje("TAH", "Toyota"));
        vehiculos.add(new CamionDosEjes("ETG349", "Nissan"));
        vehiculos.add(new Automovil("QWE185", "Ford"));
        
        System.out.println(vehiculos);
        System.out.println("Conversion Json a Xml:");
        System.out.println("<Vihiculo>\n"
                            + "        <Automovil placa = YDT845 marca=Dervi Valor=20000></Automovil>\n"
                            + "</Vihiculo>");
    }
    
}
