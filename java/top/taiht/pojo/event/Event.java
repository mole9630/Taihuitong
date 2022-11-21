package top.taiht.pojo.event;

public class Event {
    private Integer eID;
    private String eName;
    private Integer ePeopleNumber;
    private String eAddress;
    private String eStartTime;
    private String eEndTime;
    private String eIntroduction;
    private Integer ePoint;
    private Integer eStatus;

    public Event() {
    }

    public Event(Integer eID, String eName, Integer ePeopleNumber, String eAddress, String eStartTime, String eEndTime, String eIntroduction, Integer ePoint, Integer eStatus) {
        this.eID = eID;
        this.eName = eName;
        this.ePeopleNumber = ePeopleNumber;
        this.eAddress = eAddress;
        this.eStartTime = eStartTime;
        this.eEndTime = eEndTime;
        this.eIntroduction = eIntroduction;
        this.ePoint = ePoint;
        this.eStatus = eStatus;
    }

    public Integer geteID() {
        return eID;
    }
    public void seteID(Integer eID) {
        this.eID = eID;
    }
    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public Integer getePeopleNumber() {
        return ePeopleNumber;
    }
    public void setePeopleNumber(Integer ePeopleNumber) {
        this.ePeopleNumber = ePeopleNumber;
    }
    public String geteAddress() {
        return eAddress;
    }
    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }
    public String geteStartTime() {
        return eStartTime;
    }
    public void seteStartTime(String eStartTime) {
        this.eStartTime = eStartTime;
    }
    public String geteEndTime() {
        return eEndTime;
    }
    public void seteEndTime(String eEndTime) {
        this.eEndTime = eEndTime;
    }
    public String geteIntroduction() {
        return eIntroduction;
    }
    public void seteIntroduction(String eIntroduction) {
        this.eIntroduction = eIntroduction;
    }
    public Integer getePoint() {
        return ePoint;
    }
    public void setePoint(Integer ePoint) {
        this.ePoint = ePoint;
    }
    public Integer geteStatus() {
        return eStatus;
    }
    public void seteStatus(Integer eStatus) {
        this.eStatus = eStatus;
    }
}
