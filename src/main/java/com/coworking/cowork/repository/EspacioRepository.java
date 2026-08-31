package com.coworking.cowork.repository;

import com.coworking.cowork.model.Espacio;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public class EspacioRepository {

    private final List<Espacio> espacios = new ArrayList<>();
    private Long contadorId;
    public EspacioRepository(){
        this.contadorId = 0L;
    }

    public List<Espacio> findAll() {
        return espacios;
    }

    public Optional<Espacio> findById(Long id) {
        return espacios.stream()
                .filter(espacio -> espacio.getId().equals(id)).findFirst();
    }

    public Espacio addEspacio(Espacio espacio) {
        espacio.setId(contadorId);
        contadorId++;
        espacios.add(espacio);
        return espacio;
    }

    public Espacio updateEspacio(Espacio espacio, Long id) {
        Optional<Espacio> espacioPorActualizar = findById(id);
        espacioPorActualizar.ifPresent(espacioAct -> {
                    espacioAct.setNombre(espacio.getNombre());
                    espacioAct.setDescription(espacio.getDescription());
                    espacioAct.setCapacidad(espacio.getCapacidad());
                    espacioAct.setNombreCategoria(espacio.getNombreCategoria());
                    espacioAct.setPrecioHora(espacio.getPrecioHora());
                    espacioAct.setNombreSede(espacio.getNombreSede());

                }
        );
        return espacioPorActualizar.orElse(null);

    }

    public boolean deleteEspacio(Long id) {
        Optional<Espacio> espacioPorEliminar = findById(id);
        return espacioPorEliminar.map(espacios::remove).orElse(false);

    }
}
