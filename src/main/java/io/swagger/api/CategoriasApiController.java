package io.swagger.api;

import io.swagger.model.Categorias;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T13:35:21.408Z")

@Controller
public class CategoriasApiController implements CategoriasApi {

    private static final Logger log = LoggerFactory.getLogger(CategoriasApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CategoriasApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addCategoria(@ApiParam(value = "categoria item to add"  )  @Valid @RequestBody Categorias categoriaItem) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCategoria(@ApiParam(value = "categoria id to delete",required=true) @PathVariable("categoriaId") Long categoriaId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Categorias>> searchCategorias(@ApiParam(value = "pass an optional search string for looking up Categorias") @Valid @RequestParam(value = "searchString", required = false) String searchString,@Min(0)@ApiParam(value = "number of records to skip for pagination") @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @ApiParam(value = "maximum number of records to return") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Categorias>>(objectMapper.readValue("[ {  \"name\" : \"história\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}, {  \"name\" : \"história\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Categorias>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Categorias>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCategoria(@ApiParam(value = "categoria object that needs to be added to the store" ,required=true )  @Valid @RequestBody Categorias body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}