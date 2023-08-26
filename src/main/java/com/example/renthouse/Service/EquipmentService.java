package com.example.renthouse.Service;

import com.example.renthouse.Entity.Equipment;
import com.example.renthouse.Request.EquipmentRequest;

import java.util.List;

public interface EquipmentService {

    Equipment addEquipment(EquipmentRequest equipmentRequest);

    List<Equipment> getAllEquipment();

    Equipment updateEquipment(EquipmentRequest equipmentRequest,Long id);
}
