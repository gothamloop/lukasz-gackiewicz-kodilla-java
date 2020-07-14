package testing;



import java.util.HashMap;
import java.util.Map;

public class testing {

    public static Map< Integer, String> getAllFlightsMap() {
        Map<Integer, String> items = new HashMap<>();
        items.put(10, "Cracow");
        items.put(20, "Warsaw");
        items.put(30, "Gdansk");
        items.put(40, "Lodz");
        items.put(50, "Poznan");
        items.put(60,"Szczecin");

      //  items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k, v) -> {
         //   System.out.println("Item : " + k + " Count : " + v);
         //   if (50.equals(k)) {
           //     System.out.println("Hello E");
           //}
            if ("Poznan".equals(v)) {
                System.out.println("Hello Poznan");
            }

        });


        return items;
    }


}
