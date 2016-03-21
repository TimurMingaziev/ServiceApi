package hello.model;

import org.apache.log4j.Logger;

import javax.persistence.*;
import java.util.Date;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;

@Entity
@Table(name = "TBL_MEAS_QUANT")
@NamedQueries({
        @NamedQuery(name="MeasQuants.getById",
                query="select distinct cel from MeasQuants cel Where cel.idMq=:id")})
public class MeasQuants extends io.spring.guides.gs_producing_web_service.MeasQuants{

//    private int idMq;
//    private TypeMq typeMq;
//    private String nameMq;
//    private int idCH;
//    private int taskLevel;
//    private int DGDId;
//    private Date arcPeriod;
//    private int calcType;
//    private int refChanTq;
//    private Date lastTs;
//    private Date lastTs30;
//    private Date lastTS1;
//    private int refDeviceid;
//    private int arcType;

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
        return (TypeMq) typeMq;
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
        return  dgdId;
    }

    public void setDGDId(int DGDId) {
        this.dgdId = DGDId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ARC_PERIOD")
    public Date getArcPeriodDate() {
        return toDate(arcPeriod);
    }

    public void setArcPeriodDate(Date arcPeriod) {
        this.arcPeriod = toXMLGregorianCalendar(arcPeriod);
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
    public Date getLastTsDate() {
        return  toDate(lastTs);
    }

    public void setLastTsDate(Date lastTs) {
        this.lastTs = toXMLGregorianCalendar(lastTs);
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_TS_30")
    public Date getLastTs30Date() {
        return toDate(lastTs30);
    }

    public void setLastTs30Date(Date lastTs30) {
        this.lastTs30 = toXMLGregorianCalendar(lastTs30);
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_TS_1")
    public Date getLastTS1Date() {
        return toDate(lastTS1);
    }

    public void setLastTS1Date(Date lastTS1) {
        this.lastTS1 = toXMLGregorianCalendar(lastTS1);
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

    public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }
    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;

        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) { }

        return xmlCalendar;
    }


}
