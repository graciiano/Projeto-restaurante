package io.github.project_restaurant.restaurantAPI.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.security.UsuarioCreateDTO;
import io.github.project_restaurant.restaurantAPI.dto.security.UsuarioDTO;
import io.github.project_restaurant.restaurantAPI.entity.CargoEntity;
import io.github.project_restaurant.restaurantAPI.entity.UsuarioEntity;
import io.github.project_restaurant.restaurantAPI.repository.CargoRepository;
import io.github.project_restaurant.restaurantAPI.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final ObjectMapper objectMapper;
    private final CargoRepository cargoRepository;

    public Optional<UsuarioEntity> findByLoginAndSenha(String login, String senha) {

        return usuarioRepository.findByLoginAndSenha(login, senha);
    }


    public UsuarioCreateDTO create(UsuarioCreateDTO usuarioDTO, PasswordEncoder passwordEncoder, Integer idCargo) throws Exception {
        UsuarioEntity usuarioEntity = objectMapper.convertValue(usuarioDTO, UsuarioEntity.class);

        usuarioEntity.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));

        CargoEntity cargo = cargoRepository.findById(idCargo)
                .orElseThrow(() -> new Exception("Cargo não encontrado"));

        //add id
        if (usuarioEntity.getCargos() == null) {
            usuarioEntity.setCargos(new HashSet<>()); //inicia os cargos criado
        }
        usuarioEntity.getCargos().add(cargo);

        //salva
        UsuarioEntity usuarioSalvo = usuarioRepository.save(usuarioEntity);

        return objectMapper.convertValue(usuarioSalvo, UsuarioDTO.class);
    }

    public Optional<UsuarioEntity> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    public Optional<UsuarioEntity> findByLogin(String login){
        return usuarioRepository.findByLogin(login);
    }
}