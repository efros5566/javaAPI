package com.example.javaapi.services;

import com.example.javaapi.entities.Pupil;
import com.example.javaapi.entities.TempDB;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PupilServices {

    public List<Pupil> getPupils(){return TempDB.pupils;}

    public Pupil getPupilById(@PathVariable int id){
        return TempDB.pupils.stream().filter(x->x.getId()==id).findAny().orElse(null
        );
    }

    public void addPupil(@RequestBody Pupil pupil){
        TempDB.pupils.add(pupil);
    }

    public void deletePupil(@PathVariable int id){
        TempDB.pupils.removeIf(x->x.getId()==id);
    }

    public void updatePupil(@PathVariable int id,@RequestBody Pupil pupil){
        Pupil index=TempDB.pupils.stream().filter(x->x.getId()==id).findAny().orElse(null);
        if(index==null)
            TempDB.pupils.add(pupil);
        else
            index.setName(pupil.getName());
    }

}
