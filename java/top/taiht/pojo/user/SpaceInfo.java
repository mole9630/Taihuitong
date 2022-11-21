package top.taiht.pojo.user;

public class SpaceInfo {
    private Integer uID;
    private String uName;
    private String uPhone;
    private String uVillage;
    private Integer uPoint;
    private Integer uStatus;
    private Integer uEventCount;

    public SpaceInfo() {
    }
    public SpaceInfo(Integer uID, String uName, String uPhone, String uVillage, Integer uPoint, Integer uStatus, Integer uEventCount) {
        this.uID = uID;
        this.uName = uName;
        this.uPhone = uPhone;
        this.uVillage = uVillage;
        this.uPoint = uPoint;
        this.uStatus = uStatus;
        this.uEventCount = uEventCount;
    }

    public Integer getuID() {
        return uID;
    }
    public void setuID(Integer uID) {
        this.uID = uID;
    }
    public String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public String getuPhone() {
        return uPhone;
    }
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }
    public String getuVillage() {
        return uVillage;
    }
    public void setuVillage(String uVillage) {
        this.uVillage = uVillage;
    }
    public Integer getuPoint() {
        return uPoint;
    }
    public void setuPoint(Integer uPoint) {
        this.uPoint = uPoint;
    }
    public Integer getuStatus() {
        return uStatus;
    }
    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }
    public Integer getuEventCount() {
        return uEventCount;
    }
    public void setuEventCount(Integer uEventCount) {
        this.uEventCount = uEventCount;
    }
}
