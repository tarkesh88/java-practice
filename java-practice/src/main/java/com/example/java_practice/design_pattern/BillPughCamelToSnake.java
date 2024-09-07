package com.example.java_practice.design_pattern;

public class BillPughCamelToSnake {

    private BillPughCamelToSnake(){}

    private static class SingletonHolder {
        private static final  BillPughCamelToSnake INSTANCE = new BillPughCamelToSnake();
    }

    public static BillPughCamelToSnake getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // useLikeThis to use_like_this
    private String convertCamelToSnake(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder snakeCase = new StringBuilder();
        snakeCase.append(Character.toLowerCase(str.charAt(0)));
        for(int i =1;i<str.length();i++) {
            Character c = str.charAt(i);
            if(Character.isUpperCase(c)) {
                snakeCase.append("_");
                snakeCase.append(Character.toLowerCase(c));
            } else {
                snakeCase.append(Character.toLowerCase(c));
            }
        }
        return snakeCase.toString();
    }

    public static void main(String[] args) {

        String str = "convertCamelCaseToSnakeCase";
        BillPughCamelToSnake billPughCamelToSnake = BillPughCamelToSnake.getInstance();
        System.out.println("ans is --> "+billPughCamelToSnake.convertCamelToSnake(str));

    }
}
