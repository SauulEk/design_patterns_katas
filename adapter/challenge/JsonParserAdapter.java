package adapter.challenge;
public class JsonParserAdapter implements DataParser {
    private final JsonParser jsonParser;
    public JsonParserAdapter(JsonParser jsonParser){ this.jsonParser = jsonParser; }
    @Override public void parse(String data){ jsonParser.readJsonString(data); }
}
