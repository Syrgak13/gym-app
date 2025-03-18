package com.gymmanagement.bootstrap;


import com.gymmanagement.entities.Gym;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {
    @PostConstruct
    public void init() {

    }
}
