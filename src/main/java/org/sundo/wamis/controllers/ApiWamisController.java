package org.sundo.wamis.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sundo.wamis.services.WamisApiService;

@RestController
@RequestMapping("/api/wamis")
@RequiredArgsConstructor
public class ApiWamisController {
    private final WamisApiService apiService;
    @GetMapping
    public void test() {
        apiService.getObservatories("rf");
        apiService.getObservatories("wl");
        apiService.getObservatories("flw");
        apiService.updateWaterLevelFlow( "10M", "1018683");
        apiService.updatePrecipitation( "10M", "10184100");

    }


}
