/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 14/02/2022
 */

package hospital;

abstract class Hospital {
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}

class MyHospital extends Hospital
{
     MyHospital()
     {

         System.out.println("My Hospital");
     }
    @Override
    void emergency() {
        System.out.println("Emergency");
    }

    @Override
    void appointment() {
        System.out.println("appointment");
    }

    @Override
    void admit() {
        System.out.println("admit");
    }

    @Override
    void billing() {
        System.out.println("billing");
    }
}