package hello.model;
import static javax. persistence. GenerationType. IDENTITY;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBL_TYPE_MEAS_QUANT")
public class TypeMq extends io.spring.guides.gs_producing_web_service.TypeMq {

//    private int idTypeMq;
//    private String nameTypeMq;
//    private String nickTq;
//    private String defaultUnit;
//    private String caclTpTq;
//    private String formulaTq;
//    private int imageIndex;
//    private int defaultColor;
    private Set<MeasQuants> measQuants = new HashSet<MeasQuants>();

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "QUANT_TYPE")
    public int getIdTypeMq() {
        return idTypeMq;
    }

    public void setIdTypeMq(int idTypeMq) {
        this.idTypeMq = idTypeMq;
    }

    @Column(name = "NAME_TYPE_QUANT")
    public String getNameTypeMq() {
        return nameTypeMq;
    }

    public void setNameTypeMq(String nameTypeMq) {
        this.nameTypeMq = nameTypeMq;
    }

    @Column(name = "TQ_NICK")
    public String getNickTq() {
        return nickTq;
    }

    public void setNickTq(String nickTq) {
        this.nickTq = nickTq;
    }

    @Column(name = "DEFAULT_UNIT")
    public String getDefaultUnit() {
        return defaultUnit;
    }

    public void setDefaultUnit(String defaultUnit) {
        this.defaultUnit = defaultUnit;
    }

    @Column(name = "TQ_CALC_TP")
    public String getCaclTpTq() {
        return caclTpTq;
    }

    public void setCaclTpTq(String caclTpTq) {
        this.caclTpTq = caclTpTq;
    }

    @Column(name = "TQ_FORMULA")
    public String getFormulaTq() {
        return formulaTq;
    }

    public void setFormulaTq(String formulaTq) {
        this.formulaTq = formulaTq;
    }

    @Column(name = "IMAGEINDEX")
    public int getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(int imageIndex) {
        this.imageIndex = imageIndex;
    }

    @Column(name = "DEFAULTCOLOR")
    public int getDefaultColor() {
        return defaultColor;
    }

    public void setDefaultColor(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    @OneToMany(mappedBy = "typeMq", cascade = CascadeType.ALL)
    public Set<MeasQuants> getMeasQuants() {
        return measQuants;
    }

    public void setMeasQuants(Set<MeasQuants> measQuants) {
        this.measQuants = measQuants;
    }
}
