package depndency.injection;

public class ClassDI {

    private String name;
    private String fname;
    private int rollno;
    private Address address;

    public ClassDI(String name, String fname, int rollno, Address address) {
        this.name = name;
        this.fname = fname;
        this.rollno = rollno;
        this.address = address;
    }

    public void display() {

        System.out.println("Student Name : " + name);
        System.out.println("Student FName : " + fname);
        System.out.println("Student RollNo : " + rollno);
    	System.out.println("");	
    	System.out.println(" depnadency inject by constructore of address ");
    	System.out.println("");
        System.out.println("House No : " + address.getHouseNo());
        System.out.println("City : " + address.getCity());
        System.out.println("PinCode : " + address.getPinCode());
        System.out.println("State : " + address.getState());
    }
}