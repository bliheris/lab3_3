package edu.iis.mto.time.clock;

import org.joda.time.DateTime;

public class RealTimeSource implements TimeSource {
    @Override
    public DateTime currentDateTime() {
        return new DateTime();
    }
}
