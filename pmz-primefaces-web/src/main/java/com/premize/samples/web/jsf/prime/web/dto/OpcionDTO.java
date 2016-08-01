package com.premize.samples.web.jsf.prime.web.dto;

import java.io.Serializable;
import java.util.List;

public class OpcionDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6048145981313019356L;
    private String etiqueta;
    private String link;
    private OpcionDTO opcionesPadre;
    private List<AccionDTO> acciones;

    public OpcionDTO(String etiqueta, String link, OpcionDTO opcionesPadre,
            List<AccionDTO> acciones) {
        super();
        this.etiqueta = etiqueta;
        this.link = link;
        this.opcionesPadre = opcionesPadre;
        this.acciones = acciones;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public OpcionDTO getOpcionesPadre() {
        return opcionesPadre;
    }

    public void setOpcionesPadre(OpcionDTO opcionesPadre) {
        this.opcionesPadre = opcionesPadre;
    }

    public List<AccionDTO> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<AccionDTO> acciones) {
        this.acciones = acciones;
    }

}
