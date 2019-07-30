package com.multiple.multiple.datasource.bar.domain;

import javax.persistence.*;

@Entity
@Table(name = "bar")
public class Bar {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String bar;

    public Bar(String bar) {
        this.bar = bar;
    }

    Bar() {
        // Default constructor needed by JPA
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
