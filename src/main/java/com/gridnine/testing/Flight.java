package com.gridnine.testing;

import lombok.Data;

import java.util.List;

@Data
public class Flight {
    private final List<Segment> segments;
    private final Integer id;

    Flight(final List<Segment> segmentList, Integer id) {
        segments = segmentList;
        this.id = id;
    }


}
