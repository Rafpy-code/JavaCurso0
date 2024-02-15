package poogenerics.generics2.poointerfaces.repositorio;

import poogenerics.generics2.poointerfaces.modelo.Cliente;


import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
