package com.radiomed.demoDB.productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {
    private final ProductosRepository productosRepository;

    @Autowired
    public ProductosService(ProductosRepository productosRepository){
        this.productosRepository = productosRepository;
    }//constructor

    public List<Productos> getProductos(){
        return productosRepository.findAll();
    }//getProductos

    public Productos getProducto(Long productoId){
        return productosRepository.findById(productoId).orElseThrow(
                ()-> new IllegalStateException("Product does not exists " + productoId)
        );
    }//getProducto

    public void deleteProduct(Long productoId){
        if(productosRepository.existsById(productoId)){
            productosRepository.deleteById(productoId);
        }else{
            throw new IllegalStateException("Product does not exist " + productoId);
        }//else
    }//deleteProduct

    public void addProducto(Productos productos){
        Optional<Productos> productByName = productosRepository.findProductByName(productos.getTitle());
        if (productByName.isPresent()){
            throw new IllegalStateException("Product exist !!!");
        }//if
        productosRepository.save(productos);
    }//addProductos

    public void updateProducto(Long productoId, String title, String brand, String model, boolean status) {
        if(!productosRepository.existsById(productoId)){
            throw new IllegalStateException("Product does not exist "+productoId);
        }//if ! exists
        Productos productos = productosRepository.getById(productoId);

        if (productosRepository.existsById(productoId)) {
            //Productos productos = productosRepository.findById(productoId);
            if (title != null) productos.setTitle(title);
            if (brand != null) productos.setBrand(brand);
            if (model != null) productos.setModel(model);
            if(!status || status) productos.setStatus(status);
            productosRepository.save(productos);
        }//if

    }// updateUsuario
}//ProductosService
