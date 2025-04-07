import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SistemaGestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // listas para almacenar clientes y compras
        List<Cliente> clientes = new ArrayList<>();
        List<Compra> compras = new ArrayList<>();

        // inicia la tienda
        Tienda tienda = new Tienda("Av. salazar 1256");
        System.out.println("tienda creada con la direccion: " + tienda.getDireccion());


        // crea un computador de escritorio
        Pantalla pantalla1 = new Pantalla("LG", "UltraHD", 2021);
        ComputadorEscritorio desktop = new ComputadorEscritorio(
                "asus", 8, 512, "Intel i7", "vivo v222", 2022, 1200000, 10,
                "NVIDIA GTX 1650", "500W", "Mid Tower", pantalla1);
        if (desktop.getStock() >= 0) {
            tienda.agregarDispositivo(desktop);
        }

        // crea un notebook
        Notebook notebook = new Notebook(
                "HP", 16, 256, "Intel i5", "Pavilion", 2023, 600000, 5,
                "1920x1080", "retroiluminado", "4000mAh");
        if (notebook.getStock() >= 0) {
            tienda.agregarDispositivo(notebook);
        }

        // crea una tablet
        Tablet tablet = new Tablet(
                "samsung", 4, 128, "Exynos", "galaxy tab", 2021, 350000, 15,
                "1920x1200", Arrays.asList("lápiz", "funda"));
        if (tablet.getStock() >= 0 /* && tablet.precio >= 0 */) {
            tienda.agregarDispositivo(tablet);
        }

        GestorDatos.actualizarDatos(tienda, clientes, compras);

        // modifica la direccion de la tienda
        System.out.println("direccion actual de la tienda: " + tienda.getDireccion());
        System.out.print("ingrese nueva direccion para la tienda: ");
        String nuevaDireccion = scanner.nextLine();
        tienda.setDireccion(nuevaDireccion);
        System.out.println("direccion modificada: " + tienda.getDireccion());
        GestorDatos.actualizarDatos(tienda, clientes, compras);

        // registra un nuevo cliente
        System.out.print("ingrese el id del cliente: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.print("ingrese el correo del cliente: ");
        String correo = scanner.nextLine();
        while (!correo.contains("@")) {
            System.out.print("Correo invalido. Ingrese nuevamente: ");
            correo = scanner.nextLine();
        }
        System.out.print("ingrese el numero de contacto: ");
        String contacto = scanner.nextLine();
        System.out.print("ingrese el estado civil: ");
        String estadoCivil = scanner.nextLine();
        System.out.print("ingrese la ciudad: ");
        String ciudad = scanner.nextLine();

        Cliente cliente = new Cliente(id, nombre, apellido, correo, contacto, estadoCivil, ciudad);
        clientes.add(cliente);
        GestorDatos.actualizarDatos(tienda, clientes, compras);

        // busca los dispositivos
        System.out.println("buscar dispositivo por: (1) Marca, (2) Modelo, (3) Tipo");
        int opcionBusqueda = Integer.parseInt(scanner.nextLine());
        List<DispositivoTecnologico> resultados = new ArrayList<>();
        switch (opcionBusqueda) {
            case 1:
                System.out.print("ingrese la marca: ");
                String marcaBusqueda = scanner.nextLine();
                resultados = tienda.buscarPorMarca(marcaBusqueda);
                break;
            case 2:
                System.out.print("ingrese el modelo: ");
                String modeloBusqueda = scanner.nextLine();
                resultados = tienda.buscarPorModelo(modeloBusqueda);
                break;
            case 3:
                System.out.print("ingrese el tipo [Computador de escritorio, Notebook, Tablet]: ");
                String tipoBusqueda = scanner.nextLine();
                resultados = tienda.buscarPorTipo(tipoBusqueda);
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
        if (resultados.isEmpty()) {
            System.out.println("no se encontraron dispositivos");
        } else {
            System.out.println("dispositivos encontrados:");
            for (DispositivoTecnologico d : resultados) {
                d.mostrarEspecificaciones();
                System.out.println("-----------------------------------");
            }
        }

        // realiza una venta
        List<DetalleCompra> detallesCompra = new ArrayList<>();
        detallesCompra.add(new DetalleCompra(desktop, 1));
        detallesCompra.add(new DetalleCompra(tablet, 1));
        Compra compra = new Compra(cliente, detallesCompra);
        compra.realizarCompra();
        compras.add(compra);
        GestorDatos.actualizarDatos(tienda, clientes, compras);

        System.out.println("- detalles de la compra -");
        compra.mostrarCompra();

        // aqui ya muestra el catalogo actualizado
        System.out.println("- catalogo actualizado -");
        tienda.mostrarCatalogo();
    }
}
