package serviceTwo.repo;

import org.springframework.stereotype.Repository;
import serviceTwo.model.entity.SecondServiceModel;

import java.util.List;

@Repository
public class SecondServiceRepoImpl implements SecondServiceRepo {
    @Override
    public SecondServiceModel getById(Long id) {
        SecondServiceModel firstServiceModel = new SecondServiceModel();
        firstServiceModel.setId(id);
        firstServiceModel.setLastName("Second service last name");
        firstServiceModel.setName("Second service name");
        return firstServiceModel;
    }

    @Override
    public List<SecondServiceModel> findAll() {
        SecondServiceModel secondServiceModel = new SecondServiceModel();
        secondServiceModel.setId(1L);
        secondServiceModel.setLastName("Second service last name1");
        secondServiceModel.setName("Second service name1");

        SecondServiceModel secondServiceModel1 = new SecondServiceModel();
        secondServiceModel1.setId(2L);
        secondServiceModel1.setLastName("Second service last name2");
        secondServiceModel1.setName("Second service name2");

        SecondServiceModel secondServiceModel2 = new SecondServiceModel();
        secondServiceModel2.setId(3L);
        secondServiceModel2.setLastName("Second service last name3");
        secondServiceModel2.setName("Second service name3");
        return List.of(secondServiceModel, secondServiceModel1, secondServiceModel2);
    }
}
