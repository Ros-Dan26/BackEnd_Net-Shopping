/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.controllers.product;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.NoSuchElementException;
import static org.generation.netshoppingonline.controllers.user.UserEndPoints.PARAM_ID;
import org.generation.netshoppingonline.exceptions.products.ImageNotAddException;
import org.generation.netshoppingonline.exceptions.products.ProductNotFoundException;
import org.generation.netshoppingonline.models.product.ImageView;
import org.generation.netshoppingonline.models.product.ProductView;
import org.generation.netshoppingonline.services.product.ImageViewService;
import org.generation.netshoppingonline.services.product.ProductViewService;
import org.generation.netshoppingonline.services.product.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author JesusFloresTemahuay
 */
@RestController
@RequestMapping(ProductsEndPoints.ROOT + ProductsEndPoints.PRODUCT_VIEW)
public class ProductController implements ProductsEndPoints {

    private final ProductViewService productViewService;
    private final ImageViewService imageViewService;
    private final SizeService sizeService;

    @Autowired
    public ProductController(
            ProductViewService productViewService,
            ImageViewService imageViewService,
            SizeService sizeService) {
        this.productViewService = productViewService;
        this.imageViewService = imageViewService;
        this.sizeService =sizeService;
    }

    @GetMapping(ALL)
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(productViewService.findAll());
    }

    @GetMapping(FIND + PARAM_ID)
    public ResponseEntity<?> findById(@PathVariable int id) {
        ProductView p = null;
        try {
            p = productViewService.findById(id);
            System.out.println("id:" + id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);

        } catch (ProductNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(PARAM_IMAGES)
    public ResponseEntity<?> findImageByIdProduct(@PathVariable int id) {
        List<ImageView> p = null;
        try {
            p = imageViewService.findImageByIdProduct(id);
            System.out.println("id:" + id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);

        } catch (ProductNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping(ALL_SIZES)
    public ResponseEntity<?> getAllSizes() {
            String p [] = sizeService.getAllSizes();
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);
    }
    
    @GetMapping(PARAM_SIZE)
    public ResponseEntity<?> findSizeByIdProduct(@PathVariable int id) {
        List<ImageView> p = null;
        try {
            p = imageViewService.findImageByIdProduct(id);
            System.out.println("id:" + id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);

        } catch (ProductNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }
    
    
    

    /**
     * Este metodo se encarga de recibir un archivo binario y un texto que
     * representan la imagen y el id del producto respectivamente, el archivo se
     * espera que sea de imagen, el id debe de existir en el producto para que
     * sea agregado a la base de datos, adicional a ello proporciona desde el
     * backend el acceso al archivo desde el servidor por el puerto 80 para que
     * funcione desde internet.
     *
     * @param multipartFile
     * @param id
     * @return
     */
    @PostMapping(ADD_IMAGE_FILE)
    public ResponseEntity<?> addImageToProducto(
            @RequestParam("file") MultipartFile multipartFile,
            @RequestParam("id") int id) {
        URI uri = null;

        if (ALLOWED_MIME.contains(multipartFile.getContentType())) {

            if (multipartFile.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).
                        body("Imagen daniada");
            }
            try {
                String pathString = String.format(
                        LOCAL_PATH,
                        DIRECTORY,
                        id);
                Path path = Path.of(pathString);
                if (!Files.exists(path)) {
                    Files.createDirectories(path);
                }
                String pathPublic = URL_SERVER.
                        concat(DIRECTORY).
                        concat(File.separator).
                        concat(String.valueOf(id)).
                        concat(File.separator).
                        concat(multipartFile.getOriginalFilename());
                pathString = pathString.
                        concat(File.separator).
                        concat(multipartFile.getOriginalFilename());

                System.out.println("upload image to: " + pathString);
                System.out.println("Public access: " + pathPublic);

                ProductView p = (ProductView) findById(id).getBody();
                if (p != null) {
                    imageViewService.addImageToProducto(pathPublic, id);
                    File destinationFile = new File(pathString);
                    multipartFile.transferTo(destinationFile);

                    uri = ServletUriComponentsBuilder.
                            fromCurrentRequest().
                            path(pathString)
                            .buildAndExpand(multipartFile.toString())
                            .toUri();
                    return ResponseEntity.created(uri).
                            body("Imagen agregada correctamente.");
                }else{
                    return ResponseEntity.notFound().build();
                }

            } catch (IOException e) {
                System.out.println(e);
                return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY)
                        .body("Archivo corrupto: " + multipartFile.getContentType());
            } catch (ImageNotAddException e) {
                System.out.println(e);
                return ResponseEntity.notFound().build();
            }
        } else {
            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
                    .body("Tipo de archivo no permitido: " + multipartFile.getContentType());
        }
    }
}
