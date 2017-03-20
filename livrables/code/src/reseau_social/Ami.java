package reseau_social;

public class Ami {
    private String friendFirstName;
    private String friendLastName;

    public String getFriendFirstName() {
        return friendFirstName;
    }

    public void setFriendFirstName(String friendFirstName) {
        this.friendFirstName = friendFirstName;
    }

    public String getFriendLastName() {
        return friendLastName;
    }

    public void setFriendLastName(String friendLastName) {
        this.friendLastName = friendLastName;
    }
    
    public Ami(String nomAmi, String prenomAmi) {
        friendFirstName = prenomAmi;
        friendLastName = nomAmi;
    }
}
 


