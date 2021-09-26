package serviceTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import serviceTwo.model.dto.SecondServiceResponseDto;
import serviceTwo.model.mapper.SecondServiceMapper;
import serviceTwo.service.SecondService;

import java.util.List;

@RestController
@RequestMapping("/second")
public class SecondServiceController {
    private final SecondService secondService;
    private final SecondServiceMapper secondServiceMapper;

    public SecondServiceController(SecondService secondService, SecondServiceMapper secondServiceMapper) {
        this.secondService = secondService;
        this.secondServiceMapper = secondServiceMapper;
    }

    @GetMapping("/{id}")
    public SecondServiceResponseDto getById(@PathVariable Long id) {
        return secondServiceMapper.entityToDto(secondService.getById(id));
    }

    @GetMapping("/getAll")
    public List<SecondServiceResponseDto> findAll() {
        return secondServiceMapper.entityToDto(secondService.findAll());
    }
}
