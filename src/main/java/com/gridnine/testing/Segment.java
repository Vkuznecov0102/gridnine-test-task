package com.gridnine.testing;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Data
public class Segment {
    private final LocalDateTime departureDate;

    private final LocalDateTime arrivalDate;

    private final Integer id;

    Segment(final LocalDateTime dep, final LocalDateTime arr, Integer id) {
        departureDate = Objects.requireNonNull(dep);
        arrivalDate = Objects.requireNonNull(arr);
        this.id = id;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return '[' + departureDate.format(fmt) + '|' + arrivalDate.format(fmt)
                + ']';
    }
}
