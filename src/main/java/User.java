import org.json.simple.JSONObject;
public class User {

    private String name;
    private String email;
    private int age;
    public JSONObject userDetails = new JSONObject();

    public User(String name, int age, String email){

        userDetails.put("name", this.name = name);
        userDetails.put("age", this.age = age);
        userDetails.put("email", this.email = email);
    }
}
