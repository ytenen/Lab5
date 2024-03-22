package managers;

import data.Organization;
import data.generators.IdGenerator;

import java.time.LocalDate;
import java.util.ArrayDeque;

public class CollectionManager {
    private static ArrayDeque<Organization> collection = new ArrayDeque<>();
    private static LocalDate date;


    public  CollectionManager(){
        collection = new ArrayDeque<>();
        date = LocalDate.now();
        //ТУТ БЫЛ new IDGenerator(); ХЗ ЗАЧЕМ ЕСЛИ ЧТО ОШИБКА МБ ТУТ
    }

    public static LocalDate getDate() {
        return date;
    }

    public static void add(Organization organization){
        if (collection == null){
            collection = new ArrayDeque<>();
        }
        collection.add(organization);
        IdGenerator.add(organization.getId());
    }

    public static void setCollection(ArrayDeque<Organization> col){
        collection = col;
    }

    public static ArrayDeque<Organization> getCollection() {
        return collection;
    }

}
