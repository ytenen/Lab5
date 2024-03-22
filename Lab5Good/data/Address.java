package data;

public class Address {
    private String zipCode;//Длина строки не должна быть больше 22, Поле может быть null

    public  Address(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
