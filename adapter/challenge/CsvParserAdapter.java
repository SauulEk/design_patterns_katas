package adapter.challenge;
public class CsvParserAdapter implements DataParser {
    private final CsvParser csvParser;
    public CsvParserAdapter(CsvParser csvParser){ this.csvParser = csvParser; }
    @Override public void parse(String data){ csvParser.parseCsv(data); }
}
