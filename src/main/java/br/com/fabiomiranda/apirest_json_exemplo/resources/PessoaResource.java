package br.com.fabiomiranda.apirest_json_exemplo.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fabiomiranda.apirest_json_exemplo.model.Pessoa;

@Path("pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaResource {
	
	
    @GET
    public List<Pessoa> buscarPessoas() {
        
    	Pessoa p1 = new Pessoa(1,"Aline","123.123.123-01",1.55,50.5);
    	Pessoa p2 = new Pessoa(2,"Bruno","123.123.123-02",1.88,111.5);
    	Pessoa p3 = new Pessoa(3,"Carlos","123.123.123-03",1.75,85.5);
    	
    	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
    	lista.add(p1);
    	lista.add(p2);
    	lista.add(p3);
    	
    	return lista;
    }
	

}
