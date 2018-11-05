import org.json.simple.JSONObject;
public class User {

    private String name;
    private String email;
    private int age;
    private JSONObject userDetails = new JSONObject();

    public User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
        addToUserDetails();
    }

    private void addToUserDetails() {
        userDetails.put("name", name);
        userDetails.put("age", age);
        userDetails.put("email", email);
    }
}
