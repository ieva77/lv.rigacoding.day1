/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author user
 */
public class LvRigacodingDay1 {

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
       // Square jānorada kāda tipa objekts tas būs 
       // s1 mainīgais pirmais kvadrats
       // noradam ka veidosim jaunu objektu ar šadu tipu 
       // new mūsu konstruktors kas nozīme ka būs japadod divi parametri
       // (5, "krāsa") malas garums un krāsa jāievēro tāda pati 
       // secība malas garums +krasa
       Square s1 = new Square(5, "red");
       Square s2 = new Square(20, "green");
       
       // out bjekts atbild par izvadi
       // println pec izvades pāriet uz nākamo rindiņu
       // izmanto pediņas lai izvadītu tekstu lai apvienotu vairākus 
       // tekstus izmanto + aiz plusa seko operācija krāsu izgūšana
       // 
       System.out.println("Kvadrāta 1 krāsa ir " + s1.getColor());
       System.out.println("Kvadrāta 2 laukums ir" + s2.getArea());
       System.out.println("Kvadrāta 2 perimetrs ir" + s2.getPerimeter());
    }
    
    public static void main(String[] args) {
        // Darbinieka dzīvesvieta
        Address employeeResidence = new Address();
        employeeResidence.country = "Latvia";
        employeeResidence.city = "Riga";
        
        // Nodaļas atrašanās vieta
        Address departmentLocation = new Address();
        departmentLocation.country = "latvia";
        departmentLocation.city = "Ventspils";
        
        Department employeeDepartment = new Department();
        employeeDepartment.name = "IT department";
        employeeDepartment.location = departmentLocation;
        
        // Darbinieks
        Employee employee = new Employee();
        employee.name = "Jānis";
        employee.residence = employeeResidence;
        employee.actualDepartment = employeeDepartment;
        
        System.out.println("Mani sauc" + employee.name + "es dzīvoju" + employee.residence.getFullAddress() + ",");
        
        
        
        
        
        
        
        
        
    }  
}
