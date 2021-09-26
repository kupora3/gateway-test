package service.repo;

import org.springframework.stereotype.Repository;
import service.model.entity.FirstServiceModel;

import java.util.List;
@Repository
public class FirstServiceRepoImpl implements FirstServiceRepo{
    @Override
    public FirstServiceModel getById(Long id) {
        FirstServiceModel firstServiceModel = new FirstServiceModel();
        if (id == 1) {
            firstServiceModel.setId(id);
            firstServiceModel.setLastName("First service last name with id 1");
            firstServiceModel.setName("First service name with id 1");
        }
        if (id == 2) {
            firstServiceModel.setId(id);
            firstServiceModel.setLastName("First service last name with id 2");
            firstServiceModel.setName("First service name with id 2");
        }
        return firstServiceModel;
    }

    @Override
    public List<FirstServiceModel> findAll() {
        FirstServiceModel firstServiceModel = new FirstServiceModel();
        firstServiceModel.setId(1L);
        firstServiceModel.setLastName("First service last name1");
        firstServiceModel.setName("First service name1");

        FirstServiceModel firstServiceModel1 = new FirstServiceModel();
        firstServiceModel1.setId(2L);
        firstServiceModel1.setLastName("First service last name2");
        firstServiceModel1.setName("First service name2");

        FirstServiceModel firstServiceModel2 = new FirstServiceModel();
        firstServiceModel2.setId(3L);
        firstServiceModel2.setLastName("First service last name3");
        firstServiceModel2.setName("First service name3");
        return List.of(firstServiceModel, firstServiceModel1, firstServiceModel2);
    }
}
