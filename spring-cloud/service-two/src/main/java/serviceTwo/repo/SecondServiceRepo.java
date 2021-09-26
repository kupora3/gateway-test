package serviceTwo.repo;

import serviceTwo.model.entity.SecondServiceModel;

import java.util.List;

public interface SecondServiceRepo {
    SecondServiceModel getById(Long id);

    List<SecondServiceModel> findAll();
}
