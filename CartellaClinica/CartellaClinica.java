package CartellaClinica;

public class CartellaClinica {
    private String nomePaziente;
    private String cognomePaziente;
    private String dataNascita;
    private String codiceFiscale;
    private String numeroTelefono;
    private String dataVisita;
    private String diagnosi;

    public CartellaClinica(String nomePaziente, String cognomePaziente, String dataNascita,String codiceFiscale,String numeroTelefono,String dataVisita,String diagnosi){
        this.nomePaziente = nomePaziente;
        this.cognomePaziente = cognomePaziente;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.numeroTelefono = numeroTelefono;
        this.dataVisita = dataVisita;
        this.diagnosi = diagnosi;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setCognomePaziente(String cognomePaziente) {
        this.cognomePaziente = cognomePaziente;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setDataVisita(String dataVisita) {
        this.dataVisita = dataVisita;
    }

    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    public void setNomePaziente(String nomePaziente) {
        this.nomePaziente = nomePaziente;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getCognomePaziente() {
        return cognomePaziente;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getDataVisita() {
        return dataVisita;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public String getNomePaziente() {
        return nomePaziente;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}
