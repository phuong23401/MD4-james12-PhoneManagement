package service;

import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IPhoneRepository;

import java.util.Optional;

public class PhoneService implements IphoneService {
    @Autowired
    private IPhoneRepository phoneRepository;

    @Override
    public Iterable<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Optional<Phone> findById(Long id) {
        return phoneRepository.findById(id);
    }

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public void remove(Long id) {
        phoneRepository.deleteById(id);
    }
}
