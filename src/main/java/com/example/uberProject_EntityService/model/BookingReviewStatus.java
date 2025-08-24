package com.example.uberProject_EntityService.model;

import jakarta.persistence.Enumerated;


public enum BookingReviewStatus {

    SCHEDULE,

    CANCELLED,

    CAB_ARRIVED,

    ASSIGNING_DRIVER,

    IN_RIDE,

    COMPLETE
}
