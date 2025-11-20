
public class Main {
    public static void main(String[] args) {
//static keyword
        Friend friend =new Friend("Sponegbob");
        Friend friend1 =new Friend("bob");
        Friend friend2 =new Friend("Sponeg");

        System.out.println(Friend.numberOfFriends); //static access of objects
//        System.out.println(friend1.numberOfFriends); not static
//Calling  a static method
        Friend.displayFriends();
    }
}