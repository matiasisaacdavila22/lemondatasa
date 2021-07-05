package com.lemon.listperson.repository;

import com.lemon.listperson.entity.Persona;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface PersonaRepository extends Repository<Persona, Long> {

    @Query(value = "select cuit as Cuit, cuit_representado as Cuit_rep, domicilio as Domicilio,\n" +
            " concat(tipo_telefono,'-',telefono) as Telefono, concat(actividad_id, '-',\n" +
            " DESCRIPCION) as Actividad, caracter as Caracter, rde8002.condicion as Condicion\n" +
            " from rde0000  inner join rde0002 on rde0000.id = operacion_id\n" +
            " inner join rde8000 on actividad_id = CODIGO\n" +
            " inner join rde0001 on rde0000.id = rde0001.operacion_id\n" +
            " inner join rde8001 on rde0001.caracter_id = rde8001.id\n" +
            " inner join rde8002 on rde0000.condicion_id = rde8002.id", nativeQuery = true)
    List<Persona> findAll();
}
