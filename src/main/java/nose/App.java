package nose;

import java.util.HashMap;
import java.util.Map;

/*import java.util.ArrayList;
import java.util.List;*/

public class App 
{
    public static void main( String[] args )
    {
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
        Map<Integer, Valores> map;
        map = new HashMap<>();
        map.put(1, new Valores("Roberto", "Garcia"));
        map.put(2, new Valores("Miguel", "Sanchez"));
        map.put(3, new Valores("Maria", "Viena"));
        map.put(4, new Valores("Enesto", "Campo"));
        map.put(5, new Valores("April", "Murray"));
        map.put(6, new Valores("Carlos", "Spencer"));
        map.put(7, new Valores("Joel", "Powell"));
        map.put(8, new Valores("Adam", "Blade"));
        map.put(9, new Valores("Amy", "Johnson"));
        map.put(10, new Valores("Rebecca", "Lewis"));
        map.put(11, new Valores("Jade", "Brown"));
        map.put(12, new Valores("Tristan", "Walker"));
        map.put(13, new Valores("Claire", "Redfield"));
        /*map.put(13, valor.getNombre() + " " + valor.getApellido());*/

        /*map.entrySet().stream()
        .filter(x -> x.getKey() > 10 || x.getKey() == 8)
        .forEach(System.out::println);*/
        map.entrySet().stream()
        .filter(lel -> lel.getValue().getApellido().matches(".*er$"))
        .forEach(System.out::println);
    }
}
