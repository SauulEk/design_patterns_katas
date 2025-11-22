package adapter.challenge;
public class XmlParserAdapter implements DataParser {
    private final XmlParser xmlParser;
    public XmlParserAdapter(XmlParser xmlParser){ this.xmlParser = xmlParser; }
    @Override public void parse(String data){ xmlParser.parseXmlData(data); }
}
