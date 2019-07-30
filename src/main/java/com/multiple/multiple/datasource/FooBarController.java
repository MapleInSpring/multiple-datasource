package com.multiple.multiple.datasource;

import com.multiple.multiple.datasource.bar.domain.Bar;
import com.multiple.multiple.datasource.bar.repo.BarRepository;
import com.multiple.multiple.datasource.foo.domain.Foo;
import com.multiple.multiple.datasource.foo.repo.FooRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FooBarController {
    private FooRepository fooRepository;
    private BarRepository barRepository;

    public FooBarController(FooRepository fooRepository, BarRepository barRepository) {
        this.fooRepository = fooRepository;
        this.barRepository = barRepository;
    }

    @PostMapping("/add-foo")
    public void addFoo() {
        this.fooRepository.save(new Foo("hello foo"));
    }

    @PostMapping("/add-bar")
    public void addBar() {
        this.barRepository.save(new Bar("hello Bar"));
    }

    @GetMapping("/all-foo")
    public List<Foo> getFoos() {
        return this.fooRepository.findAll();
    }

    @GetMapping("/all-bar")
    public List<Bar> getBars() {
        return this.barRepository.findAll();
    }
}
