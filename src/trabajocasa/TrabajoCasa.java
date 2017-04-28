package trabajocasa;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Borjas
 */
public class TrabajoCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Una referencia es cuando un objeto referencia otro y son igualmente modificados
        Una instancia lleva new... y es algo que crea.
         */
        ArrayList lista = new ArrayList();
        String opcion = "";
        while (!"f".equals(opcion)) {
            opcion = JOptionPane.showInputDialog("a-agregar entero\nb-agregar pizarra"
                    + "\nc-Listar Pizarras\nd-Modificar Pizarra\ne-Eliminar Pizarra"
                    + "\nf-Salir");
            if (opcion.equals("b")) {
                int l, a;
                String t;
                l = Integer.parseInt(JOptionPane.showInputDialog("Ingree Largo"));
                a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Ancho"));
                t=JOptionPane.showInputDialog("Textura");
                lista.add(new Pizarra(l,a,t,Color.white,new Date()));
            }
            if(opcion.equals("c")){
                String s="";
                for (Object t : lista) {
                    if (t instanceof Pizarra ) {
                        s+="\n"+lista.indexOf(t)+" "+t;
                    }
                }
                JOptionPane.showMessageDialog(null, s);
            }
            if(opcion.equals("d")){
                int p;
                p=Integer.parseInt(JOptionPane.showInputDialog("posicion a modificar"));
                int l=Integer.parseInt(JOptionPane.showInputDialog("Nuevo Largo"));
                if(lista.get(p) instanceof Pizarra){
                    ((Pizarra)lista.get(p)).setLargo(l);
                }else{
                    JOptionPane.showMessageDialog(null, "La posicion no es pizarra");
                }
            }
            if(opcion.equals("e")){
                int p;
                p=Integer.parseInt(JOptionPane.showInputDialog("posicion a eliminar"));
                if(lista.get(p) instanceof Pizarra){
                    lista.remove(p);
                }else{
                    JOptionPane.showMessageDialog(null, "La posicion no es pizarra");
                }
            }
        }
    }

}

/*Tarea: 1. Investigar que es Javadoc, elabore una tabla donde enumere todos los
stacks existentes para javadoc y usando un programa, agreguele 10 stacks y genere
el portal de javadocs*/

        /*Pizarra p=new Pizarra();
        Pizarra q = new Pizarra(15,15,Color.BLACK,"Suave",new Date());
        Pizarra []a=new Pizarra[5];
        for (int i = 0; i < 5; i++) {
            a[i]=new Pizarra();
        }
        Pizarra[][]m= new Pizarra[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j]=new Pizarra();
            }
        }
        ArrayList<Pizarra> lista=new ArrayList();
    }
    
    public static Pizarra nuevaP(){
        Pizarra r=new Pizarra();
        return r;
    }
    
    public void algo(Pizarra p4, Pizarra p5){
        System.out.println(p4.getLargo()+p5.getLargo());
        
    }*/
