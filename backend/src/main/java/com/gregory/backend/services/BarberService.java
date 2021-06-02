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

    private Barber barberUpdate;

    @Autowired
    BarberRepository barberRepository;

    @Transactional(readOnly = true)
    public Page<BarberDto> findAll(Pageable pageable) {
        Page<Barber> result = barberRepository.findAll(pageable);
        return result.map(BarberDto::new);
    }

    @Transactional(readOnly = true)
    public BarberDto findOne(Long id) {
        Barber result = barberRepository.getOne(id);
        return new BarberDto(result);
    }

    @Transactional
    public BarberDto save(BarberDto barberDto) {
        Barber barber = new Barber(barberDto.getName());
        barber = barberRepository.save(barber);
        return new BarberDto(barber);
    }

    @Transactional
    public BarberDto update(Long id, BarberDto barberDto) {
        var barber = barberRepository.findById(id);
        if (barber.isPresent()) {
            barberUpdate = barber.get();
            barberUpdate.setName(barberDto.getName());
        }
        barberUpdate = barberRepository.save(barberUpdate);
        return new BarberDto(barberUpdate);
    }

    @Transactional
    public void delete(Long id) {
        var barber = barberRepository.findById(id);
        if (barber.isPresent()) {
            var barberDelete = barber.get();
            barberRepository.delete(barberDelete);
        }
    }
}
