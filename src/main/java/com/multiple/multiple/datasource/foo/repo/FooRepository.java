package com.multiple.multiple.datasource.foo.repo;

import com.multiple.multiple.datasource.foo.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Long> {
}
