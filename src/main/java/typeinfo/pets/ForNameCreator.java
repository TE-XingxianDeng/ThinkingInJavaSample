package typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dylan
 * @version 1.00 6/13/2016 22:34
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "Mutt",
            "Pug",
            "EgyptianMau",
            "Manx",
            "Cymric",
            "Rat",
            "Mouse",
            "Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
