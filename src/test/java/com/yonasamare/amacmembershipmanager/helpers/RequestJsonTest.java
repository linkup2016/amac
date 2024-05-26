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

    /*
    * For this test to pass, the request.json file need to in the classpath.
    * It was supposed be present among the compiled classes under target folder once aced to test/resources
    * You can manually add it to target/classes/..../helpers folder for the test to find it.
    * */
 /*   @Test
    public void MemberSerializationTest() throws IOException {
        Member member = Members[0];
//        assertThat(json.write(Member)).isStrictlyEqualToJson("request.json");
        assertThat(json.write(member)).hasJsonPathNumberValue("@.id");
        assertThat(json.write(member)).extractingJsonPathNumberValue("@.id")
                .isEqualTo(1001);
        assertThat(json.write(member)).hasJsonPathStringValue("@.phoneNumber")
                .isEqualTo("5555555555");
    }

    @Test
    public void MemberDeserializationTest() throws IOException {
        String expected = """
                {
                   "enrollmentDate": "2023-10-23",
                   "email": "johndoe@example.com",
                   "phoneNumber": "555-555-5555",
                   "firstName": "Matt",
                   "lastName": "Barl",
                   "callMe": "yes",
                   "textMe": "yes",
                   "emailMe": "no",
                   "contribution": 100.50,
                   "areaOfContribution": "marketing",
                   "orderId": "789adsf",
                   "totalCharged": "103.50",
                   "paymentStatus": "paid",
                   "paymentMethod": "card ending 2345",
                   "transactionId": "3345236",
                   "lastUpdated": "2023-10-31"
                 }
                 
                """;
        assertThat(json.parse(expected))
                .isEqualTo(new Member(1001, new Date(System.currentTimeMillis()), "ab@gmail.com",
                        "999-999-9999", "e", "f", "no", "no", "no", 105.0, "NONE", "982", 108.83,
                        "pending", "card ending 8978", "3345237", new Date(System.currentTimeMillis())));
        assertThat(json.parseObject(expected).getId()).isEqualTo(2000);
        assertThat(json.parseObject(expected).getTransactionId()).isEqualTo(123.45);
    }
*/

}


