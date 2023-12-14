class 신규아이디추천_김현지 {
    public String solution(String newId) {
        
        newId = changeToLowerCase(newId);
        newId = removeAllOtherSymbol(newId);
        newId = abbreviatePeriod(newId);
        newId = removePeriodStartEnd(newId);
        newId = addIfNull(newId);
        newId = removeLongerThan16(newId);
        newId = addIfShort(newId);
      
        return newId;
    }
    
    private String changeToLowerCase(String newId) {
        newId  = newId.toLowerCase();
    
        return newId;
    }
    
    private String removeAllOtherSymbol(String newId) {
        String match = "[^a-z0-9\\-_.]";
        newId = newId.replaceAll(match, "");
        return newId;
    }
    
    private String abbreviatePeriod(String newId) {
        newId = newId.replaceAll("\\.+", ".");
        
        return newId;
    }
    
    private String removePeriodStartEnd(String newId) {        
        newId = newId.replaceAll("^\\.+|\\.+$", "");
        
        return newId;
    }
    
    private String addIfNull(String newId) {
        if (newId == "") {
            newId = "a";
        }
        
        return newId;
    }
    
    private String removeLongerThan16(String newId) {
        if (16 <= newId.length()) {
            newId = newId.substring(0, 15);
            if (newId.charAt(newId.length() - 1) == '.') {
                newId = newId.substring(0, 14);
            }
        }
        
        return newId;
    }
    
    private String addIfShort(String newId) {
        if (newId.length() == 0) {
            return "aaa"; 
        }
        
        while (newId.length() < 3) {
                newId += newId.charAt(newId.length() - 1);
        }
        
        return newId;
    }
}