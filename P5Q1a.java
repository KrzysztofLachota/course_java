public class P5Q1a {
    
    public static void main(String[] args) {

        class Contact{
        String name;
        String email;
        String phoneNumber;

        Contact (String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phone;
        }
     }
    class ContactsManager {
        // Fields:
        Contact [] myFriends;
        int friendsCount;
     
        // Constructor:
        ContactsManager(){
           friendsCount = 0;
           myFriends = new Contact[500];
        }
     
        // Methods:
        void addContact(Contact contact){
           myFriends[friendsCount] = contact;
           friendsCount++;
        }
     
        Contact searchContact(String searchName){
           for(int i=0; i<friendsCount; i++){
              if(myFriends[i].name.equals(searchName)){
                 return myFriends[i];
              }
           }
           return null;
        }
     }
        
        ContactsManager myContactManager = new ContactsManager();
        
        Contact Contact1 = new Contact("John","john@gmail.com","123-456-789");
        Contact Contact2 = new Contact("Mike","mike@yahoo.com", "231-546-879");
        Contact Contact3 = new Contact("Stive","stivee@msn.com", "312-645-978");
        Contact Contact4 = new Contact("Phil","phil@wp.pl", "132-564-798");

        Contact ContactX = new Contact(null, null, null);

        

        myContactManager.addContact(Contact1);
        myContactManager.addContact(Contact2);
        myContactManager.addContact(Contact3);
        myContactManager.addContact(Contact4);

        ContactX = myContactManager.searchContact("Mike");

        System.out.println("Serching for Mike's phoneNumber");
        System.out.println(ContactX.phoneNumber);
        System.out.println(ContactX.email);




    }
}
