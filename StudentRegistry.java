package prototypeRegistryDesignPattern;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String,Student> map;

    public StudentRegistry() {
        this.map = new HashMap<>();
    }

    public void register(String key, Student protoType){
        map.put(key,protoType);
    }

    public Student get(String key){
        return map.get(key);
    }
}
