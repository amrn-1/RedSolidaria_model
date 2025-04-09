package org.utl.dsm.redsolidaria.model;

public class TransaccionDTO {
    private int idTransaccion;
    private int idIntercambio;
    private int idUsuarioOferente;
    private String nombreOferente;
    private int idUsuarioSolicitante;
    private String nombreSolicitante;
    private float horasIntercambiadas;
    private String fecha; // Fecha como String en formato "yyyy-MM-dd"
    private String detalles;
    private boolean verificadoOferente;
    private boolean verificadoSolicitante;
    private String tituloServicio;
    private int estatus;
    private float horasRecibidas;
    private float horasOfrecidas;
    private int intercambiosCompletados;

    public TransaccionDTO() {
    }

    // Método para convertir de Transaccion a TransaccionDTO
    public static TransaccionDTO fromTransaccion(Transaccion t) {
        TransaccionDTO dto = new TransaccionDTO();
        dto.setIdTransaccion(t.getIdTransaccion());
        if (t.getIntercambio() != null) {
            dto.setIdIntercambio(t.getIntercambio().getIdIntercambio());
        }
        if (t.getOferente() != null) {
            dto.setIdUsuarioOferente(t.getOferente().getIdUsuario());
            dto.setNombreOferente(t.getOferente().getNombre());
        }
        if (t.getSolicitante() != null) {
            dto.setIdUsuarioSolicitante(t.getSolicitante().getIdUsuario());
            dto.setNombreSolicitante(t.getSolicitante().getNombre());
        }
        dto.setHorasIntercambiadas(t.getHorasIntercambiadas());
        if (t.getFecha() != null) {
            dto.setFecha(t.getFecha().toString()); // Convertir LocalDate a String
        }
        dto.setDetalles(t.getDetalles());
        dto.setVerificadoOferente(t.isVerificadoOferente());
        dto.setVerificadoSolicitante(t.isVerificadoSolicitante());
        dto.setEstatus(t.getEstatus());
        dto.setTituloServicio(t.getTituloServicio());
        dto.setHorasRecibidas(t.getHorasRecibidas());
        dto.setHorasOfrecidas(t.getHorasOfrecidas());
        dto.setIntercambiosCompletados(t.getIntercambiosCompletados());
        return dto;
    }

    // Getters y setters
    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getIdIntercambio() {
        return idIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        this.idIntercambio = idIntercambio;
    }

    public int getIdUsuarioOferente() {
        return idUsuarioOferente;
    }

    public void setIdUsuarioOferente(int idUsuarioOferente) {
        this.idUsuarioOferente = idUsuarioOferente;
    }

    public String getNombreOferente() {
        return nombreOferente;
    }

    public void setNombreOferente(String nombreOferente) {
        this.nombreOferente = nombreOferente;
    }

    public int getIdUsuarioSolicitante() {
        return idUsuarioSolicitante;
    }

    public void setIdUsuarioSolicitante(int idUsuarioSolicitante) {
        this.idUsuarioSolicitante = idUsuarioSolicitante;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public float getHorasIntercambiadas() {
        return horasIntercambiadas;
    }

    public void setHorasIntercambiadas(float horasIntercambiadas) {
        this.horasIntercambiadas = horasIntercambiadas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public boolean isVerificadoOferente() {
        return verificadoOferente;
    }

    public void setVerificadoOferente(boolean verificadoOferente) {
        this.verificadoOferente = verificadoOferente;
    }

    public boolean isVerificadoSolicitante() {
        return verificadoSolicitante;
    }

    public void setVerificadoSolicitante(boolean verificadoSolicitante) {
        this.verificadoSolicitante = verificadoSolicitante;
    }

    public String getTituloServicio() {
        return tituloServicio;
    }

    public void setTituloServicio(String tituloServicio) {
        this.tituloServicio = tituloServicio;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public float getHorasRecibidas() {
        return horasRecibidas;
    }

    public void setHorasRecibidas(float horasRecibidas) {
        this.horasRecibidas = horasRecibidas;
    }

    public float getHorasOfrecidas() {
        return horasOfrecidas;
    }

    public void setHorasOfrecidas(float horasOfrecidas) {
        this.horasOfrecidas = horasOfrecidas;
    }

    public int getIntercambiosCompletados() {
        return intercambiosCompletados;
    }

    public void setIntercambiosCompletados(int intercambiosCompletados) {
        this.intercambiosCompletados = intercambiosCompletados;
    }
}