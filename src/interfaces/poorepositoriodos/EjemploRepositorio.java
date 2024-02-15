package interfaces.poorepositoriodos;

import interfaces.poorepositoriodos.modelo.Cliente;
import interfaces.poorepositoriodos.repositorio.ClienteListRepositorio;
import interfaces.poorepositoriodos.repositorio.Direccion;
import interfaces.poorepositoriodos.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio() {
            @Override
            public List<interfaces.poorepositoriodos.modelo.Cliente> listar() {
                return null;
            }

            @Override
            public interfaces.poorepositoriodos.modelo.Cliente porId(Integer id) {
                return null;
            }

            @Override
            public void crear(interfaces.poorepositoriodos.modelo.Cliente cliente) {

            }

            @Override
            public void editar(interfaces.poorepositoriodos.modelo.Cliente cliente) {

            }

            @Override
            public void eliminar(Integer id) {

            }
        };

        repo.crear(new Cliente("Ramón", "Portalanza"));
        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés", "Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Cliente> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        for(Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println(" ============= ");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total ===== ");
        //System.out.println("Total registros: " + repo.total());

    }
}
