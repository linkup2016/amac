package com.yonasamare.amacmembershipmanager.records;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Confirmation {
    String confirmationNumber;
    String memberId;
    String message;
    String firstName;
    String lastName;
    Date enrollmentDate;
}
