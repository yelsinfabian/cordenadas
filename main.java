import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import maps.cordenada; 
class Main {

  public static void maps (){
  }
public static void main(String[] args) {
ArrayList<cordenada> lista = new ArrayList<cordenada>();
   Scanner escaner = new Scanner(System.in);
   boolean r = true;
while(r) {

cordenada o = new cordenada();
System.out.println("\n ingresar cordenadas ");
System.out.print("latitud: ");
o.lat = escaner.nextLine();
System.out.print("longitud: ");
o.lonj = escaner.nextLine();
lista.add(o);
System.out.println("¿Desea ingresar otra coordenada? 0(no) 1(si) ");
int seguir = escaner.nextInt();
escaner.nextLine();
if(seguir == 0){
r = false;
escaner.close();
}
}

String urlBase = "https://www.keene.edu/campus/maps/tool/?coordinates=";
String medio = "%2C%20";
String otracordenada = "%0A";
for(int i = 0; lista.size() > i; i++){
if(i==0){
urlBase = urlBase + lista.get(i).lat + medio + lista.get(i).lonj;
}
if(i>0){
urlBase = urlBase + otracordenada + lista.get(i).lat + medio + lista.get(i).lonj;
}
}
System.out.println("\n!Gracias ya se genero su coordenada \n");
System.out.println(urlBase);
    
    

  

   if (java.awt.Desktop.isDesktopSupported()){
       java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

       if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
         try {
           java.net.URI uri =  new java.net.URI(urlBase);
           desktop.browse(uri);
         } catch(URISyntaxException | IOException ex){}
       }
     }

  }
}