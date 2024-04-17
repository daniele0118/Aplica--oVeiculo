
package aplicaçãoveiculo;

public class Informacoes {
    
    private Integer count;
    private Veiculo dadosVeiculos[];
    
    
    public Informacoes(){
        dadosVeiculos = new Veiculo[100];
    }
    
    public boolean cadastro(Veiculo veiculo){
        boolean bool=true;
        for(int i=0; i<dadosVeiculos.length; i++){
            if(dadosVeiculos[i]!= null){
              if(dadosVeiculos[i].placa.equals(veiculo.placa)){
               bool=false;
               break;
              }  
            }
            if(dadosVeiculos[i]== null){
                
                dadosVeiculos[i] = veiculo;
                break;
            }
              
        }
        return bool;
    }
    
    
    public Veiculo visualizar(){
        for(int i = 0 ; i < dadosVeiculos.length ; i++){
            try{
                if(!dadosVeiculos[i].getPlaca().equals("")){
                    count = i;
                    return dadosVeiculos[i];
                }
            }catch(NullPointerException e){
            }
        }
        return null;
    }
    
    public Veiculo proximo(){
        for(int i = count+1 ; i<dadosVeiculos.length;i++){
            if(dadosVeiculos[i] != null ){
                count = i;
                return dadosVeiculos[i];
            }
        }
        return null;
    }
    
    public Veiculo anterior(){
        for(int i = count-1 ; i>=0 ;i--){
            if(dadosVeiculos[i] != null ){
                count = i;
                return dadosVeiculos[i];
            }
        }
        return null;
    }
    
    public boolean excluir(String placa){
        boolean sucesso = false;
        for(int i = 0 ; i<dadosVeiculos.length;i++){
            if(dadosVeiculos[i] != null){
                if(dadosVeiculos[i].placa.equals(placa)){
                    sucesso = true;
                    dadosVeiculos[i] = null;
                    
                    break;
                }
            }
        }
        return sucesso;
    }
    
    public Veiculo pesquisar(String placa){
        for(int i = 0 ; i<dadosVeiculos.length;i++){
            if(dadosVeiculos[i] != null){
                if(dadosVeiculos[i].placa.equals(placa)){
                    return dadosVeiculos[i];
                }
            }
        }
        return null;
    }
    
    public Veiculo[] listar(){
        return dadosVeiculos;
    }
    
}
