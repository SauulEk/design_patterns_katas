package adapter.challenge;
import java.util.*;
public class DataProcessor {
    private final Map<String, DataParser> parsers = new HashMap<>();
    public void registerParser(String format, DataParser parser){
        parsers.put(format.toUpperCase(), parser);
    }
    public void processData(String format, String data){
        DataParser p = parsers.get(format.toUpperCase());
        if(p==null) throw new IllegalArgumentException("Formato no soportado: "+format);
        p.parse(data);
    }
}
