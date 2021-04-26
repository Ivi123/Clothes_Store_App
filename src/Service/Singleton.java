package Service;

import java.util.HashMap;
import java.util.Map;

    public class Singleton {
        private static final Singleton instance = new Singleton();

        @SuppressWarnings("rawtypes")
        private Map <Class, Object> myMap= new HashMap<Class,Object>();

        private Singleton(){}

        @SuppressWarnings("unchecked")
        public static <T> T getInstance(Class<T> classOf) throws InstantiationException, IllegalAccessException{
            if(!instance.myMap.containsKey(classOf)){
                T object = classOf.newInstance();
                instance.myMap.put(classOf, object);
            }
            return (T)instance.myMap.get(classOf);
        }
    }
