public class Process {
    public int getSumAB (Input input) {
        return input.getNumberA() + input.getNumberB();
    }

    public int sumAA (Input input) {
        return input.getNumberA() + input.getNumberA();
    }

    public int subtraction (Input input) {
        return input.getNumberB() - input.getNumberA();
    }

    public int sumAndSub (Input input) {
        return (input.getNumberA() + input.getNumberB()) - input.getNumberB();
    }
}
/*จงเขียนโปรแกรมด้วยภาษา Java ทำการเก็บค่า 1 , 2 , 3 , A , B  และ ให้นำค่าในตัวแปรแสดงผลออกทางจอภาพตามตัวอย่าง
(ต้องเว้นบรรทัดและเคาะวรรคตามตัวอย่าง)

Enter Number A : 1
Enter Number B : 2
A + B : 1 + 2 = 3
A + A : 1 + 1 = 2
(B - A) : 2 - 1 = 1
(A + B - 2 : (1 + 2) - 2 = 1*/