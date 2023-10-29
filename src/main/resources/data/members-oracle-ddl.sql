CREATE TABLE MEMBERS (
     MEMBER_ID NUMBER PRIMARY KEY,
     FIRST_NAME VARCHAR2(50),
     LAST_NAME VARCHAR2(50),
     ENROLLMENT_DATE DATE,
     STREET_ADDRESS VARCHAR2(100),
     APARTMENT VARCHAR2(50),
     CITY VARCHAR2(50),
     STATE VARCHAR2(2),
     ZIP_CODE VARCHAR2(10),
     PHONE_NUMBER VARCHAR2(20),
     EMAIL VARCHAR2(100),
     CONTRIBUTION NUMBER,
     CONTRIBUTION_FREQUENCY VARCHAR2(20), -- Assuming ContributionFrequency is a string or code
     PAYMENT_OPTION VARCHAR2(20), -- Assuming PaymentOptions is a string or code
     VOLUNTARY_AREA_CONTRIBUTION VARCHAR2(100),
     PREFERRED_COMMUNICATION_ENUM VARCHAR2(20) -- Assuming PreferredCommunication is a string or code, or use a separate table for a many-to-many relationship
);

-- To create a sequence in Oracle that starts with 10,000 and use it to populate the primary key column in the "Members" table, you can use the following SQL script:

-- Create a sequence
CREATE SEQUENCE member_id_seq
    START WITH 10000
    INCREMENT BY 1
    MAXVALUE 999999999999999999999999999
    CYCLE
    NOCACHE;

-- Alter the "Members" table to use the sequence
-- as the default value for the "member_id" column
ALTER TABLE Members
MODIFY member_id DEFAULT member_id_seq.NEXTVAL;


CREATE TABLE MEMBERSHIP_CONTRIBUTION_TRACKER (
    MEMBER_ID NUMBER PRIMARY KEY,
    JANUARY NUMBER,
    FEBRUARY NUMBER,
    MARCH NUMBER,
    APRIL NUMBER,
    MAY NUMBER,
    JUNE NUMBER,
    JULY NUMBER,
    AUGUST NUMBER,
    SEPTEMBER NUMBER,
    OCTOBER NUMBER,
    NOVEMBER NUMBER,
    DECEMBER NUMBER
);