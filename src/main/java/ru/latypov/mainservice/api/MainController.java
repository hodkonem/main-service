package ru.latypov.mainservice.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.latypov.mainservice.service.MainService;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return mainService.fetchInformationFromAdapter();
    }

    @GetMapping("test1")
    public String test1() {
        return "Hi from main-service";
    }
}