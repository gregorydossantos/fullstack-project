package com.gregory.backend.services;

import com.gregory.backend.dto.ScheduleDto;
import com.gregory.backend.dto.UserDto;
import com.gregory.backend.entities.Schedule;
import com.gregory.backend.entities.User;
import com.gregory.backend.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    @Transactional(readOnly = true)
    public Page<ScheduleDto> findAll(Pageable pageable) {
        Page<Schedule> result = scheduleRepository.findAll(pageable);
        return result.map(ScheduleDto::new);
    }

    @Transactional(readOnly = true)
    public Page<ScheduleDto> findOne(Long id) {}

    @Transactional
    public ScheduleDto save(ScheduleDto scheduleDto) {
        Schedule schedule = new Schedule(scheduleDto.getDateHour(), scheduleDto.getBarber(),
                scheduleDto.getUser());
        schedule = scheduleRepository.save(schedule);
        return new ScheduleDto(schedule);
    }

    @Transactional
    public ScheduleDto update(Long id) {}

    @Transactional
    public ScheduleDto delete(Long id) {}
}
