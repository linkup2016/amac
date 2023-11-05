package com.yonasamare.amacmembershipmanager.services;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.yonasamare.amacmembershipmanager.helpers.MemberUtilityFunctions;
import com.yonasamare.amacmembershipmanager.jpa.MemberRepository;
import com.yonasamare.amacmembershipmanager.records.Confirmation;
import org.springframework.beans.factory.annotation.Autowired;
import com.yonasamare.amacmembershipmanager.jpa.Member;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MemberServices {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    MemberUtilityFunctions utilityFunctions;

    public Confirmation saveMember(Member member) {
        Member newMember = memberRepository.save(member);
        return utilityFunctions.formConfirmationMessage(newMember);
    }

    public Optional<Member> getMemberById(String id){
        return memberRepository.findById(Integer.valueOf(id));
    }
//todo - use optional for reading calls. It is a best practice since database may not return the expected object
    public List<String> getRecordFromLine() {
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader("/resources/data/membersListCSV.csv"))) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
