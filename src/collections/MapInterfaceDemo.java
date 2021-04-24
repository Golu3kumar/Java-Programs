package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterfaceDemo {

    // Map Interface : Map Interface is something that store objects in key and value pair.
    // Keys having unique. It is implemented by HashMap and HashTable classes.
    // HashMap : It is a class that implements Map Interface in order to store key and value pairs.
    // It is not thread safe i.e. Not Synchronized.
    // HashTable : It is also a java class that implements Map interface but it is thread safe i.e. Synchronized

    // Note : Keys are set so that we can not have duplicates and sequences of objects.
    public static void main(String[] args) {

        // initializing map interface using HashMap class
        Map<String,String> countryCapital = new HashMap<>(){{
            put("india","new delhi");
            put("nepal","Kathmandu");
            put("sri lanka","colombo");
            put("india","delhi");  // it override the value india key
        }};

        for (String key: countryCapital.keySet()) {
            System.out.println(key+" -> "+countryCapital.get(key));
        }

        // initializing map interface using HashTable class
        Map<String,String> songDetails = new Hashtable<>(){{
            put("songName","Tera Zikr");
            put("singerName","Darshan Raval");
            put("duration","3:50 sec");
        }};

        for (String key: songDetails.keySet()) {
            System.out.println(key+" -> "+songDetails.get(key));
        }


    }
}
