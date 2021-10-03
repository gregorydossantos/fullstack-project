package com.gregory.backend.controllers;

import com.gregory.backend.dto.ScheduleDto;
import com.gregory.backend.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/list")
    public ResponseEntity<Page<ScheduleDto>> findAll(Pageable pageable) {
        Page<ScheduleDto> list = scheduleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/add")
    public ResponseEntity<ScheduleDto> insert(@RequestBody ScheduleDto scheduleDto) {
        scheduleDto = scheduleService.save(scheduleDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(scheduleDto.getId()).toUri();
        return ResponseEntity.created(uri).body(scheduleDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@RequestParam Long id) {
        return null;
    }
}
