package poo_interfaces.repository;

import poo_interfaces.model.BaseEntity;
import poo_interfaces.model.Client;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements AllRepository<T>{

    List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> list() {
        return this.dataSource;
    }

    @Override
    public T byId(Integer id) {

        forClientById : for (T client : dataSource)
            if (client.getIdClient() == id) {
            return client;
            }
            return null;
    }

    @Override
    public void create(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void delete(T t) {
        this.dataSource.remove(t);
    }

    @Override
    public List<T> list(int from, int to) {
        return list().subList(from, to);
    }

    }

