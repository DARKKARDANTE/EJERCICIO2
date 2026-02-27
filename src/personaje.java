public class personaje {


    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida ;
    private boolean vivo;

    public personaje(String nombre, int nivel, int experiencia, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
        this.vivo = vivo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vida=" + vida +
                ", vivo=" + vivo +
                '}';
    }

    public void mostrarEstado(){

        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel : " + this.getNivel());
        System.out.println("Experiencia: " + this.getExperiencia());
        System.out.println("vida : " + this.getVida());
        System.out.println("vivo: " + this.isVivo());
    }

    public int ganarExperiencia(int sumaexperiencia){

        experiencia +=sumaexperiencia;
        System.out.println("Su experiencia ha aumentado "+ sumaexperiencia+" puntos"+"\nExperiencia total ");
        return experiencia;

    }

    public int subirDeNivel() {

        nivel += 1;
        experiencia = 0;
        return nivel;
    }

    public int recibirDano(int dano){
        vida -=dano;
        System.out.println("ha recibido "+ dano+" puntos de daño");
        if (vida<=0) {
            vivo = false;
        }
        return vida;
    }
    public int curarse(int curacion){
        vida +=curacion;
        System.out.println("Se ha curado "+ curacion+" puntos de vida");
        if (vida>=0) {
            vivo = true;
        }

        return vida;
    }


}
