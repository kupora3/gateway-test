package serviceTwo.model.mapper;

import serviceTwo.model.dto.SecondServiceResponseDto;
import serviceTwo.model.entity.SecondServiceModel;

import java.util.List;
import java.util.stream.Collectors;

public class SecondServiceMapper {
    public SecondServiceResponseDto entityToDto(SecondServiceModel secondServiceModel) {
        SecondServiceResponseDto secondServiceResponseDto = new SecondServiceResponseDto();
        secondServiceResponseDto.setId(secondServiceModel.getId());
        secondServiceResponseDto.setLastName(secondServiceModel.getLastName());
        secondServiceResponseDto.setName(secondServiceModel.getName());
        return secondServiceResponseDto;
    }

    public List<SecondServiceResponseDto> entityToDto(List<SecondServiceModel> secondServiceModels) {
        List<SecondServiceResponseDto> secondServiceResponseDtos =
                secondServiceModels.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
        return secondServiceResponseDtos;
    }
}
