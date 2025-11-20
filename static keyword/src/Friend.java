public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }
//    static method

static void displayFriends(){
    System.out.println("you have "+numberOfFriends+" friends");
}
}
