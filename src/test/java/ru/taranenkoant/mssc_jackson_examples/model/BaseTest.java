package ru.taranenkoant.mssc_jackson_examples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createDate(OffsetDateTime.now())
                .lastUpdateDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(1223873727626722L)
                .myLocalDate(LocalDate.now())
                .build();
    }
}
