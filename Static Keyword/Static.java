public class Static{ 
    //int a = 0; //cannot be  accesable by main
     static int a = 0; //accesbale by main 
    
    public static void main(String[] args){
        int b=3;
        //other option creating objects 
        //Static s = new Static();
        //System.out.println(s.a);
        System.out.println(a);
        //therefore static is there which means easy way to access global var inside main function
    }
}