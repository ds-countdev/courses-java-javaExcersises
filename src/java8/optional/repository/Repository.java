package java8.optional.repository;

import java8.models.Computer;

import java.util.Optional;

public interface Repository<T>{

    Optional<Computer> find(String name );

}
