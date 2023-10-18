CREATE TABLE Members (
     member_id NUMBER PRIMARY KEY,
     first_name VARCHAR2(50),
     last_name VARCHAR2(50)
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