package com.gregory.backend.services;

import com.gregory.backend.dto.BarberDto;
import com.gregory.backend.entities.Barber;
import com.gregory.backend.repositories.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BarberService {

    @Autowired
    BarberRepository barberRepository;

    @Transactional(readOnly = true)
    public Page<BarberDto> findAll(Pageable pageable) {
        Page<Barber> result = barberRepository.findAll(pageable);
        return result.map(BarberDto::new);
    }

    @Transactional(readOnly = true)
    public Page<BarberDto> findOne(Long id) {}

    @Transactional
    public BarberDto save(BarberDto barberDto) {
        Barber barber = new Barber(barberDto.getName());
        barber = barberRepository.save(barber);
        return new BarberDto(barber);
    }

    @Transactional
    public BarberDto update(Long id) {}

    @Transactional
    public BarberDto delete(Long id) {}

}
