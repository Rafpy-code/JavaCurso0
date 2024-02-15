package poogenerics.generics2.poointerfaces.repositorio;

import poogenerics.generics2.poointerfaces.modelo.Cliente;


import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
