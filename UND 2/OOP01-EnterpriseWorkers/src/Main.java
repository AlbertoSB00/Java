import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Employee 1.

        // We use the constructor.
        Employee e1 = new Employee("30000000A", "Joel", "Miller", LocalDate.of(1992, 3, 23));

        // We assign a department.
        e1.setDepartment("Sales");

        System.out.println("1.- The worker is " + e1.getName() + " " + e1.getSurname() + ", her id card is " + e1.getIdCard() + " and her birth date is " + e1.getBirthDate());

        // We use the constructor.
        e1.setAddress( new Address("St", "Wembley", 12, "1096", "19245", "York"));

        System.out.println("2.- The address is: ");
        System.out.println("2.- " + e1.getAddress().getNumber() + " " + e1.getAddress().getName() + " " + e1.getAddress().getVieType());
        System.out.println("2.- " + e1.getAddress().getZipCode() + " " + e1.getAddress().getNumber());

        // We use
        int age = e1.getAge();
        System.out.println("3.- The " + e1.getName() + "'s age is " + age);

        // e1.payableData = new PayableData();
        e1.setPayableData(new PayableData(LocalDate.of(1999, 12, 5), "Comercial", 2000f));

        // e1.payableData.membershipDate = LocalDate.of(2010, 12, 10);
        int timeService = e1.getPayableData().getTimeService();
        System.out.println("4.- The age is " + age + " and the time service " + timeService + " years.");

        // Employee 2.
        int trienium = e1.getPayableData().getTrienium();
        int sixYearsTerm = e1.getPayableData().getSixYearsTerm();
        System.out.println("5.- The trienium is " + trienium + " and the six years term is " + sixYearsTerm);

        Employee e2 = new Employee("31000000B", "Alberto", "Sanchez", LocalDate.of(2000, 11, 12));
        e2.setAddress(new Address("Sg", "Trafalgar", 5, "2B", "01100", "London"));

        System.out.println("6.- " + e2.getName() + " " + e2.getSurname() + " is the name of the worker.");

        e2.setPayableData(new PayableData(LocalDate.of(1999, 12, 5), "Comercial", 2500f));

        // e2.birthDate = LocalDate.of(2000, 12, 12);

        e2.setDepartment("Purchase");

        int age2 = e2.getAge();
        e2.setActive(true);
        if( e2.isActive()){
            System.out.println("7.- The " + e2.getName() + "'s age is " + age2);
        }

        if( e1.isSameDepartment(e2) ){
            System.out.println("8.- E1 and E2 belong to the same department.");
        }
        else{
            System.out.println("8.- E1 and E2 are in different department.");
        }

        if ( e1.getPayableData().isSameTimeService(e2.getPayableData()) ){
            System.out.println("9.- " + e1.getName() + " has the same time service than " + e2.getName());
        }
        else {
            System.out.println("9.- They both doesn't have the same time service.");
        }

        if ( e1.getPayableData().isSameTimeService(e2) ){
            System.out.println("10.- " + e1.getName() + " has the same time service than " + e2.getName());
        }
        else {
            System.out.println("10.- They both doesn't have the same time service.");
        }

        LocalDate anotherMembershipDate = LocalDate.of(2001, 7, 31);
        if ( e2.getPayableData().isSameTimeService(anotherMembershipDate) ){
            System.out.println("11.- It's the same time service.");
        }
        else {
            System.out.println("11.- It's not the same time service.");
        }

        // Employee 3 using second constructor.
        Employee e3 = new Employee("30000005C", "Juan", "Castro Blancat", LocalDate.of(2001, 9, 23), new Address("St", "Mayor", 3, "15A", "14000", "Cordoba"));

        // Employee 4 using second constructor using variables.
        Address addressE4 = new Address("Rd", "Carbonel", 0, "2", "14000", "Córdoba");
        Employee e4 = new Employee("30000004D", "Sara", "González Pérez", LocalDate.of(1990, 12, 6), addressE4);

        // Sales Agent 1 using second constructor using variables.
        Address addressSA1 = new Address("c/", "Palomar", 2, "15A", "14010", "Córdoba");
        PayableData payableDataSA1 = new PayableData(LocalDate.of(2000, 5, 30), "Big Enterprises", 4000f, 35950f, 400180f, 1100f, 0.01f);
        SalesAgent sa1 = new SalesAgent("30000031H", "Juan", "Mordekaiser Lux", "Andalucía", addressSA1, payableDataSA1);

        // Show some messages.
        System.out.println("12.- Sales Agent Name -> " + sa1.getName() + " " + sa1.getSurname());

        // Let's see the first employee.
        System.out.println(e1);

        // Let's see the address of the second employee
        System.out.println(e2.getAddress());

        System.out.println(e1.getName());

        Address a1 = null;
        e1.setAddress(a1);
        // System.out.println(e1.getAddress().getName());

        PayableData payableDataE1 = e1.getPayableData();
        payableDataE1.getTrienium();

        // Accessing to the static propierties of the class.
        System.out.println("13.- The PIT is: " + payableDataE1.PIT);
        System.out.println("13.- The NI is: "+ payableDataE1.NI);

        System.out.println("13.- The PIT with the class is " + PayableData.PIT);
        System.out.println("13.- The NI with the class is " + PayableData.NI);

        PayableData.showPIT();

        PayableData.showNI();

        // Object clones.
        Employee e5 = e1;
        System.out.println("14.- The name is " + e1.getName());
        System.out.println("14.- The name is " + e5.getName());

        e1.setName("José");
        System.out.println("15.- The name is (e5) " + e5.getName());

        if( e1 == e5 ){
            System.out.println("16.- They are pointing to the same object.");
        }

        Employee e6 = e1.copyEmployee();

        System.out.println("17.- The name is " + e1.getName());
        System.out.println("17.- The name is " + e6.getName());
        e1.setName("Pepe");
        System.out.println("18.- The name is " + e1.getName());
        System.out.println("18.- The name is " + e6.getName());

        if( e1 == e6 ){
            System.out.println("19.- e1 and e6 point to the same object.");
        }
        else {
            System.out.println("19.- e1 and e6 are different objects.");
        }

        Address a2 = new Address("St", "Mayor", 3, "15G", "14000", "Córdoba");
        Address a3 = a2.clone();
        System.out.println("20.- " + a2);
        System.out.println("20.- " + a3);

        a2.setName("20.- Arcos de la frontera");
        System.out.println("20.- " + a2);
        System.out.println("20.- " + e3);

        if( a2 == a3 ){
            System.out.println("21.- a2 and a3 are the same object.");
        }
        else {
            System.out.println("22.- e2 and e3 are different.");
        }

        System.out.println("23.- " + sa1);

        // We use an interface reference to save an object.
        PayableData pdEmp1 = new PayableData(LocalDate.of(2000, 01, 23), "Jefe de departamento", 2000);
        CalculateSalary emp1 = new Employee("30000009A", "Javier", "López Pérez", LocalDate.of(1980, 05, 30), pdEmp1);

        PayableData pdSag1 = new PayableData(LocalDate.of(2001, 04, 12), "Comercial", 1500);
        pdSag1.setObjectiveSalesPerMonth(10000f);
        pdSag1.setPercentageCommission(0.10f);
        pdSag1.setSaleLastMonth(12000f);
        CalculateSalary sag1 = new SalesAgent("30000009J", "María", "Díaz Castro", "Madrid", new Address("St", "Palomares", 24, "15C", "14014", "Córdoba"), pdSag1);
        

        emp1.calculateGrossSalary(pdEmp1);
        sag1.calculateGrossSalary(pdSag1);

        System.out.println("24.- " + pdEmp1.getGrossSalary());
        System.out.println("24.- " + pdSag1.getGrossSalary());

        emp1.calculateIncentive(pdEmp1);
        sag1.calculateIncentive(pdSag1);
    }
}