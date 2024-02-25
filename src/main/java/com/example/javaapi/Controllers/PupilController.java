package com.example.javaapi.Controllers;

import com.example.javaapi.entities.Pupil;
import com.example.javaapi.entities.TempDB;
import com.example.javaapi.services.PupilServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pupil")
public class PupilController {

    @Autowired
    PupilServices pupilServices;

    @GetMapping
    public List<Pupil> getPupils() {
        return pupilServices.getPupils();
    }

    @GetMapping("/{id}")
    public Pupil getPupilById(@PathVariable int id) {
        return pupilServices.getPupilById(id);
    }

    @PostMapping
    public void addPupil(@RequestBody Pupil pupil) {
        pupilServices.addPupil(pupil);
    }

    @DeleteMapping("/{id}")
    public void deletePupil(@PathVariable int id) {
        pupilServices.deletePupil(id);
    }

    @PutMapping("/{id}")
    public void updatePupil(@PathVariable int id, @RequestBody Pupil pupil) {
        pupilServices.updatePupil(id, pupil);
    }
}