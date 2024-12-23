package com.example.employeedetails.Controller;

import com.example.employeedetails.Service.EService;
import com.example.employeedetails.entity.emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EController {
    @Autowired
    public EService eservice;

    @GetMapping("/Emp")
    public ResponseEntity<List<emp>> getAllEmp()
    {
        return ResponseEntity.ok(eservice.getAllEmp());
    }

    @GetMapping("/Emp/{eid}")
    public ResponseEntity<emp> getEmpById(@PathVariable("eid") Long eid)
    {
        return ResponseEntity.ok(eservice.getEmpById(eid));
    }

    @PostMapping("/Emp")
    public ResponseEntity<emp> addEmp(@RequestBody emp e)
    {
        return ResponseEntity.ok(eservice.addEmp(e));
    }

    @PatchMapping("/Emp/{eid}")
    public ResponseEntity<emp> updateEmp(@RequestBody emp e,@PathVariable("eid") Long eid)
    {
        return ResponseEntity.ok(eservice.updateEmp(e,eid));
    }

    @DeleteMapping("/Emp/{eid}")
    public ResponseEntity<String> delEmp(@PathVariable("eid") Long eid)
    {
        return ResponseEntity.ok(eservice.delEmp(eid));
    }


}
