package com.techleads.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TestService {
    @Autowired
   private Config config;

    public List<String> testProperties(){
        List<String> ignoreFilenames = config.getIgnoreFilenames();
//        List<String> list = Arrays.stream(ignoreFilenames).collect(Collectors.toList());
//        System.out.println("{}=>"+ignoreFilenames[0]);
        return ignoreFilenames;
    }
}
