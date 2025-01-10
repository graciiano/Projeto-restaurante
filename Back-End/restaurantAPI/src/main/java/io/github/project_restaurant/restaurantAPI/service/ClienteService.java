package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteCreateDTO;
import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteDTO;
import io.github.project_restaurant.restaurantAPI.entity.Clientes;
import io.github.project_restaurant.restaurantAPI.exception.RegraDeNegocioException;
import io.github.project_restaurant.restaurantAPI.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ObjectMapper objectMapper;

    //LISTAR TODOS OS CLIENTES
    public List<ClienteDTO> list() {
        List<ClienteDTO> clienteDTOList = clienteRepository.findAll()
                .stream()
                .map(cliente -> objectMapper.convertValue(cliente, ClienteDTO.class))
                .collect(Collectors.toList());
        return clienteDTOList;
    }

    //CRIAR UM CLIENTE

    public ClienteCreateDTO create(ClienteCreateDTO clienteDTO) throws RegraDeNegocioException {
        Clientes entity = objectMapper.convertValue(clienteDTO, Clientes.class);
        Clientes clienteSalvo = clienteRepository.save(entity);
        return objectMapper.convertValue(clienteSalvo, ClienteCreateDTO.class);

    }

    public ClienteCreateDTO update(Integer id, ClienteCreateDTO cliente) throws RegraDeNegocioException {
        System.out.println("Atualizando cliente com ID: " + id);

        Clientes clienteRecuperado = getClientes(id);
        if (clienteRecuperado == null) {
            throw new RegraDeNegocioException("Cliente não encontrado para o ID: " + id);
        }

        System.out.println("Cliente antes da atualização: " + clienteRecuperado);

        clienteRecuperado.setNome(cliente.getNome());
        clienteRecuperado.setEndereco(cliente.getEndereco());
        clienteRecuperado.setContato(cliente.getContato());

        System.out.println("Cliente após a atualização: " + clienteRecuperado);

        Clientes clienteSalvo = clienteRepository.save(clienteRecuperado);
        return objectMapper.convertValue(clienteSalvo, ClienteCreateDTO.class);
    }


  public ClienteDTO delete(Integer id) throws RegraDeNegocioException {
    Clientes cliente = getClientes(id); // Valida a existência
    clienteRepository.deleteById(cliente.getIdCliente());
    System.out.println("Cliente deletado com ID: " + cliente.getIdCliente());
    return objectMapper.convertValue(cliente, ClienteDTO.class);
}


    public Clientes getClientes(Integer id) throws RegraDeNegocioException {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RegraDeNegocioException("Cliente com o id: " + id + " não encontrado!!"));
    }



}