package poo_interfaces.repository;

import poo_interfaces.model.Client;

import java.util.List;

public interface CrudRepository<T> {
    List<T> list();
    T byId(Integer id);
    void create(T client);
    void update(T client);
    void delete(T id);
}
