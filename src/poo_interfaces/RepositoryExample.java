package poo_interfaces;

import poo_interfaces.model.Client;
import poo_interfaces.repository.AbstractListRepository;
import poo_interfaces.repository.ClientListRepository;
import poo_interfaces.repository.CrudRepository;
import static poo_interfaces.repository.Direction.ASC;
import poo_interfaces.repository.OrderRepository;
import poo_interfaces.repository.PagingRepository;

public class RepositoryExample {

    public static void main(String[] args) {


        var repository = new ClientListRepository();
        repository.create(new Client ("Jano", "Perez"));
        repository.create(new Client ("Bea", "Gonzalez"));
        repository.create(new Client ("Luci", "Martinez"));
        repository.create(new Client ("Diego", "Rodriguez"));

        var clientes = repository.list();
        clientes.forEach(System.out::println);

        System.out.println("========= PAGING ========");

        var paging = repository.list(1,2);
        paging.forEach(System.out::println);


        System.out.println("========== Order ===========");

        var order = repository.list("name", ASC);

        for (Client client : order) System.out.println(client);

        System.out.println("====== EDIT ========");

        var diegoEdit = new Client("Diego", "Solano");
        diegoEdit.setIdClient(4);

        repository.update(diegoEdit);

        var diego = repository.byId(4);
        System.out.println(diego);

        repository.list("name", ASC).forEach(System.out::println);


        System.out.println("======= DELETE ========");
        repository.delete(new Client("Diego","Solano"));
        repository.list().forEach(System.out::println);

    }
}
