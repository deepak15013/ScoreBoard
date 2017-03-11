package in.deepaksood.scoreboard.model_package;

import java.io.Serializable;

/**
 * Created by ciso on 11-03-2017.
 */

public class CricketDataModel implements Serializable {

    private CricketerModel[] records;

    private String quote_max;
    private String quote_available;

    public CricketerModel[] getRecords() {
        return records;
    }

    public void setRecords(CricketerModel[] records) {
        this.records = records;
    }

    public String getQuote_max() {
        return quote_max;
    }

    public void setQuote_max(String quote_max) {
        this.quote_max = quote_max;
    }

    public String getQuote_available() {
        return quote_available;
    }

    public void setQuote_available(String quote_available) {
        this.quote_available = quote_available;
    }
}
