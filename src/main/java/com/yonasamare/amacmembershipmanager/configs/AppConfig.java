package com.yonasamare.amacmembershipmanager.configs;

import com.yonasamare.amacmembershipmanager.helpers.MemberUtilityFunctions;
import com.yonasamare.amacmembershipmanager.services.MemberServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberServices getServicesBean() {
        return new MemberServices();
    }

    @Bean
    public MemberUtilityFunctions getUtilityFunctionsBean() {
        return new MemberUtilityFunctions();
    }

/*
    @Bean
    public MemberMapper getMemberMapperBean() {
        return new MemberMapper();
    }
*/

}
