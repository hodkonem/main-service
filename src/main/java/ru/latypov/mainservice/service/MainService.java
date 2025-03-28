package ru.latypov.mainservice.service;

import org.springframework.http.ResponseEntity;

public interface MainService {

    ResponseEntity<String> fetchInformationFromAdapter();
}
