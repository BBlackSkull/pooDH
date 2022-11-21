public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager("Jorge","Lepiani","420","420420");

        Tradicionales tradiconales = new Tradicionales("20/12/2020","12/12/2020",
                "15/12/22","15/12/20","En Ejecucion",
                projectManager, true);

        System.out.println(tradiconales.fase(true));

    }

}