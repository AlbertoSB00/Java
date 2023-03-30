import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto("nº-0001", LocalDate.of(2022, 3, 9), LocalDate.of(2025, 3, 9), "Ayuda a los niños de Siria", "Con este proyecto se llevará a cabo una serie de ayudas a las fundaciones de niños de Siria.", 1, "Siria", 30000);
        Proyecto proyecto2 = new Proyecto("nº-0002", LocalDate.of(2014, 1, 1), LocalDate.of(2023, 12, 31), "Ayuda a familias de España", "Con este proyecto se llevará a cabo una ayuda a familias españolas durante 9-10 años.", 1, "España", 25000);
        Proyecto proyecto3 = new Proyecto("nº-0003", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31), "Investigación contra el cáncer", "Durante 365 de investigará una cura sobre el cáncer.", 2, "España", 90000);
        Proyecto proyecto4 = new Proyecto("nº-0004", LocalDate.of(2023, 1, 1), LocalDate.of(2025,12,31), "Desarrollo humano", "Durante dos años desarrollaremos muchas cosas.", 3, "España", 200000);

        ONG ong1 = new ONG(1, "Cáritas", "Calle Palomar 24 C", "caritas@ayuda.com", "www.caritas.com", proyecto1);
        ONG ong2 = new ONG(2, "Ayúdame", "Calle Las Palmeras 73", "porfi@ayudamen.com", "www.ayuditapls.com", proyecto2);
        SociedadCientifica sc1 = new SociedadCientifica("14000034F", "Investigamos", "Empresa construida para la investigación.", "Plaza La Uva 24", LocalDate.of(2020, 1, 1), proyecto3);
        SociedadCientifica sc2 = new SociedadCientifica("21000076Y", "Desarrollamos", "Empresa que cree en el desarrollo.", "Plaza Mayor 34", LocalDate.of(2000, 1 , 1), proyecto4);

        System.out.println("El proyecto: " + proyecto1.getTitulo() + ", fue destinado a " + ong1.getNombre() + " en el año " + proyecto1.getFechaInicio().getYear());
        System.out.println("El proyecto: " + proyecto2.getTitulo() + ", fue destinado a " + ong2.getNombre() + " con un presupuesto de " + proyecto2.getPresupuesto() + " €");
        System.out.println("El proyecto: " + proyecto3.getTitulo() + ", fue asignado a " + sc1.getNombre() + ", empresa que: " + sc1.getActividad() + " e inició sus andares el " + sc1.getFechaFundacion());
        System.out.println("El proyecto: " + proyecto4.getTitulo() + ", fue asignado a " + sc2.getNombre() + ", con un presupuesto de " + proyecto4.getPresupuesto() + " €.");

        System.out.println("");

        float costeONG1 = ong1.calcularSubvencion();
        System.out.println("El presupuesto de " + ong1.getNombre() + " para " + proyecto1.getTitulo() + ", es de " + proyecto1.getPresupuesto() + " € y con ayuda de las subvenciones el coste queda en " + costeONG1 + " €.");
        float costeONG2 = ong2.calcularSubvencion();
        System.out.println("El presupuesto de " + ong2.getNombre() + " para " + proyecto2.getTitulo() + ", es de " + proyecto2.getPresupuesto() + " € y con ayuda de las subvenciones el coste queda en " + costeONG2 + " €.");
        float costeSC1 = sc1.calcularSubvencion();
        System.out.println("El presupuesto de " + sc1.getNombre() + " para " + proyecto3.getTitulo() + ", es de " + proyecto3.getPresupuesto() + " € y con ayuda de las subvenciones el coste queda en " + costeSC1 + " €.");
        float costeSC2 = sc2.calcularSubvencion();
        System.out.println("El presupuesto de " + sc2.getNombre() + " para " + proyecto4.getTitulo() + ", es de " + proyecto4.getPresupuesto() + " € y con ayuda de las subvenciones el coste queda en " + costeSC2 + " €.");
    }
}