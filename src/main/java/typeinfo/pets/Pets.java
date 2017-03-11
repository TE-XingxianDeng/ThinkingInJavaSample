package typeinfo.pets;

import java.util.ArrayList;

/**
 * @author Dylan
 * @version 1.00 6/13/2016 23:07
 */
public class Pets {
    public static final PetCreator creator =
            new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
