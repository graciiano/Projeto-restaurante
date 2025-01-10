package io.github.project_restaurant.restaurantAPI.controller;


import ch.qos.logback.core.net.server.Client;
import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteCreateDTO;
import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteDTO;
import io.github.project_restaurant.restaurantAPI.entity.Clientes;
import io.github.project_restaurant.restaurantAPI.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
@Validated
@Slf4j
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> list() {
        return new ResponseEntity<>(clienteService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ClienteCreateDTO> create(@RequestBody ClienteCreateDTO cliente) throws Exception {
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.OK);
    }

    @PutMapping("/{idCliente}")
    public ResponseEntity<ClienteCreateDTO> updtate(@PathVariable("idCLiente") Integer id,
                                                    @RequestBody ClienteCreateDTO cliente) throws Exception {
        return new ResponseEntity<>(clienteService.update(id, cliente), HttpStatus.OK);
    }

    @DeleteMapping("/{idCliente}")
    public ResponseEntity<ClienteDTO> delete(@PathVariable("idCliente") Integer id) throws Exception{
        log.info("cliente deletado");
        return new ResponseEntity<>(clienteService.delete(id), HttpStatus.OK);
    }
}
