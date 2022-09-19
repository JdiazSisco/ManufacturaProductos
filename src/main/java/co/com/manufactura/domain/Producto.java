package co.com.manufactura.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data; 

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String nombre;
    private String estadoProducto;
}
