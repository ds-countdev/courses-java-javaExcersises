package poo_interfaces.repository;

import poo_interfaces.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository extends AbstractListRepository<Client>{

    @Override
    public void update(Client client) {
        var clientInstance = this.byId(client.getIdClient());
        clientInstance.setName(client.getName());
        clientInstance.setLastName(client.getLastName());
    }

    @Override
    public List<Client> list(String field, Direction direction) {
        this.dataSource.sort((clientA, clientB) -> {
            var result = 0;
            if (direction == Direction.ASC) {
                switch (field) {
                    case "id" -> result = Integer.compare(clientA.getIdClient(), clientB.getIdClient());
                    case "name" -> result = clientA.getName().compareTo(clientB.getName());
                    case "lastName" -> result = clientA.getLastName().compareTo(clientB.getLastName());
                }
            } else if (direction == Direction.DESC) {
                switch (field) {
                    case "id" -> result = Integer.compare(clientB.getIdClient(), clientA.getIdClient());
                    case "name" -> result = clientB.getName().compareTo(clientA.getName());
                    case "lastName" -> result = clientB.getLastName().compareTo(clientA.getLastName());
                }
            }
            return result;
        });
        return dataSource;
    }
}

