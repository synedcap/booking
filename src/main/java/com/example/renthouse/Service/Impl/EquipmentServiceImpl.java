package com.example.renthouse.Service.Impl;

import com.example.renthouse.Entity.Equipment;
import com.example.renthouse.Repository.EquipmentRepository;
import com.example.renthouse.Request.EquipmentRequest;
import com.example.renthouse.Service.EquipmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipmentServiceImpl implements EquipmentService {

    private EquipmentRepository equipmentRepository;
    private ModelMapper modelMapper;

    @Override
    public Equipment addEquipment(EquipmentRequest equipmentRequest) {

        Equipment equipment = modelMapper.map(equipmentRequest,Equipment.class);
        Equipment equipmentSaved = equipmentRepository.save(equipment);

        return equipmentSaved;
    }

    @Override
    public List<Equipment> getAllEquipment() {

        List<Equipment> equipment = equipmentRepository.findAll();
        return equipment;
    }

    @Override
    public Equipment updateEquipment(EquipmentRequest equipmentRequest, Long id) {

        Equipment equipment = equipmentRepository.findById(id)
                .orElseThrow()
        return null;
    }
}
