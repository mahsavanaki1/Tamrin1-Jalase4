package students;

public final class Student {

    private String fullname;
    private String username;
    private String password;

    public Student() {
    }

    public Student(String fullname, String username, String password) {
        setFullname(fullname);
        setUsername(username);
        setPassword(password);
    }

    public String getFullname() {
        return fullname;
    }

    private boolean isHasADigit(String text) throws NumberInStringException {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                throw new NumberInStringException("The Full Name Has at least one Digit!");
            }
        }
        return false;
    }

    private boolean checkLength(String input) throws StringLengthException {
        if (input.length() >= 5) {
            return true;
        } else {
            throw new StringLengthException("Limit Length is: 5!");
        }
    }

    public void setFullname(String fullname) {
        try {
            if (checkLength(fullname) && !isHasADigit(fullname)) {
                this.fullname = fullname;
            }
        } catch (NumberInStringException | StringLengthException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        try {
            if (checkLength(username)) {
                this.username = username;
            }
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            if (checkLength(password)) {
                this.password = password;
            }
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "fullname: " + getFullname() + ", username: " + getUsername() + ", Password: " + getPassword();
    }
}
