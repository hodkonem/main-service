package ru.latypov.mainservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.latypov.mainservice.service.MainService;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

    private final RestTemplate restTemplate;

    @Override
    public ResponseEntity<String> fetchInformationFromAdapter() {
        return restTemplate.getForEntity("http://localhost:8082/api/test", String.class);
    }


}
