package hello.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_MEAS_QUANT")
public class MeasQuants {

    private int idMq;
    private TypeMq typeMq;
    private String nameMq;
    private int idCH;
    private int taskLevel;
    private int DGDId;
    private Date arcPeriod;
    private int calcType;
    private int refChanTq;
    private Date lastTs;
    private Date lastTs30;
    private Date lastTS1;
    private int refDeviceid;
    private int arcType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MQUANT_ID")
    public int getIdMq() {
        return idMq;
    }

    public void setIdMq(int idMq) {
        this.idMq = idMq;
    }

    @ManyToOne
    @JoinColumn(name = "QUANT_TYPE")
    public TypeMq getTypeMq() {
        return typeMq;
    }

    public void setTypeMq(TypeMq typeMq) {
        this.typeMq = typeMq;
    }

    @Column(name = "QUANT_NAME")
    public String getNameMq() {
        return nameMq;
    }

    public void setNameMq(String nameMq) {
        this.nameMq = nameMq;
    }

    @Column(name = "CH_ID")
    public int getIdCH() {
        return idCH;
    }

    public void setIdCH(int idCH) {
        this.idCH = idCH;
    }

    @Column(name = "TASK_LEVEL")
    public int getTaskLevel() {
        return taskLevel;
    }

    public void setTaskLevel(int taskLevel) {
        this.taskLevel = taskLevel;
    }

    @Column(name = "DGD_ID")
    public int getDGDId() {
        return DGDId;
    }

    public void setDGDId(int DGDId) {
        this.DGDId = DGDId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ARC_PERIOD")
    public Date getArcPeriod() {
        return arcPeriod;
    }

    public void setArcPeriod(Date arcPeriod) {
        this.arcPeriod = arcPeriod;
    }

    @Column(name = "CALC_TYPE")
    public int getCalcType() {
        return calcType;
    }

    public void setCalcType(int calcType) {
        this.calcType = calcType;
    }

    @Column(name = "MQ_REF_CHAN")
    public int getRefChanTq() {
        return refChanTq;
    }

    public void setRefChanTq(int refChanTq) {
        this.refChanTq = refChanTq;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_TS")
    public Date getLastTs() {
        return lastTs;
    }

    public void setLastTs(Date lastTs) {
        this.lastTs = lastTs;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_TS_30")
    public Date getLastTs30() {
        return lastTs30;
    }

    public void setLastTs30(Date lastTs30) {
        this.lastTs30 = lastTs30;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_TS_1")
    public Date getLastTS1() {
        return lastTS1;
    }

    public void setLastTS1(Date lastTS1) {
        this.lastTS1 = lastTS1;
    }

    @Column(name = "REF_DEVICE_ID")
    public int getRefDeviceid() {
        return refDeviceid;
    }

    public void setRefDeviceid(int refDeviceid) {
        this.refDeviceid = refDeviceid;
    }

    @Column(name = "ARC_TYPE")
    public int getArcType() {
        return arcType;
    }

    public void setArcType(int arcType) {
        this.arcType = arcType;
    }
}
