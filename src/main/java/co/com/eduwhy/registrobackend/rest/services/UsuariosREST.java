/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.eduwhy.registrobackend.rest.services;

import co.com.eduwhy.registrobackend.jpa.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author leoandresm
 */
@Path("usuarios")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class UsuariosREST {
    
    @POST
    public void create(Usuario usuario) {
        System.out.println("Usuario creado Exitosamente");
    }
    
    @GET
    public List<Usuario> findAll(){
        List<Usuario> temp = new ArrayList<>();
        temp.add(new Usuario("14590725", "Leo", "Moreno", "3007648308", "trainers@eduwhy.com.co", "", "", "C.C.", "M"));
        return temp;
    }
    
    
}
