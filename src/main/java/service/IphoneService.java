package service;

import model.Phone;

import java.util.Optional;

public interface IphoneService {
    Iterable<Phone> findAll();

    Optional<Phone> findById(Long id);

    Phone save(Phone phone);

    void remove(Long id);
}
