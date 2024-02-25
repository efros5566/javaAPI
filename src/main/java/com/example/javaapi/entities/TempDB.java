package com.example.javaapi.entities;

import java.util.ArrayList;
import java.util.List;

public class TempDB {
    public static List<Pupil> pupils = new ArrayList<>();
    static{
        pupils.add(new Pupil(1, "Ester"));
        pupils.add(new Pupil(2, "Rachel"));
        pupils.add(new Pupil(3, "Shoshana"));
        pupils.add(new Pupil(4, "Riki"));
    }
}
