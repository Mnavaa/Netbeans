/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
      

/**
 *
 * @author isard
 */
public class ApostaService {
    private final List<Aposta> apostes = new Arraylist<>();
    
    public void afegirAposta(Aposta aposta){
        apostes.add(aposta); //afegir una aposta
        
    }
    public List<Aposta>ObtenirTotesLesApostes(){
        return new ArrayList<>(apostes); //llista totes les llistes
    }
    public Aposta ObtenirApostaPerId(int id){
        return apostes.stream()
                .filter(aposta -> aposta.getId()==id)
                .findFirst()
                .orElse(null);
    }
    
    public boolean modificarAposta(Aposta apostaActualizada){
        for (int i =0; i < apostes.size(); i++){
            if (apostes.get(i).getId()==apostaActualizada.getId()){
                apostes.set(i, apostaActualizada);
                return true;
            }
        }
        return false;
    }
    public boolean esborrarAposta(int id){
        return apostes.removeIf(aposta -> aposta.getId()==id );
    }
    
}
