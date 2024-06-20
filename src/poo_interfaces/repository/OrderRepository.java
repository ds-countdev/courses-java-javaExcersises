package poo_interfaces.repository;

import poo_interfaces.model.Client;

import java.util.List;

public interface OrderRepository<T> {
    List<T> list(String field, Direction direction);
}
