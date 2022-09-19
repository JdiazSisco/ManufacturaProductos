package co.com.manufactura.web;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import co.com.manufactura.domain.Producto;
import co.com.manufactura.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private ProductoService productoService;

    @RequestMapping("/consultaProductos")
    public List<Producto> consultaProductos() {
        return productoService.listarProductos();
    }

    @RequestMapping("/ConsultaProducto/{idProducto}")
    public List<Producto> consultaProducto(Producto producto) {
        return (List<Producto>) productoService.encontrarProducto(producto);
    }

    @RequestMapping("/eliminar/{idProducto}")
    public String eliminarProducto(Producto producto) {
        productoService.eliminar(producto);
        return "Producto eliminado";
    }

    @GetMapping("/actualizar/{idPersona}")
    public String actualizar(Producto producto) {
        productoService.guardar(producto);
        return "modificar";
    }

    @GetMapping("/agregar")
    public String agregarProducto(Producto producto) {
        productoService.guardar(producto);
        return "Guardado correctamente";
    }

}
