package com.service.payment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */

@Getter
@Setter
@ToString
@MappedSuperclass
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @Column(name = "CREATE_TIMESTAMP")
    @JsonIgnore
    private String createTimeStamp;
    @Column(name = "UPDATE_TIMESTAMP")
    @JsonIgnore
    private String updateTimeStamp;
    @Column(name = "IS_DELETED")
    @JsonIgnore
    private boolean isDeleted;
}
