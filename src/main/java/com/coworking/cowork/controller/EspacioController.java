package com.coworking.cowork.controller;

import com.coworking.cowork.model.Espacio;
import com.coworking.cowork.service.EspacioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/espacios")
public class EspacioController {
    private final EspacioService espacioService;

    public EspacioController(EspacioService espacioService) {
        this.espacioService = espacioService;
    }

    @GetMapping
    public ResponseEntity<List<Espacio>> listarEspacios() {
        return ResponseEntity.ok(espacioService.listarEspacios());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Espacio>> buscarPorId(@PathVariable Long id) {
        if (espacioService.buscarEspacio(id).isPresent()) {
            return ResponseEntity.ok(espacioService.buscarEspacio(id));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Espacio> crearEspacio(@RequestBody Espacio espacio) {
        Espacio nuevoEspacio = espacioService.crearEspacio(espacio);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEspacio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Espacio> actualizarEspacio(@RequestBody Espacio espacio, @PathVariable Long id) {
        Espacio espacioActualizado = espacioService.actualizarEspacio(espacio, id);
        if (espacioActualizado != null)
            return ResponseEntity.ok(espacioActualizado);
        else
            return ResponseEntity.notFound().build();

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarEspacio(@PathVariable Long id){
        if(espacioService.borrarEspacio(id))
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.notFound().build();
    }
}
