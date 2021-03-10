package com.module4.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Detail {
    @Id
    private int id;
    private String subjects;
    private int point;
    @OneToMany
    private List<People> peopleList;


}
