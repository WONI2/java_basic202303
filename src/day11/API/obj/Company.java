package day11.API.obj;

public class Company {
    String companyName;
    String address; //회사주소


    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;


    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
