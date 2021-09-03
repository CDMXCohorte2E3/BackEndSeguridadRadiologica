package com.radiomed.RadioMed.productos;


import com.radiomed.RadioMed.usuarios.Usuarios;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductosService {
    public final ArrayList<Productos> lista = new ArrayList<Productos>();
    public ProductosService(){
        lista.add(new Productos( "Mandil emplomado económico", "Marca Slim Royal", "E6995","$2904.90", "0.5mm de plomo|66x95 cm|Con bolsillo|Acabado textil", true));
        lista.add(new Productos( "Mandil emplomado estándar", "Marca Slim Royal", "S6995","$3646.65", "0.5mm de plomo|66x95 cm|Con bolsillo|Acabado plástico", true));

    }//constructor

    public List<Productos> getProductos(){
        return lista;
    }//getProductos

    public Productos getProducto(Long productoId){
        return lista.get(productoId.intValue()-1);
    }//getProducto

    public void deleteProduct(Long productoId){
        if (productoId<= lista.size()){
            lista.remove(productoId.intValue()-1);
        }//if
    }//deleteProduct

    public void addProducto(Productos productos){
        lista.add(productos);
    }//addProductos

    public void updateProducto(Long productoId, String title, String brand, String model, boolean status) {
        if (productoId<= lista.size()) {
            Productos tmpPro = lista.get(productoId.intValue()-1);
            if (title != null) tmpPro.setTitle(title);
            if (brand != null) tmpPro.setBrand(brand);
            if (model != null) tmpPro.setModel(model);
            if(!status || status) tmpPro.setStatus(status);
        }//if
    }// updateUsuario

}//Class ProductosService
