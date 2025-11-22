package adapter.challenge;
public class Main {
    public static void main(String[] args){
        DataProcessor processor = new DataProcessor();
        processor.registerParser("XML", new XmlParserAdapter(new XmlParser()));
        processor.registerParser("JSON", new JsonParserAdapter(new JsonParser()));
        processor.registerParser("YAML", new YamlParserAdapter(new YamlParser()));
        processor.registerParser("CSV", new CsvParserAdapter(new CsvParser()));
        processor.processData("XML","<user><name>Juan</name></user>");
        processor.processData("JSON","{\"name\":\"María\"}");
        processor.processData("YAML","name: Pedro");
        processor.processData("CSV","name,age\nPedro,30");
    }
}
