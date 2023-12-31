package org.sopt.tcs.ch2;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s) {
        if(s == null || s.isEmpty()) return PasswordStrength.INVALID;
        if (s.length() < 8) {
            return PasswordStrength.NORMAL;
        }
        if(!meetsContainingNumberCriteria(s)) {
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }
    private boolean meetsContainingNumberCriteria(String s) {
        for (char ch : s.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }
}
