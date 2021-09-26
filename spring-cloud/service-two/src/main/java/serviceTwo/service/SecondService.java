package serviceTwo.service;

import serviceTwo.model.entity.SecondServiceModel;

import java.util.List;

public interface SecondService {
    SecondServiceModel getById(Long id);

    List<SecondServiceModel> findAll();
}
