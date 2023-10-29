package com.yonasamare.amacmembershipmanager.records;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Confirmation {
    private String confirmationNumber;
    private String memberId;
    private String message;
    private String firstName;
    private String lastName;
    private Date enrollmentDate;
}
