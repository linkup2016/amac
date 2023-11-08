package com.yonasamare.amacmembershipmanager.helpers;


import com.yonasamare.amacmembershipmanager.jpa.Member;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
public class RequestJsonTest {

    @Autowired
    private JacksonTester<Member> json;

    @Autowired
    private JacksonTester<Member[]> jsonList;

    private Member[] Members;

    @BeforeEach
    void setUp() {
        Members = Arrays.array(
                new Member(1001, new Date(System.currentTimeMillis()), "ab@gmail.com",
                        "555-555-5555", "a", "b", "yes", "yes", "yes", 50.0, "NONE", "980", 51.83,
                        "paid", "card ending 2345", "3345236", new Date(System.currentTimeMillis())),
                new Member(1001, new Date(System.currentTimeMillis()), "ab@gmail.com",
                        "888-555-7777", "c", "d", "no", "yes", "yes", 25.0, "NONE", "981", 25.12,
                        "paid", "card ending 2345", "3345237", new Date(System.currentTimeMillis())),
                new Member(1001, new Date(System.currentTimeMillis()), "ab@gmail.com",
                        "999-999-9999", "e", "f", "no", "no", "no", 105.0, "NONE", "982", 108.83,
                        "pending", "card ending 8978", "3345237", new Date(System.currentTimeMillis())));
    }

    @Test
    public void MemberSerializationTest() throws IOException {
        Member Member = Members[0];
        assertThat(json.write(Member)).isStrictlyEqualToJson("request.json");
        assertThat(json.write(Member)).hasJsonPathNumberValue("@.id");
        assertThat(json.write(Member)).extractingJsonPathNumberValue("@.id")
                .isEqualTo(1001);
        assertThat(json.write(Member)).hasJsonPathNumberValue("@.phoneNumber");
        assertThat(json.write(Member)).extractingJsonPathNumberValue("@.phoneNumber")
                .isEqualTo(555 - 555 - 5555);
    }

/*    @Test
    public void MemberDeserializationTest() throws IOException {
        String expected = """
                {
                    "id": 99,
                    "amount": 123.45
                }
                """;
        assertThat(json.parse(expected))
                .isEqualTo(new Member(99L, 123.45));
        assertThat(json.parseObject(expected).id()).isEqualTo(99);
        assertThat(json.parseObject(expected).amount()).isEqualTo(123.45);
    }*/
}


