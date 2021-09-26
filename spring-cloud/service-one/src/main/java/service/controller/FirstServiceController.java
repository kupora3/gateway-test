package service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.model.dto.FirstServiceResponseDto;
import service.model.mapper.FirstServiceMapper;
import service.service.FirstService;

import java.util.List;

@RestController
@RequestMapping("/first")
public class FirstServiceController {
    private final FirstService firstService;
    private final FirstServiceMapper firstServiceMapper;

    public FirstServiceController(FirstService firstService, FirstServiceMapper firstServiceMapper) {
        this.firstService = firstService;
        this.firstServiceMapper = firstServiceMapper;
    }

    @GetMapping("/{id}")
    public FirstServiceResponseDto getById(@PathVariable Long id) {
        return firstServiceMapper.entityToDto(firstService.getById(id));
    }

    @GetMapping("/{id}/lastName")
    public String getLastName(@PathVariable Long id) {
        return firstServiceMapper.entityToDto(firstService.getById(id)).getLastName();
    }

    @GetMapping("/getAll")
    public List<FirstServiceResponseDto> findAll() {
        return firstServiceMapper.entityToDto(firstService.findAll());
    }
}
