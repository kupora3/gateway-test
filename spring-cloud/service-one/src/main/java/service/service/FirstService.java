package service.service;

import service.model.entity.FirstServiceModel;

import java.util.List;

public interface FirstService {
    FirstServiceModel getById(Long id);

    List<FirstServiceModel> findAll();
}
