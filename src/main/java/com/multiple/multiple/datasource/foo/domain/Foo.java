package com.multiple.multiple.datasource.foo.domain;

import javax.persistence.*;

@Entity
@Table(name = "foo")
public class Foo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String foo;

    public Foo(String foo) {
        this.foo = foo;
    }

    Foo() {
        // Default constructor needed by JPA
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
