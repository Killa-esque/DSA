// public class Student {
//     private String name;
//     private double math, program, DSA1;

//     public Student(){
//         this("Vinh", 0.0, 0.0, 0.0);
//     }

//     public Student(String name, double math, double program, double DSA1) {
//         this.name = name;
//         this.math = math;
//         this.program = program;
//         this.DSA1 = DSA1;
//     }

//     public double average (){
//         return (math + program + DSA1)/3;
//     }

//     public String toString(){
//         return "Name: " + name + "\nMath: " + math + "\nProgram: " + program + "\nDSA1: " + DSA1;
//     }
// }
class Student {
    private String name;
    private double math, program, DSA1;

    public Student() {
        this("Vinh", 0.0, 0.0, 0.0);
    }

    public Student(String name, double math, double program, double DSA1) {
        this.name = name;
        this.math = math;
        this.program = program;
        this.DSA1 = DSA1;
    }

    public double average() {
        return (math + program + DSA1) / 3;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nMath: " + math + "\nProgram: " + program + "\nDSA1: " + DSA1;
    }

}