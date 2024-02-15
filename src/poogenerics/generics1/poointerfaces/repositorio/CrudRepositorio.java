package poogenerics.generics1.poointerfaces.repositorio;

import poogenerics.generics1.poointerfaces.modelo.*;


import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
