package poop2;
public class POOP2 {
    public static void main(String[] args) {
        int a=55, b=36;
        System.out.println("a= "+a);
        System.out.println("b= "+b);  
    if(a<b){
        System.out.println("a<b");     
    }else{
        System.out.println("a>=b");}
    if (f(a,b))
            System.out.println("f regresa true");
    else 
            System.out.println("f regresa false");
    if(a<b){
    System.out.println("a<b"); 
    if (a<=b)
            System.out.println("a<=b");
    else if(a<=b)
            System.out.println("a<=b");
    else 
         System.out.println("a>b");
    }
         KeyboardInput teclado= new KeyboardInput();
        System.out.println("Escriba un numero entre 1 y 7: ");
        int dia = teclado.readInteger();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un dia de la semana");
                break;
        }
        
        int []x= new int [15];
    for (int i=0; i<15; i++){
        x[i]=i;
        System.out.println(x[i]);
    }
        System.out.println("Ahora viene el segundo for");
    for (int i=0; i<15; i++)
        System.out.println(x[i]);
        System.out.println("Hola"); 
        
int i=0, var=5;
while(i<var){
    System.out.println("Contando hacia arriba "+i);
    i++;
}System.out.println(i);
while(i>0){
    System.out.println("Contando hacia abajo "+ i);
    i--;
} System.out.println(i);
do{
    System.out.println("Contando hacia abajo " +i);
    i--;
}while(i>0);
        System.out.println(i); 
for (int j=0; j<5; j++){
    System.out.println("Escoja un numero: ");
    int numero= teclado.readInteger();
    if(numero==0){
        System.out.println("Division entre cero");
        continue;}
    System.out.println("100/" +numero+"= " +100/numero);
}System.out.println("Bandera");
}
  public static boolean f(int x, int y){
   return(x<y);
    }}
   
   