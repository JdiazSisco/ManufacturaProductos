package co.com.manufactura.dao;

import co.com.manufactura.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<Producto, Long>{
    
}
 