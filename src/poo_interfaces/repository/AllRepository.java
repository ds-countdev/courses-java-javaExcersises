package poo_interfaces.repository;

public interface AllRepository<T> extends OrderRepository<T>, PagingRepository<T>, CrudRepository<T> {
}
