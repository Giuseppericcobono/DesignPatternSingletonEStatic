//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video

public class Main {

    private static User user;

    private static User getUser() {
        if (user == null) {
            user = new User("Giuseppe", 28);
        }
        return user;
    }

    public static void main(String[] args) {

        User user1 = getUser();
        user1.stampaInformazioni();
        System.out.println();

        User user2 = getUser();
        user2.setName("Francesco");
        user2.setAge(18);

        user2.stampaInformazioni();
    }

}
