package co.com.sofka.crud.utils;

import co.com.sofka.crud.dto._DTOEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Map {

    public _DTOEntity convertToDTO(Object obj, _DTOEntity dto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(obj, dto.getClass());
    }

    public Object convertToEntity(_DTOEntity dto, Object obj){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, obj.getClass());
    }
}
