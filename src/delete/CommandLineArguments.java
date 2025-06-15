package delete;

public class CommandLineArguments {
    public static void main(String[] args) {
        int length = args.length;
        if (length == 0){
            System.out.println("No Inputes Provided");
        }else{
            System.out.println("list of arguments");
            for(int i = 0; i < length;i++){
                System.out.println(args[i]);
            }
        }

        System.out.println("Command Line Arguments Legnth: "+length);
    }
}
