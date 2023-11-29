package los.habilidosisimos.habil2.model;

public class UsuarioSignin {
    private String correoId;
    private String password;

    public UsuarioSignin(){ super();}

    public UsuarioSignin(String correoId, String password) {
        this.correoId = correoId;
        this.password = password;
    }

    public String getCorreoId() {
        return correoId;
    }

    public void setCorreoId(String correoId) {
        this.correoId = correoId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}
