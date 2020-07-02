package nose;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Valores> list = new ArrayList<Valores>();
        list.add(new Valores("Eduardo", "Vega"));
        list.add(new Valores("Jorge", "Garcia"));
        list.add(new Valores("Manuel", "Perotti"));
        list.add(new Valores("Hernan", "Pozo"));
        list.add(new Valores("Pablo", "Tapa"));

        list.stream().sorted((x,y) -> x.getApellido()
        .compareTo(y.getApellido()))
        .filter(x -> !x.getApellido().startsWith("P"))
        .forEach(System.out::println);
    }
}
