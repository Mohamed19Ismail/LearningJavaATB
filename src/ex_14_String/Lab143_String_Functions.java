package ex_14_String;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Ismail";
        System.out.println(name.length()); //length
        System.out.println(name.charAt(3)); // character position
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));


        System.out.println(name.concat("Sarjun")); //adding at last in string
        System.out.println(name.contains("mail")); //check for contains in string
        System.out.println(name.equals("Ismail")); //check for the content
        System.out.println(name.equalsIgnoreCase("ismail"));
        System.out.println(name.indexOf('m')); //check for the index position
        System.out.println(name.lastIndexOf("l"));//check for the last index position
        System.out.println(name.replace('s','S')); //replace the character with new char in string

        String name1  = "ismail19mba@gmail.com";
        String[] sliptname = name1.split("@"); // split the String and store in array

        System.out.println(sliptname);
        System.out.println(sliptname[0]);
        System.out.println(sliptname[1]);

        String Palindrom = "Niagara. O roar again !";
        String extract = Palindrom.substring(11,15);
        System.out.println(extract);

        String extractName = name.substring(1,5);
        System.out.println(extractName);

        String firstname = "Mohamed";
        String secondname = " Ismail";

        System.out.println(firstname + secondname);



    }
}
