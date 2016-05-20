/**
 * Created by Woo on 2016-05-20.
 */
public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            usage();
            System.exit(0);
        }
        if("plain".equals(args[0])){
            TextBuilder textBuilder = new TextBuilder();
            Director director  = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }else if("html".equals(args[0])){
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + "가 작성되었습니다.");
        }else{
            usage();
            System.exit(0);
        }
    }
    public static void usage(){
        System.out.println("Usage : java Main plain 일반 텍스트로 문서로 작성");
        System.out.println("Usage : java Main html  HTML 파일로 문서로 작성");
    }
}
