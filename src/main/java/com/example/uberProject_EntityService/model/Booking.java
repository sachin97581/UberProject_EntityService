package com.example.uberProject_EntityService.model;

//public class Booking {
//}


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Booking extends BaseModel{

//    @OneToOne
//    private Review review;

    @Enumerated(value = EnumType.STRING)
    private BookingReviewStatus bookingReviewStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    //    @JsonBackReference
    @ManyToOne //(fetch = FetchType.LAZY)
    private Driver driver;

    @ManyToOne  //(fetch = FetchType.LAZY)
    private Passenger passenger;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation startLocation;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation endLocation;
}
