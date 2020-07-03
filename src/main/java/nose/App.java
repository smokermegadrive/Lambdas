package nose;

import java.util.HashMap;
import java.util.Map;

/*import java.util.ArrayList;
import java.util.List;*/

public class App 
{
    public static void main( String[] args )
    {
        Valores valor = new Valores("Eduardo", "Vega");
        /*List<Valores> list = new ArrayList<Valores>();
        list.add(new Valores("Eduardo", "Vega"));
        list.add(new Valores("Jorge", "Garcia"));
        list.add(new Valores("Manuel", "Perotti"));
        list.add(new Valores("Hernan", "Pozo"));
        list.add(new Valores("Pablo", "Tapa"));

        list.stream().sorted((x,y) -> x.getApellido()
        .compareTo(y.getApellido()))
        .filter(x -> !x.getApellido().startsWith("P"))
        .forEach(System.out::println);*/
        Map<Integer, String> map;
        map = new HashMap<>();
        map.put(1, "April Murray");
        map.put(2, "Rose Fisher");
        map.put(3, "Frank Mitchell");
        map.put(4, "April Murray");
        map.put(5, "Charlie Spencer");
        map.put(6, "Joel Powell");
        map.put(7, "Adam Blade");
        map.put(8, "Holly Brooks");
        map.put(9, "Amy Johnson");
        map.put(10, "Rebecca Lewis");
        map.put(11, "Tristan Walker");
        map.put(12, "Jade Brown");
        map.put(13, valor.getNombre() + " " + valor.getApellido());

        map.entrySet().stream()
        .filter(x -> x.getKey() > 10 || x.getKey() == 8)
        .forEach(System.out::println);


    }
}
