package poogenerics.generics1.poointerfaces.repositorio;

import poogenerics.generics1.poointerfaces.modelo.Cliente;


import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
