
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknameMap = new HashMap<>();

        nicknameMap.put("matthew", "matt");
        nicknameMap.put("michael", "mix");
        nicknameMap.put("arthur", "artie");

        System.out.println(nicknameMap.get("matthew"));

    }

}
