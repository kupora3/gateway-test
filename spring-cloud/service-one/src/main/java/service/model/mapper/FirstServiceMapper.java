package service.model.mapper;

import service.model.dto.FirstServiceResponseDto;
import service.model.entity.FirstServiceModel;

import java.util.List;
import java.util.stream.Collectors;

public class FirstServiceMapper {
    public FirstServiceResponseDto entityToDto(FirstServiceModel firstServiceModel) {
        FirstServiceResponseDto firstServiceResponseDto = new FirstServiceResponseDto();
        firstServiceResponseDto.setId(firstServiceModel.getId());
        firstServiceResponseDto.setLastName(firstServiceModel.getLastName());
        firstServiceResponseDto.setName(firstServiceModel.getName());
        return firstServiceResponseDto;
    }

    public List<FirstServiceResponseDto> entityToDto(List<FirstServiceModel> firstServiceModels) {
        List<FirstServiceResponseDto> firstServiceResponseDtos =
                firstServiceModels.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
        return firstServiceResponseDtos;
    }
}
