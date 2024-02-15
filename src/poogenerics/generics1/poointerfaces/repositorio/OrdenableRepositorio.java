package poogenerics.generics1.poointerfaces.repositorio;

import poogenerics.generics1.poointerfaces.modelo.*;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
