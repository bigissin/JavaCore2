package hw8_z;

public class PatientInfo {
    public String name;
    public String lastName;
    public String dateOfBirth;
    public String gender;
    public int age;
    public double treatmentDuration;

    public void recovering(){
        System.out.println(name + " "+ lastName + " is recovering");
    }
    public void notrecovering(){
        System.out.println(name + " "+ lastName + " is not recovering, he is in stagnation");


        }
    public void currentStatus(){
        System.out.println(name+" "+lastName+" after "+ treatmentDuration+ " months was released from our Clinic");
    }
    public void treatment(){
        System.out.println(name+" "+lastName+" passes treatment in our Clinic");
    }

}

