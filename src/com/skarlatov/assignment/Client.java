package com.skarlatov.assignment;
//TODO MAKE THE OUTPUT OF THIS LOOK NICER
public class Client {
    public static void main(String[] args){
        //make new dean
        FacultyComponent deanObj = new Dean("Bender Bending Rodriguez", "technology", "computer science", 120000 );

        FacultyComponent chairCS = new ChairPerson("hubert farnsworth", "computer sciente","degree in something",1111);
        FacultyComponent chairMath = new ChairPerson("Phillip j Fry", "math dept","degree in something",1111);


        FacultyComponent csProf1 = new Professor("A","adjunct",1234);
        FacultyComponent csProf2 = new Professor("b","full",1234);
        FacultyComponent csProf3 = new Professor("c","B",1234);

        FacultyComponent mathProf1 = new Professor("d","assistant professor",1234);
        FacultyComponent mathProf2 = new Professor("e","full professor",1234);

        deanObj.add(chairCS);
        deanObj.add(chairMath);


    }

}
