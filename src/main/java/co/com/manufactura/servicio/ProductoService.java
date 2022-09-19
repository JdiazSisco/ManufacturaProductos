package co.com.manufactura.servicio;

import co.com.manufactura.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    
    public void guardar(Producto producto);
    public Producto encontrarProducto(Producto producto);
    public List<Producto> listarProductos();
    public void eliminar(Producto producto);
    
}
