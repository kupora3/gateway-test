package service.repo;

import service.model.entity.FirstServiceModel;

import java.util.List;

public interface FirstServiceRepo {
    FirstServiceModel getById(Long id);

    List<FirstServiceModel> findAll();
}
