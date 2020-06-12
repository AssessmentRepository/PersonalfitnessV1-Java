package in.personalFitness.entity;

public enum Role {
    Admin, User, Guest;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
