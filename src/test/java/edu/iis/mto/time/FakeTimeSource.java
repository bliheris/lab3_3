package edu.iis.mto.time;

import edu.iis.mto.time.clock.TimeSource;
import org.joda.time.DateTime;

public class FakeTimeSource implements TimeSource {

    private int delta;

    public FakeTimeSource() {
        this.delta = 0;
    }

    public void setDeltaHours(int delta) {
        this.delta = delta;
    }

    @Override
    public DateTime currentDateTime() {
        if(delta >= 0) {
            return new DateTime().plusHours(delta);
        }else{
            return new DateTime().minusHours(delta);
        }
    }
}
