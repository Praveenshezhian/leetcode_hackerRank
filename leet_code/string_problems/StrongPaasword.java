class StrongPassword {
    // Function to check if the password is strong
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8)  return false;
        if(password.contains(" "))  return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialCharacters = "!@#$%^&*()-+";
        

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialCharacters.indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
    // Function to determine the minimum number of characters to add
    public int minimumNumber(String password){
        int count = 0;
        if (!password.chars().anyMatch(Character::isUpperCase)) count++;
        if (!password.chars().anyMatch(Character::isLowerCase)) count++;
        if (!password.chars().anyMatch(Character::isDigit)) count++;
        String specialCharacters = "!@#$%^&*()-+";
        if (!password.chars().anyMatch(ch -> specialCharacters.indexOf((char) ch) != -1)) count++;
        
        int requiredLength = 8 - password.length();
        return Math.max(count, requiredLength);
        
    }
}