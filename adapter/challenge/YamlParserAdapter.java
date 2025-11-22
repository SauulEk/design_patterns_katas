package adapter.challenge;
public class YamlParserAdapter implements DataParser {
    private final YamlParser yamlParser;
    public YamlParserAdapter(YamlParser yamlParser){ this.yamlParser = yamlParser; }
    @Override public void parse(String data){ yamlParser.loadYamlContent(data); }
}
