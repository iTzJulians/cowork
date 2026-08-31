package com.coworking.cowork.service;

import com.coworking.cowork.model.Espacio;
import com.coworking.cowork.repository.EspacioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacioService {

    private final EspacioRepository espacioRepository;

    public EspacioService(EspacioRepository espacioRepository){
        this.espacioRepository = espacioRepository;
    }
    public Espacio crearEspacio(Espacio espacio){
       return espacioRepository.addEspacio(espacio);
    }
    public boolean borrarEspacio(Long id){
       return espacioRepository.deleteEspacio(id);
    }
    public Espacio actualizarEspacio(Espacio espacio, Long id){
        return espacioRepository.updateEspacio(espacio, id);
    }
    public List<Espacio> listarEspacios(){
        return espacioRepository.findAll();
    }
    public Optional<Espacio> buscarEspacio(Long id){
        return espacioRepository.findById(id);
    }
}
