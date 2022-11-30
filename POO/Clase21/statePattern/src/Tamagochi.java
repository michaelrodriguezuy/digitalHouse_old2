public class Tamagochi {
    private String nombre;
    private StateTamagochi state;

    public Tamagochi(String nombre){
        this.nombre = nombre;
        this.state = new Feliz(this);
    }

    public void setState(StateTamagochi state) {
        this.state = state;
    }

    public StateTamagochi getState() {
        return state;
    }

    public void beber(){
        state.beber();
    }

    public void comer(){
        state.comer();
    }

    public void mimar(){
        state.mimar();
    }


}
