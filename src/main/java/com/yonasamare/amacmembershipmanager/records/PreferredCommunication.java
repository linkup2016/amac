package com.yonasamare.amacmembershipmanager.records;

import com.yonasamare.amacmembershipmanager.enums.PreferredCommunicationEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PREFERRED_COMMUNICATION_WAYS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreferredCommunication {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMM_WAYS_ID_SEQ")
    @SequenceGenerator(name = "COMM_WAYS_ID_SEQ", sequenceName = "COMM_WAYS_ID_SEQ", allocationSize = 1)
    @Column(name = "PREFERRED_COMMUNICATION_WAYS_ID")
    private Integer id;
    @Column(name = "MEMBER_ID")
    private Integer memberId;
    @Column(name = "TEXT")
    private PreferredCommunicationEnum text;
    @Column(name = "CALL")
    private PreferredCommunicationEnum call;
    @Column(name = "EMAIL")
    private PreferredCommunicationEnum email;
    @Column(name = "OTHER")
    private PreferredCommunicationEnum other;
}
