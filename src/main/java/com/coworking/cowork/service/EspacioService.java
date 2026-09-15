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

        return espacioRepository.save(espacio);
    }
    public boolean borrarEspacio(Long id){
       if(espacioRepository.existsById(id)){
           espacioRepository.deleteById(id);
           return true;
       }
       return  false;
    }
    public Espacio actualizarEspacio(Espacio espacio, Long id){
        if(!espacioRepository.existsById(id)){
            espacio.setId(id);
        return null;

        }
           return espacioRepository.save(espacio);
    }
    public List<Espacio> listarEspacios(){
        return espacioRepository.findAll();
    }
    public Optional<Espacio> buscarEspacio(Long id){
        return espacioRepository.findById(id);
    }
}
