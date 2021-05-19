package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SegmentFilterImplTest {
    private final SegmentFilter segmentFilter = new SegmentFilterImpl();

    private final FlightBuilder flightBuilder = new FlightBuilderTest();

    private final List<Flight> flights = flightBuilder.createFlights();

    @Test
    public void getDepartureTimeBeforeNow() {
        assertAll(
                () -> assertNotNull(flights),
                () -> assertEquals(5, segmentFilter.getDepartureTimeBeforeNow(flights).size())
        );
    }

    @Test
    public void getArrivalDateLessDepartureDate() {
        assertAll(
                () -> assertNotNull(flights),
                () -> assertEquals(2, segmentFilter.getArrivalDateLessDepartureDate(flights).size()
                ));
    }

    @Test
    public void getFlightWithTransferMoreThanTwoHours() {
        assertAll(
                () -> assertNotNull(flights),
                () -> assertEquals(2, segmentFilter.getFlightWithTransferMoreThanTwoHours(flights).size())
        );
    }


}
