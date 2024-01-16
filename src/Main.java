public class Main {
    public static void main(String[] args) {
        Studente student1 = new Studente("Claudio", "Gambino", "#001");

        Studente student2 = new Studente("Pinco", "Panco", "#002");

        Studente student3 = new Studente("Panco", "Pinco", "#003");

        //student1.setFirstName("Nicola");     // possiamo modificare ad esempio il nome del primo studente grazie al metodo setters

        Classe classe = new Classe();
        classe.studenti = new Studente[]{student1, student2, student3};

        System.out.println("classe: " + classe);

    }
}
