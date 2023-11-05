package com.yonasamare.amacmembershipmanager.services;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.yonasamare.amacmembershipmanager.helpers.MemberUtilityFunctions;
import com.yonasamare.amacmembershipmanager.jpa.MemberRepository;
import com.yonasamare.amacmembershipmanager.records.Confirmation;
import org.springframework.beans.factory.annotation.Autowired;
import com.yonasamare.amacmembershipmanager.jpa.Member;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
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

    public List<List<String>> enterRecordsFromGoogleSheets() {
        File file = new File("src/main/resources/data/membersListCSV.csv");
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file))) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return records;
    }
}
