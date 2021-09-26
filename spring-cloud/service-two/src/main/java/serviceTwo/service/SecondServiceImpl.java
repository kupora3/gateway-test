package serviceTwo.service;

import org.springframework.stereotype.Service;
import serviceTwo.model.entity.SecondServiceModel;
import serviceTwo.repo.SecondServiceRepo;

import java.util.List;

@Service
public class SecondServiceImpl implements SecondService {
    private final SecondServiceRepo secondServiceRepo;

    public SecondServiceImpl(SecondServiceRepo secondServiceRepo) {
        this.secondServiceRepo = secondServiceRepo;
    }

    @Override
    public SecondServiceModel getById(Long id) {
        return secondServiceRepo.getById(id);
    }

    @Override
    public List<SecondServiceModel> findAll() {
        return secondServiceRepo.findAll();
    }
}
