package hello.model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_PRIVILEGES")
public class Previliges {
    private int idPrev;
    private int resoursId;
    private String resourseType;
    private int roleId;
    private String roleType;
    private String priveMode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    public int getIdPrev() {
        return idPrev;
    }

    public void setIdPrev(int idPrev) {
        this.idPrev = idPrev;
    }

    @Column (name = "RESOURCEID")
    public int getResoursId() {
        return resoursId;
    }

    public void setResoursId(int resoursId) {
        this.resoursId = resoursId;
    }

    @Column (name = "RESOURCETYPE")
    public String getResourseType() {
        return resourseType;
    }

    public void setResourseType(String resourseType) {
        this.resourseType = resourseType;
    }

    @Column (name = "ROLEID")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column (name = "ROLETYPE")
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Column (name = "PRIV_MODE")
    public String getPriveMode() {
        return priveMode;
    }

    public void setPriveMode(String priveMode) {
        this.priveMode = priveMode;
    }
}
