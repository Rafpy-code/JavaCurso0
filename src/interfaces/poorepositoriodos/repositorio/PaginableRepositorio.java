package interfaces.poorepositoriodos.repositorio;

import interfaces.poorepositoriodos.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
