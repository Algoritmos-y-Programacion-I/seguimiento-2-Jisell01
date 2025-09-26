package model;

public class BancoIcesiController {

    private Pokemon[] pokemons;

    public Controller(int size) {
        pokemons = new Pokemon[size];
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }


    public BancoIcesiController(){

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Añada los metodos que considere hagan falta para satisfacer los requerimientos.
     * Para cada metodo:
     *      Agregue los parametros y retorno que sean pertinentes.
     *      Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos.
     */
    public void agregarCuentaCliente() {

    }

   
    public void depositarDineroCuenta() {

    }

    
    public void retirarDineroCuenta() {

    }

    public void getClienteList() {

    }

   

}

package model;

public class Controller {

    private Pokemon[] pokemons;

    public Controller(int size) {
        pokemons = new Pokemon[size];
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
    
    public void addPokemon(String nombre, TipoPokemon tipo, int nivel, int ataque, int salud) {
        for(int i = 0; i < pokemons.length; i++) {
            if(pokemons[i] == null) {
                pokemons[i] = new Pokemon(nombre, tipo, nivel, ataque, salud);
                break;
            }
        }
    }
}
