package Classes;

import java.util.List;

public class Messege {
    private List<String> messege;

    public Messege(List<String> messege) {
        this.messege = messege;
    }

    public List<String> getMessege() {
        return messege;
    }

    public void setMessege(List<String> messege) {
        this.messege = messege;
    }

    @Override
    public String toString() {
        return "Messege{" +
                "messege=" + messege +
                '}';
    }
}
