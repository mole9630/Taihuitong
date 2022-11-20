package top.taiht.pojo.user;

public class User {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uIdentificationNumber;
    private Integer uSex;
    private String uPhone;
    private String uEthnic;
    private String uVillage;
    private Integer uStatus;

    public User() {
    }

    public User(Integer uId, String uName, String uPassword, String uIdentificationNumber, Integer uSex, String uPhone, String uEthnic, String uVillage, Integer uStatus) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uIdentificationNumber = uIdentificationNumber;
        this.uSex = uSex;
        this.uPhone = uPhone;
        this.uEthnic = uEthnic;
        this.uVillage = uVillage;
        this.uStatus = uStatus;
    }

    public Integer getuId() {
        return uId;
    }
    public void setuId(Integer uId) {
        this.uId = uId;
    }
    public String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public String getuPassword() {
        return uPassword;
    }
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }
    public String getuIdentificationNumber() {
        return uIdentificationNumber;
    }
    public void setuIdentificationNumber(String uIdentificationNumber) {
        this.uIdentificationNumber = uIdentificationNumber;
    }
    public Integer getuSex() {
        return uSex;
    }
    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }
    public String getuPhone() {
        return uPhone;
    }
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }
    public String getuEthnic() {
        return uEthnic;
    }
    public void setuEthnic(String uEthnic) {
        this.uEthnic = uEthnic;
    }
    public String getuVillage() {
        return uVillage;
    }
    public void setuVillage(String uVillage) {
        this.uVillage = uVillage;
    }
    public Integer getuStatus() {
        return uStatus;
    }
    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }
}
