package com.gregory.backend.controllers;

import com.gregory.backend.dto.ScheduleDto;
import com.gregory.backend.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedules")
    public ResponseEntity<Page<ScheduleDto>> findAll(Pageable pageable) {
        Page<ScheduleDto> list = scheduleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
