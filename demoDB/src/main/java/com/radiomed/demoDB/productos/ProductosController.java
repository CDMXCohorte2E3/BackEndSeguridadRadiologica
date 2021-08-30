package com.radiomed.demoDB.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/productos")
public class ProductosController {
    private final ProductosService productosService;

    @Autowired
    public ProductosController(ProductosService productosService){
        this.productosService = productosService;
    }//constructor

    @GetMapping
    public List<Productos> getProductos(){

        return productosService.getProductos();
    }//getProductos

    //api/productos/1
    @GetMapping(path="{productoId}")
    public Productos getProducto(@PathVariable("productoId")
                                         Long productoId){
        return productosService.getProducto(productoId);
    }//getProducto

    //api/productos/1
    @DeleteMapping(path="{productoId}")
    public void deleteProducto(@PathVariable("productoId")
                                       Long productoId){
        productosService.deleteProduct(productoId);
    }//deleteProducto

    @PostMapping
    public void addProducto(@RequestBody Productos productos){

        productosService.addProducto(productos);
    }//addProducto

    @PutMapping(path = "{productoId}")
    public void updateProducto(@PathVariable("productoId") Long productoId,
                               @RequestParam(required = false) String title,
                               @RequestParam(required = false) String brand,
                               @RequestParam(required = false) String model,
                               @RequestParam(required = false)boolean status){
        productosService.updateProducto(productoId, title,brand, model, status );
    }//updateProducto
}//ProductosController
