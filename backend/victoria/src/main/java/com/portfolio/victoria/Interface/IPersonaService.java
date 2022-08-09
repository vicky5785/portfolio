
package com.portfolio.victoria.Interface;

import com.portfolio.victoria.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    public Persona findPersona(Long id);
}
 