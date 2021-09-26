package service.service;

import org.springframework.stereotype.Service;
import service.model.entity.FirstServiceModel;
import service.repo.FirstServiceRepo;

import java.util.List;
@Service
public class FirstServiceImpl implements FirstService {
    private final FirstServiceRepo firstServiceRepo;

    public FirstServiceImpl(FirstServiceRepo firstServiceRepo) {
        this.firstServiceRepo = firstServiceRepo;
    }

    @Override
    public FirstServiceModel getById(Long id) {
        return firstServiceRepo.getById(id);
    }

    @Override
    public List<FirstServiceModel> findAll() {
        return firstServiceRepo.findAll();
    }
}
