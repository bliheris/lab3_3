package edu.iis.mto.time.clock;

import org.joda.time.DateTime;

public interface TimeSource {

    DateTime currentDateTime();
}

