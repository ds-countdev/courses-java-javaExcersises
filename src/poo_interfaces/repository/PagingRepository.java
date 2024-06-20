package poo_interfaces.repository;

import poo_interfaces.model.Client;

import java.util.List;

public interface PagingRepository<T> {
    List<T> list(int from, int to);
}
